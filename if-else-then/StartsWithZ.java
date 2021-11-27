import java.util.Scanner;

public class StartsWithZ {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = mScanner.nextLine();

        if (name.startsWith("Z")) {
            System.out.println("Your name starts with a Z");
        } else {
            System.out.println("Your name doesn't start with a Z");
        }
    }
}