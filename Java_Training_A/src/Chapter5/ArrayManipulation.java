package Chapter5;

import java.util.ArrayList;
import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] randomNumbers = new int[20];
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        Random rand = new Random();


        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(66) + 10; // 66 is the range (75 - 10 + 1)
        }


        for (int num : randomNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);


            } else {
                oddNumbers.add(num);

            }
            System.out.println("Even numbers"+ evenNumbers + " ");
            System.out.println("Odd numbers"+ oddNumbers + " ");
        }
//        System.out.println();
    }



}
//int x = new Random(3);
//System.out.printIn(x)