import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CalculateSongWords {
    public static void main(String[] args) throws Exception {
        Path song = Paths.get("/Users/evgeniyatyutyunik/IdeaProjects/Automation/HM10/src/Song.txt");

        BufferedReader reader = new BufferedReader(new FileReader(song.toFile()));

        Map<String, Integer> frequency = new HashMap<>();
        String line = reader.readLine();

        while(line != null) {
            System.out.println("Processing line: " + line);
            if(!line.trim().equals("")) {
                String[] words = line.split(" ");
                for(String word: words) {
                    if(word == null || word.trim().equals("")) {
                        continue;
                    }
                    String processed = word.toLowerCase();
                    processed = processed.replace(",", "");
                    if(frequency.containsKey(processed)) {
                        frequency.put(processed, frequency.get(processed) + 1);
                    } else {
                        frequency.put(processed, 1);
                    }
                }
            }

            line = reader.readLine();
        }
        System.out.println(frequency);

        int mostFrequentlyUsedWord = 0;
        String freqWord = null;
        for(String word: frequency.keySet()) {
            Integer number = frequency.get(word);
            if (number > mostFrequentlyUsedWord) {
                mostFrequentlyUsedWord = number;
                freqWord = word;
            }
        }
        System.out.println();
        System.out.println("The word " + freqWord + " is used " + mostFrequentlyUsedWord + " times");
    }
}
