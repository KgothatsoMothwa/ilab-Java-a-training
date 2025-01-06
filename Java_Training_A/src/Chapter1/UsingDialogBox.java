package Chapter1;

import javax.swing.*;
import java.util.Scanner;

/*
Get input from the user
*from the Ioption Pane class
*
 */

public class UsingDialogBox {
    public static void main(String[] args) {
        //Declare
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;
        String StrOutput;
        Scanner sc = new Scanner(System.in);
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME= "iLAB Quality";
        final double HOURLY_RATE = 200;
        final double TAX_CHARGED = 0.25;

        //Assign
        name = JOptionPane.showInputDialog("Please enter your name");
        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth year:"));
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter your Hours worked:"));

        //Calculate Age and Salary
        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX_CHARGED);

        StrOutput = "====================" + COMPANY_NAME + "=====================" + "\nName: " + name + "\nAge: " + age +
                "\nHours Worked: " + hoursWorked + "\nSalary: " + salary;// + "Position Code: " + positionCode;

//        System.out.println("====================" + COMPANY_NAME + "=====================");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Hours Worked: "+ HOURLY_RATE);
//        //System.out.println("Position Code: " + positionCode);
//        System.out.println("Salary: " + salary);
        JOptionPane.showMessageDialog(null,StrOutput);
//        JOptionPane.showMessageDialog(null,"Name: " + name);
//        JOptionPane.showMessageDialog(null,"Age: " + age);
//        JOptionPane.showMessageDialog(null,"Salary: " + salary);
        positionCode = JOptionPane.showInputDialog("Please specify posistion code").charAt(0);



    }
}
