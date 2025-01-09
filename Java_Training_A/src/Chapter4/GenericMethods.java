package Chapter4;

public class GenericMethods {
    public static void main(String[] args) {
        displayNumbers( 5.9,  9.8);
        GenericMethods.<Integer>displayNumbers(4,6);
        GenericMethods.<Float>displayNumbers(5.2F,9.5F);
        GenericMethods.<String>displayNumbers("Blue", "Innocent");

    }
    static <T> void displayNumbers(T num1, T num2){
        System.out.println("num1: " + num1 + " Num2: " +num2);
    }


    static int calcSum(int num1, int num2){
        return  num1+num2;
    }

    /*Create methods to calculate
     * 1 - sum of two integers
     * 2 - sum of two doubles
     * 3 - sum of two floating point numbers*/

    //1
    static double calcSum(double num1, double num2){
        return  (num1+num2);
    }
    static float calcSum(float num1, float num2){
        return num1+num2;
    }
}
