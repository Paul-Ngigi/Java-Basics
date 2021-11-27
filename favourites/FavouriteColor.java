import java.io.Console;
import java.util.Scanner;

public class FavouriteColor {
    public static void main(String[] args) {
        Scanner myConsole = new Scanner(System.in);

        System.out.println("What is your favourite color?");
        String favouriteColor = myConsole.nextLine();
        char space = ' ';

        System.out.println("Your favourite color is" + space + favouriteColor);
    }
}