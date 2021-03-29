//task 5

import java.util.Locale;

public class StringRemoveVowels {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJK";
        letters = letters.toLowerCase(Locale.ROOT);
        System.out.println(letters);
        String[] vowels = {"a", "o", "e", "y", "i"};
        for(int i = 0; i < vowels.length; i++) {
            if (letters.contains(vowels[i])) {
                letters = letters.replace(vowels[i], "");
            }
        }
        System.out.println(letters);
    }
}
