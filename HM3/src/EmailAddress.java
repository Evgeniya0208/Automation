import java.util.Locale;

//task 7

public class EmailAddress {
    public static void main(String[] args) {
        String email = "john_smith@example.com";
        int dog = email.indexOf("@");
        String login = email.substring(0, dog);
        String domain = email.substring(dog+1, email.length());
        System.out.println("Login is: " + login);
        String login2 = login.replace("_", " ");
        System.out.println("Name is: " + login2);
        System.out.println("Domain is: " + domain);

        int space = login2.indexOf(" ");
        String nameFirstLetter = login2.substring(0, 1);
        String nameRemainLetters = login2.substring(1, space);
        String surnameFirstLetter = login2.substring(space + 1, space + 2);
        String surnameRemainLetters = login2.substring(space + 2, login2.length());
        nameFirstLetter = nameFirstLetter.toUpperCase();
        surnameFirstLetter = surnameFirstLetter.toUpperCase();
        String capitalizedName = nameFirstLetter + nameRemainLetters + " " + surnameFirstLetter + surnameRemainLetters;

        System.out.println("Name with capitalized first letters is: " + capitalizedName);
    }
}
