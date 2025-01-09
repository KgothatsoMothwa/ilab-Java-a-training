package Chapter5;

public class CreatingArrays {
    public static void main(String[] args) {
        //Declare
        int[] arNums = new int[]{1,2,3,4,5};
        int [] arNum2 = {1,2,3,4,5};





        //Array to store 10 elements


        Integer [] arTestMarks = new Integer[10];

        //Array with initial values
        String[] arNames =  new String[]{
                "Blue", "Mike", "Scott", "Chosen", "Jacobs"
        };

        //double
        double[] arPrices = {15.2, 58.96, 20.00, 63.25};

        char[] arLetters = {'A', 'B', 'C', 'D', 'E'};

        //EMPTY ARRAY
        int[] arNumbers;

        //Assign
        arTestMarks[0] = 1;
        arTestMarks[1] = 2;
        arTestMarks[2] = 3;
        arTestMarks[3] = 4;
        arTestMarks[4] = 10;
        arTestMarks[5] = 15;
        arTestMarks[6] = 16;
        arTestMarks[7] = 17;
        arTestMarks[8] = 18;
        arTestMarks[9] = 19;

        arNumbers = new int[3];
        arNumbers[0] = 1;
        arNumbers[1] = 1;
        arNumbers[2] = 1;
        //use
        for (int mark : arTestMarks){
            System.out.print(mark + " ");
        }

        System.out.println("\n====================");
        for (int num : arNumbers){
            System.out.print(num + " ");
        }

        display("Test Marks", arTestMarks);
        display("Names", arNames);
        display("Test Marks", arTestMarks);



    }
    static <T> void display(String title, T[] arElements){
        System.out.printf("=====" + title + "=======");
        for (T e : arElements){
            System.out.print(e + " ");
        }

    }
}
