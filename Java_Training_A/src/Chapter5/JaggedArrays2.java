package Chapter5;

import java.util.Scanner;

public class JaggedArrays2 {
    public static void main(String[] args) {
        final int SIZE = 3;
        String[] arNames = new String[SIZE];
        String[][] arPersons = new String[SIZE][];
        String[] arHobbies;
        int hobbyCount=0;
        String strName, strHobby;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <SIZE ; i++) {
            System.out.print("Enter name for person " + (i+1) + " ");
            strName = sc.next();
            arNames[1] = strName;

            System.out.print("How many Hobbies do you have " + strName + " ");
            hobbyCount = sc.nextInt();
            arHobbies = new String[hobbyCount];

            for (int j = 0; j <arHobbies.length ; j++) {
                System.out.print("Enter hobby " + (j+1) + " for " + strName + " ");
                strHobby=sc.next();
                arHobbies[1] = strHobby;
            }
            arPersons[i] = arHobbies;
        }
        System.out.println("\n-------------OutPut--------------\n");
        for (int i = 0; i < arPersons.length; i++) {
            System.out.print(arNames[i] +  "\t");
            for (int j = 0; j < arPersons[i].length; j++) {
                System.out.print((j+1) + ". " + arPersons[i][j] );
            }
            System.out.println();
        }
    }
}
