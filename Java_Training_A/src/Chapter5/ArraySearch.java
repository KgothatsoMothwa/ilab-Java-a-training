package Chapter5;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arNumbers = {1, 2, 3, 2, 5, 4, 7, 8, 9};
        searchForNumber(9, arNumbers);

        String[] arNames = {"Kgothatso", "Clara", "Kea"};

        System.out.println("Highest: " + getHighest(arNumbers));
        System.out.println("Lowest: " + getLowest(arNumbers));
        System.out.println("Most characters: " + getMost(arNames));
    }

    static void searchForNumber(int num, int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (num == ar[i]) {
                System.out.println("Number: " + num + " found at position " + i);
                return; //
            }
        }
        System.out.println("Number: " + num + " not found in the array.");
    }

    static int getHighest(int[] ar) {
        int max = ar[0]; // Initialize to the first element
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    static int getLowest(int[] ar) {
        int lowest = ar[0]; // Initialize to the first element
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < lowest) {
                lowest = ar[i];
            }
        }
        return lowest;
    }

    static String getMost(String[] ar) {
        int max = ar[0].length();
        String name = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i].length() > max) {
                max = ar[i].length();
                name = ar[i];
            }
        }
        return name;
    }
}
