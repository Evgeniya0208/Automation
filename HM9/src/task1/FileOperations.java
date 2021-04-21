package task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        if(!Files.exists(Paths.get("/Users/evgeniyatyutyunik/Downloads/JavaFile1.txt"))) {
                Path testFile2 = Files.createFile(Path.of("/Users/evgeniyatyutyunik/Downloads/JavaFile1.txt"));
        } else {
            System.out.println("File already exists");
        }

        Path file1 = Paths.get("/Users/evgeniyatyutyunik/Downloads/JavaFile1.txt");
        Path file1Name = file1.getFileName();
        System.out.println(file1Name + " is created");

        Path parent = file1.getParent();
        System.out.println(parent);

        Path root = file1.getRoot();
        System.out.println(root);

        boolean endWithTxt = file1.endsWith("Downloads/JavaFile1.txt");
        System.out.println(endWithTxt);

        boolean startsWithTxt = file1.startsWith("/Users/evgeniyatyutyunik");
        System.out.println(startsWithTxt);

        System.out.println(file1.isAbsolute());

        String textToWrite = "Hello Java";

        Files.writeString(file1, textToWrite, StandardCharsets.ISO_8859_1);
        //Files.write(file1, textToWrite.getBytes(StandardCharsets.UTF_8)); //is suitable too

        Stream<String> stream = Files.lines(file1);
        List<String> result = stream
                .collect(Collectors.toUnmodifiableList());
        result.forEach(System.out::println);


        file1 = Files.copy(file1, Paths.get("/Users/evgeniyatyutyunik/Downloads/JavaFile2.txt"));

        Files.delete(Paths.get("/Users/evgeniyatyutyunik/Downloads/JavaFile1.txt"));
        System.out.println("Файл  JavaFile1 существует?");
        System.out.println(Files.exists(Paths.get("/Users/evgeniyatyutyunik/Downloads/JavaFile1.txt")));

    }
}
