import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        String season = "summer";
        String dayOfWeek = "weekend";

        boolean summer = season.equals("summer");
        boolean weekend = dayOfWeek.equals("weekend");

        if (summer && weekend) {
            System.out.println(
                    "Your stay is probably is probably going to be expensive. It's both peak travel season AND the weekend");
        } else if (summer || weekend) {
            System.out.println("You stay is going to be pretty expensive.");
        } else {
            System.out.println("Your stay may be costly, but it could certainly be worse!s");
        }
    }
}