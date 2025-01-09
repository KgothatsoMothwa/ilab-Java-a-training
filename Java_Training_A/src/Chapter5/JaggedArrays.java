package Chapter5;


import java.util.Scanner;

//JaggedArray is an array of arrays
public class JaggedArrays {
    public static void main(String[] args) {
//        String[] arHobby = new String[3];

        //Create a Jagged array
        String[][] arHobbies = new String[3][];
        String[] arSport = {"Tennis", "Golf", "Rugby"};

        arHobbies[0] = arSport;
        arHobbies[1] = new String[]{"Swimming", "Hiking", "Chess"};
        arHobbies[2] = new String[4];
        //soccer, chess, hiking, netball
        arHobbies[2][0] = "Chess";
        arHobbies[2][1] = "soccer";
        arHobbies[2][2] = "Hiking";
        arHobbies[2][3] = "netball";

        for (int i = 0; i < arHobbies.length; i++) {
            for (int j = 0; j < arHobbies[i].length; j++) {
                System.out.print(arHobbies[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
