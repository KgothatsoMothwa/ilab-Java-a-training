package Chapter1;

public class UsingConstants {
    public static void main(String[] args) {

        int age;
        int birthYear;
        double salary;
        int hoursWorked;
        String name;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME= "iLAB Quality";
        final double HOURLY_RATE = 350;
        final double TAX_CHARGED = 0.25;
        //Assign
        name = "Blue";
        birthYear= 2002;
        age = CURRENT_YEAR - birthYear;
        hoursWorked = 320;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX_CHARGED);

        //USE
        System.out.println("====================" + COMPANY_NAME + "=====================");
        System.out.println("Name:\t " + name);
        System.out.println("Age:\t" + age);
        System.out.println("Hours Worked:\t"+ HOURLY_RATE);
        System.out.println("Salary:\t" + salary);

        System.out.println("  * ");
        System.out.println(" * *");
        System.out.println("* * *");



    }
}
