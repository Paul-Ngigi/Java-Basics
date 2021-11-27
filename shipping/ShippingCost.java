import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        calculator(70, 5, 4);
    }

    public static void calculator(int weight, int distance, int priceModifier) {
        Scanner mScanner = new Scanner(System.in);
        char space = ' ';

        System.out.println("Kindly input the package weight in kgs");
        weight = mScanner.nextInt();

        System.out.println("Kindly input the distance to be covered in km");
        distance = mScanner.nextInt();

        System.out.println("Kindly input the price modifier");
        priceModifier = mScanner.nextInt();

        int shippingCost = (weight / 10) + (distance / 5) * priceModifier;
        System.out.println("Your shipping cost is" + space + shippingCost + space + "Ksh");
    }
}