import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;  // 1 hour = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60;  // 1 minute = 60 seconds
        int seconds = totalSeconds % 60;

        // Print the result
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d%n", hours, minutes, seconds);

        scanner.close();
    }
}
