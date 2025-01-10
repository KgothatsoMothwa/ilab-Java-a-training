package Chapter6;

import java.util.Arrays;

public class DebugExercise6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // fixed here
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        System.out.println("Full array: " + Arrays.toString(numbers));
    }
}
