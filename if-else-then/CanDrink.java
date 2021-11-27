import java.util.Scanner;

public class CanDrink {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("How old are you?");
        Integer userAge = mScanner.nextInt();

        if (userAge >= 18) {
            System.out.println("Welcome, what drink would you like me to bring you?");
        } else {
            System.out.println("Oh hell noooo!!! You are only " + userAge + " years old. Sorry I Can't sell alcohol to underage kids");
        }
    }
}