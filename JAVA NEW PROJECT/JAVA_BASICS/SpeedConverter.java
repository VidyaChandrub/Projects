import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the conversion direction:");
        System.out.println("1. Kilometers per hour (km/h) to Meters per second (m/s)");
        System.out.println("2. Meters per second (m/s) to Kilometers per hour (km/h)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // Convert from km/h to m/s
            System.out.print("Enter speed in kilometers per hour (km/h): ");
            double speedKmPerHour = scanner.nextDouble();
            double speedMeterPerSecond = speedKmPerHour * 1000.0 / 3600.0; // Conversion factor
            System.out.printf("%.2f km/h is equal to %.2f m/s%n", speedKmPerHour, speedMeterPerSecond);
        } else if (choice == 2) {
            // Convert from m/s to km/h
            System.out.print("Enter speed in meters per second (m/s): ");
            double speedMeterPerSecond = scanner.nextDouble();
            double speedKmPerHour = speedMeterPerSecond * 3600.0 / 1000.0; // Conversion factor
            System.out.printf("%.2f m/s is equal to %.2f km/h%n", speedMeterPerSecond, speedKmPerHour);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
