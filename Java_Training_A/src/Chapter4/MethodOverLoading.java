package Chapter4;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(calcSum(1,2,3));
        System.out.println(calcSum(2.8f,3.4f));
        System.out.println(calcSum(2.5,3.6));
        System.out.println("Total: " + sum(1,2,3,4,5,6,7,8,9,7,8,7,8,7));


    }
    static  int calcSum(int x, int y, int z){
        return x+y+z;
    }
    static int calcSum(int num1, int num2){
        return (int) (float) ((double) num1+num2);
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
    //calculate the sum of any numbers of integer

    static int sum(int... numbers){
        int total = 0;

        for (int num : numbers){
            total+=num;
        }
        return total;

    }
    static void formatNames(String... names){
        for (String name : names){
            System.out.println(names);
        }
    }
}
