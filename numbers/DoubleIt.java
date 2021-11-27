import java.util.Scanner;

public class DoubleIt {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("Give me a number, and I'll double it for you!");
        Integer yourNumber = mScanner.nextInt();

        Integer doubleNumber = yourNumber * 2;
        System.out.println("I doubled your number for you: " + doubleNumber);
    }
}