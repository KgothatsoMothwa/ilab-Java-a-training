package Chapter5;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arNumbers = {1,2,3,2,5,4,7,8,9};
        searchForNumber(9,arNumbers);

        String[] arNames = {"Kgothatso", "Clara", "Kea"};
        
        
        System.out.println("Highest: " + getHighest(arNumbers));
        System.out.println("lowest: " + getLowest(arNumbers));
        System.out.println("lowest: " + getMost(arNames));

    }
    static void searchForNumber(int num, int [] ar){
        for (int i = 0; i < ar.length; i++) {
            if (num == ar[i]){
                System.out.println("Number: " + num + " found at position " + i);
                break;
            }
        }

    }
    static int getHighest(int [] ar){
        int max=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max){
                max =ar[i];
            }

        }
        return max;
    }
    static int getLowest(int[] ar){
        int lowest = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < lowest)
                lowest = ar[i];

        }
        return lowest;
    }
    //CREATE A METHOD THAT WILL RETURN ARRAY WITH MOST NAMES 
    static String getMost(String[] ar){
        int max = ar[0].length();
        String name = " ";
        for (int i = 0; i < ar.length; i++)
            if (max <= ar[i].length()) {
                max = ar[i].length();
                name = ar[i];
            }
        return name;
    }
}
