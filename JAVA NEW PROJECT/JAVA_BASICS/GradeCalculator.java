import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the student's numerical score: ");

        // Read the numerical score from the user
        int score = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Determine the letter grade based on the score
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            return; // Exit the program
        }

        // Display the corresponding letter grade
        System.out.println("The corresponding letter grade is: " + grade);
    }
}
