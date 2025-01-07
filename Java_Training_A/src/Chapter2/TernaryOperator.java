package Chapter2;

public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? valueWhenTrue : valueWhenFalse
        int age = 25;

//        if (age>=18){
//            System.out.println("Eligible to vote");
//        }else{
//            System.out.println("User cannot vote");
//        }
        if (age >=18){
            System.out.println((age>=18) ? "Can vote": "Cannot vote");
        }
        System.out.println("=======================================");
        int num = 9;
        String results = "unknown";
//        if (num % 2 == 0){
            results = num % 2 == 0 ? "Even" : "Odd";
//        }
//        else{
//            results = "Odd";
//        }
        System.out.println(results);

        //targetVariable = condition ? trueValue : falseValue;

        System.out.println("=======================================");
        int number = 25;
//        if (number % 2 == 0){
//            results = "Even";
//        } else if (number % 3 == 0) {
//            results = "Multiple of 3";
//
//        } else if (number % 5 == 0) {
//            results = "Multiple of 5";
//
//        }else {
//            results = "Odd";
//        }
        results = number % 2 == 0 ? "Even" :
       number % 3 == 0 ? "Multiple of 3" :
        number % 5 == 0 ? "Multiple of 5" : "Odd";

        System.out.println(number + " is " + results);
    }
}
