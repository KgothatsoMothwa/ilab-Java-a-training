package Chapter5;

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
       final int SIZE = 3;


        int [] arTestMarks = new int[SIZE];
        String [] arStNames = new String[SIZE];

        Scanner sc = new Scanner(System.in);

        String name;
        int TestMarks;

        for (int i =0; i < SIZE; i++){
            System.out.print("Enter name for student: " + (i+1) + " ");
            name = sc.next();
            arStNames[i] = name;


            System.out.print("Enter your test mark: " + name + " ");
            TestMarks = sc.nextInt();
            arTestMarks[i] = TestMarks;


        }



    }

}
