import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student's name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter Physics marks (out of 100): ");
        double physicsMarks = scanner.nextDouble();

        System.out.print("Enter Chemistry marks (out of 100): ");
        double chemistryMarks = scanner.nextDouble();

        System.out.print("Enter Maths marks (out of 100): ");
        double mathsMarks = scanner.nextDouble();

        // Calculate total marks and percentages
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double physicsPercentage = (physicsMarks / 100.0) * 100;
        double chemistryPercentage = (chemistryMarks / 100.0) * 100;
        double mathsPercentage = (mathsMarks / 100.0) * 100;
        double totalPercentage = (totalMarks / 300.0) * 100;

        // Print the results
        System.out.printf("%s obtained the following percentages of marks in PCM:\n", studentName);
        System.out.printf("Physics: %.2f%%, Chemistry: %.2f%%, Maths: %.2f%%, Total: %.2f%%\n",
                physicsPercentage, chemistryPercentage, mathsPercentage, totalPercentage);

        scanner.close();
    }
}
