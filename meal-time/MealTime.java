import java.io.Console;

public class MealTime {
    public static void main(String[] args) {
        askWhatYouATe("breakfast");
        askWhatYouATe("lunch");
        askWhatYouATe("dinner");
    }

    public static void askWhatYouATe(String meal){
        Console mConsole = System.console();

        System.out.println("What did you eat for " + meal + " ?");
        String yourBreakfast = mConsole.readLine();
        System.out.println("You had " + yourBreakfast + " for " + meal + ".");

        System.out.println("What did you eat for " + meal + " ?");
        String yourLunch = mConsole.readLine();
        System.out.println("You had " + yourLunch + " for " + meal + ".");

        System.out.println("What did you eat for " + meal + " ?");
        String yourDinner = mConsole.readLine();
        System.out.println("You had " + yourDinner + " for " + meal + ".");
    }
}