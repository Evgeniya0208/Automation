//task 3

public class StringInTag {
    public static void main(String[] args) {
        String tag1 = "<i>";
        String tag2 = "</i>";
        String word = "Hello";

        StringBuilder wrappedWord = new StringBuilder();
        wrappedWord.append(word);
        wrappedWord.append(tag2);
        wrappedWord.insert(0, tag1);
        System.out.println(wrappedWord);
    }
}
