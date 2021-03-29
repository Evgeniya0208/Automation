//task 2

public class NewStringFromOtherString {
    public static void main(String[] args) {
        String anyString = "abcbgf";

        if(anyString.isEmpty()) {
            System.out.println("Empty string");
        }
            else if (anyString.length()>=2) {
                String twoLettersString = anyString.substring(0, 2);
                System.out.println(twoLettersString);
        }
            else {
                String oneLetterString = anyString.substring(0, 1);
                System.out.println(oneLetterString);
        }

    }
}
