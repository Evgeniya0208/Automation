//task 1

public class FirstNameLastName {
    public static void main(String[] args) {
        String firstName1 = "Den";
        String lastName1 = "Brown";
        String fullName = "-" + firstName1 + "=" + lastName1 + "-";
        System.out.println(fullName);

        StringBuilder fullName2 = new StringBuilder();
        fullName2.append(firstName1);
        fullName2.append(lastName1);
        fullName2.insert(0, "-");
        fullName2.insert(4, "=");
        fullName2.insert(10, "-");
        System.out.println(fullName2);
    }
}

