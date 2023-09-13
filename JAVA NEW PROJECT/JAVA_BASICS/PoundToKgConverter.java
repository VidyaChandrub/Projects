import java.util.Scanner;

public class PoundToKgConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds * 453.592 / 1000.0;

        // Print the result
        System.out.printf("Weight in kilograms: %.2f kg%n", weightInKilograms);

        scanner.close();
    }
}
