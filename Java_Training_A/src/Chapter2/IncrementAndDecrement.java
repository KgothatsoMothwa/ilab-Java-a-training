package Chapter2;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int age = 25;

        System.out.println("**********Increment***********");
        System.out.println("Original age is: " + age);
        System.out.println("Age changed to: " + ++age);
        System.out.println("Age changed to: " + age++);
        System.out.println("Age changed to: " + age++);

        age = 25;
        System.out.println("**********Decrement***********");
        System.out.println("Original age is: " + age);
        System.out.println("Age changed to: " + --age);
        System.out.println("Age changed to: " + age--);
        System.out.println("Age changed to: " + age--);
    }
}
