package Chapter3;
/*
* While loop will execute while the condition is true
* */

import java.util.Scanner;



public class WhileLoop {
    public static void main(String[] args) {
        //display Tuesday 5 times using  WHILE-LOOP
        int count = 1;
        while(count <=5){
            System.out.println(count + " - Tues");
            count++;
        }
        System.out.println("=============");
        /*calculate the sum of numbers entered.
        * Enter zero to stop*/

        Scanner sc = new Scanner(System.in);
        int number, sum = 0;
        System.out.print("Enter a number to add: ");
        number = sc.nextInt();

        while(number!=0 ){
            sum+=number; //sum = sum + number;
            System.out.print("Enter a number to add: ");
            number = sc.nextInt();
        }
        System.out.println("Sum: " + sum);
        System.out.println("=============");

        //the user should enter a name that is at least 4 characters long
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a name with at least 3 letters : ");
        name = scanner.nextLine();

        while (name.length() <= 3){
            System.out.print("Please enter a name with at least 3 letters : ");
            name = scanner.nextLine();


        }

    }
}
