package Chapter2;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayNum =1;
        String dayOfWeek = "None";

//        if (dayNum == 1) {
//            dayOfWeek = "Monday";
//        } else if (dayNum == 2) {
//            dayOfWeek = "Tuesday";
//
//        }else if (dayNum == 3) {
//            dayOfWeek = "Wednesday";
//
//        }else if (dayNum == 4) {
//            dayOfWeek = "Thursday";
//
//        }else if (dayNum == 5) {
//            dayOfWeek = "Friday";
//
//        }else if (dayNum == 6) {
//            dayOfWeek = "Saturday";
//
//        }else if (dayNum == 7) {
//            dayOfWeek = "Sunday";
//
//        }else {
//            dayOfWeek = "Invalid";
//        }
//
        switch (dayNum){
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
            case 7 : dayOfWeek = "Sundayday";
                break;
            default:dayOfWeek = "Invalid";
        }
        System.out.println(dayOfWeek);
        System.out.println("=========================================================");

        //Supervisors for departments
        // 1,2 amd 5 - Smith
        // 3 - Jones
        // 4 - Mokoena
        //  -*

        int department = 1;
        String supervisor;

        switch (department){
            case 1, 2, 5: supervisor = "Smith";
            break;
            case 3 : supervisor = "Jones";
            break;
            case 4: supervisor = "Mokoena";
            break;
            default: supervisor = "Invalid Supervisor";
        }
        System.out.println(supervisor);

    }
}
