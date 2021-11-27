import java.io.Console;

public class Encrypt {
    public static void main(String[] args) {
        Console mConsole = System.console();

        System.out.println("Input the phrase you want to encrypt");
        String phrase = mConsole.readLine();

        String mEncryptedPhrase = phrase.replaceAll("e", "cacbia cabciabic cabicaicb");
        System.out.println("Your encrypted message now reads \n " + mEncryptedPhrase);
    }
}