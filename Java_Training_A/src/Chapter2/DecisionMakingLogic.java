package Chapter2;

public class DecisionMakingLogic {
    public static void main(String[] args) {
        //single IF statement
        System.out.println("==========single IF statement==========");
        if (3>2)
            System.out.println("3 is greater than 2");

        if (5!=7){
            System.out.println("5 is not equal to 7");
            System.out.println("Change the condition");
        }

        //binary IF statements
        System.out.println("==========Binary IF statement==========");
        if (3 == 3){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        //if...else if (multiple checks)
        System.out.println("==========if...else if (multiple checks)==========");
        int age = 21;
        if(age >=25){
            System.out.println("Old Enough");
        } else if (age == 21) {
            System.out.println("Almost 25");

        } else if (age == 16) {
            System.out.println("Still a teen");

        }
    }
}
