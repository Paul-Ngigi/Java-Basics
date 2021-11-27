import java.util.Scanner;

public class RatedR {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("How old are you?");
        Integer age = mScanner.nextInt();

        if (age >= 17) {
            System.out.println("You can see the movie");
        } else {
            System.out.println("Sorry you are underage!");
        }
    }
}