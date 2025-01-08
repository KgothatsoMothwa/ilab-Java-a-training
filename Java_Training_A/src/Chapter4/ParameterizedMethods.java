package Chapter4;

public class ParameterizedMethods {
    public static void main(String[] args) {
        displayMessage("Hello, World");
//        display("Hi");
        display("Sum : " + calcSum(5,2,5));

        display(getDay(2));
    }
    static void displayMessage(String msg){
        System.out.println(msg);
    }
    static void display(String msg){
        System.out.println(msg);
    }
    static int calcSum(int num1, int num2, int num3){
        return num1 + num2 +num3;
    }
    static String getDay(int dayNumber){
        String dayOfWeek = "none";

        switch (dayNumber){
            case 1 : dayOfWeek = "Monday";
                break;
            case 2 : dayOfWeek = "Tuesday";
                break;
            case 3 : dayOfWeek = "Wednesday";
                break;
            case 4 : dayOfWeek = "Thursday";
                break;
            case 5 : dayOfWeek = "Friday";
                break;
            case 6 : dayOfWeek = "Saturday";
                break;
            case 7 : dayOfWeek = "Sunday";
                break;
            default:dayOfWeek = "Invalid";

        }
        return dayOfWeek;
    }

}
