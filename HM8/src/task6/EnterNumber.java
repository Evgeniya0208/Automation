package task6;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class EnterNumber {
    public static void pressKeyword() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number");
        String s = in.next();
        try {
        if (s.matches("[0-9]+")) {
            System.out.println("thank you");
        } else throw new Exception("Number is required");
            } catch (Exception e) {
            System.out.println("Number wasn't entered");
            System.out.println(s);
        }
    }
}
