package Chapter5;


import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        final int ROW = 2;
        final int COL = 3;
        //2D Array
        int[][] arTestMarks = new int[ROW][COL];
        String[] arStNames = new String[ROW];
        Scanner sc = new Scanner(System.in);
        String stName;
        int testMark;
//        double Average;
        String grade = " ";



        for (int i = 0; i < ROW; i++) {
            System.out.println("Enter name for student: " + (i+1) + ": ");
            stName=sc.next();

            arStNames[i] = stName;

            //get 3 tests
            for (int j = 0; j < COL; j++) {
                System.out.println("Enter test: " + (j+1) + "for " + stName + " ");
                testMark = sc.nextInt();

                arTestMarks[i][j] = testMark;
            }
        }
//
        System.out.println("\n========output===========\n");
        System.out.println("Name\tTest1\tTest 2\tTest3\tAverage\tGrade");;
        for (int i = 0; i < arTestMarks.length; i++){
            System.out.print( arStNames[i] + "\t");
            double sum = 0, average = 0;
//            System.out.println("-------------------");


            for (int j=0; j <arTestMarks[i].length; j++){
                System.out.print(arTestMarks[i][j] + "\t\t " );


            }
            if (average < 50){
                grade = "F";
            } else if (average>50) {
                grade = "P";

            }
            average =sum/COL;
            System.out.println(average + "\t" + grade);
            System.out.println();

        }


    }
//    public static double calculateAverage(int[] ROW){
//        double sum= 0;
//        for (int testMarks : ROW){
//            sum += testMarks;
//        }
//        return sum / ROW.length;

}
