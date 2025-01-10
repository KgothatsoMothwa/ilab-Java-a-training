package Chapter5;

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        final int SIZE = 3;

        int[] arTestMarks = new int[SIZE];
        String[] arStNames = new String[SIZE];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            // Input student name
            System.out.print("Enter name for student " + (i + 1) + ": ");
            arStNames[i] = sc.next();

            // Input test marks with validation
            int testMarks;
            while (true) {
                System.out.print("Enter test mark for " + arStNames[i] + ": ");
                testMarks = sc.nextInt();
                if (testMarks >= 0 && testMarks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            }
            arTestMarks[i] = testMarks;
        }

        sc.close();

        // Display entered data
        System.out.println("\nStudent Marks:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(arStNames[i] + ": " + arTestMarks[i]);
        }
    }
}
