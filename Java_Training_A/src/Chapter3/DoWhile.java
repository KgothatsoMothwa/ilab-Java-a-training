package Chapter3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String name;
//
//        do {
//            System.out.print("Enter a name: ");
//            name = sc.nextLine();
//        }while(name.length()<3);
        System.out.println("=============");

        String response, results = "none";
        /*
        * Select a fruit
        * A - Apple
        * B -Banana
        * M - Mango
        * O - Orange*/

        System.out.println("Select a fruit: \n" +
                "A - Apple\nB - Banana\nM - Mango\nO - Orange");
        response = sc.nextLine();

        while (response !="A" && response !="B" && response !="M" && response !="O" ){
            System.out.println("Select a fruit: \n" +
                    "A - Apple\nB - Banana\nM - Mango\nO - Orange");
            response = sc.nextLine();
        }

        switch(response){
            case "A" : results = "Apple";
                break;
            case "B" : results = "Banana";
                break;
            case "M" : results = "Mango";
                break;
            case "O" : results = "Orange";
                break;


        }
        System.out.println(results);
    }
}
