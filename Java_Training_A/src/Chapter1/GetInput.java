package Chapter1;

import java.util.Scanner;

public class GetInput {

    public static void main(String[] args) {
        //Declare
        int age, birthYear, hoursWorked;
        double salary;
        char positionCode; //(S-Senior, J-Junior, I-Intern)
        String name;
        Scanner sc = new Scanner(System.in);
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME= "iLAB Quality";
        final double HOURLY_RATE = 200;
        final double TAX_CHARGED = 0.25;

        //Assign
        //Request the User to enter Name
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        //Request the User to enter Birth Year
        System.out.print("Enter your Birth Year: ");
        birthYear = sc.nextInt();


        //Request the User to enter Hours Worked
        System.out.print("Enter Hours worked: ");
        hoursWorked = sc.nextInt();

        //Request the User to enter Position Code
        System.out.print("Please choose your position code (S-Senior, J-Junior, I-Intern): ");
        positionCode = sc.next().charAt(0);

        //Calculate Age and Salary
        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX_CHARGED);


        System.out.println("====================" + COMPANY_NAME + "=====================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hours Worked: "+ HOURLY_RATE);
        System.out.println("Position Code: " + positionCode);
        System.out.println("Salary: " + salary);




    }
}
