package Chapter4;

/*Methods with return type will return the value back
* to the caller.*/

public class ReturnTypeMethods {
    static double RATE = 0.03;
    public static void main(String[] args) {
        String msg = getMessage();
        System.out.println(msg);
        System.out.println(isEven());
        System.out.println(calcSalary());
    }
    static String getMessage(){


        return "Hello, World!";
    }
    static int getSum(){
        int sum = 0, num1, num2;
        num1 = 5;
        num2 =6;
        sum = num1 +num2;

        return sum;
    }

    static double calcSalary(){
        int hoursWorked = 50;
        return hoursWorked * RATE;
    }
    static boolean isEven(){
        int num = 10;

        return (num % 2 == 0);
    }
}
