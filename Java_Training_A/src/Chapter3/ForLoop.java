package Chapter3;

public class ForLoop {
    public static void main(String[] args) {
        //display Tuesday 4 times
        for (int i = 1; i <= 4; i++){
            System.out.println(i + " - Tuesday");
        }
        System.out.println("=============");
        //display iLAB Training 3 times
        for (int i = 5; i < 8; i++){
            System.out.println("iLAB Training");
        }
        System.out.println("=============");

        //multiple loop conditions
        for(int a =1 , b = 5; a <= 5 && b <= 8; a++, b++){
            System.out.println("a - " + a + "\tb - " + b);

        }
        System.out.println("=============");
//        int num = 10;
//        for (int c =8; c<=17; c++){
//            System.out.println(num);
//            num--;
//        }
        for (int i = 10; i >= 1; --i){
            System.out.println(i + " - ");
        }

    }
}
