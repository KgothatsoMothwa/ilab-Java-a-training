package Chapter4;


import java.util.Scanner;

/* Void methods do not return any data back to the caller


* */
public class VoidMethods {
    static String firstName, lastName, empNumber;
    static int age;
    static double height;


    public static void main(String[] args) {
        displayMessage();
        getUserDetails();
        displayDetails();
    }
    static void displayMessage(){
        System.out.println("Hello, World!!");
    }
    static void getUserDetails(){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter Last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter empNumber: ");
        empNumber = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter height: ");
        height = sc.nextDouble();


    }
    static void displayDetails(){
        System.out.println("=========Details for employee " + empNumber + "===========");
        System.out.println("Full Name: " + firstName + " " +  lastName);
        System.out.println("Age: (" + age + ")");
        System.out.println("Height: (" + height + ")");
        System.out.println("Employee Number: (" + empNumber + ")");
    }
}
