package Chapter3;
/*
* You can exit the loop using 'Loop Termination Techniques'
* break - exit loop
* */
public class LoopTerminationTechniques {
    public static void main(String[] args) {

        for (int i =1; i<= 15; i++){
//            if (i == 4) break; //exit when i = 8
            if (i == 4) continue;
            System.out.print(i + "  ");

        }
    }
}
