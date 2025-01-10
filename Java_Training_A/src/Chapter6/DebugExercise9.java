package Chapter6;

import java.util.Scanner;

public class DebugExercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character"); //fixed here
        String s = scanner.next();
        scanner.close();


        // fixed here - Ensure the string has at least 7 characters (index 6 is the 7th character)
        if (s.length() >= 7) {
            char c1 = s.charAt(1); // Second character
            char c2 = s.charAt(4); // Fifth character
            char c3 = s.charAt(6); // Seventh character

            System.out.println("" + c1 + c2 + c3);
        } else {
            System.out.println("Invalid indices");
        }
    }
}
