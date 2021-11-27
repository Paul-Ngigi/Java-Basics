import java.util.Scanner;

public class HasTwoDigits {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("Kindly input a number");
        Integer number = mScanner.nextInt();

        if (number >= 10 && number <= 99) {
            System.out.println("Awesome! Your number has two digits");
        } else {
            System.out.println("Sorry! Your number does not have two digits");
        }
    }
}