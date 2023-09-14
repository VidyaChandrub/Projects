import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

        // Input coefficients a, b, and c
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (D = b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // Check the value of discriminant
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root 1: %.2f%n", root1);
            System.out.printf("Root 2: %.2f%n", root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Root 1: %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.2f - %.2fi%n", realPart, imaginaryPart);
        }

        scanner.close();
    }
}
import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate random numbers between 1 and 6 for two dice rolls
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;

        // Calculate the sum of the two dice rolls
        int sum = die1 + die2;

        // Print the result
        System.out.println("Rolling two dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum of the two dice: " + sum);
    }
}

import java.util.Random;

public class RandomArithmeticOperation {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate random integers between 1 and 10
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;

        // Generate a random arithmetic operator
        String[] operators = {"+", "-", "*", "/"};
        int operatorIndex = random.nextInt(operators.length);
        String operator = operators[operatorIndex];

        // Perform the arithmetic operation and calculate the result
        double result = 0.0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
        }

        // Print the equation and result
        System.out.println("Random Arithmetic Operation:");
        System.out.printf("%d %s %d = %.2f%n", num1, operator, num2, result);
    }
}

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number from 1 to 7: ");

        // Read the input number
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Use a switch-case statement to determine the day of the week
        String dayOfWeek;
        switch (number) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid input. Please enter a number from 1 to 7.";
                break;
        }

        // Display the corresponding day of the week
        System.out.println("The day corresponding to " + number + " is " + dayOfWeek + ".");
    }
}


import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the numerical score
        System.out.print("Enter the student's numerical score: ");

        // Read the numerical score
        double score = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Determine the letter grade based on the score range
        String letterGrade;
        if (score >= 90 && score <= 100) {
            letterGrade = "A";
        } else if (score >= 80 && score < 90) {
            letterGrade = "B";
        } else if (score >= 70 && score < 80) {
            letterGrade = "C";
        } else if (score >= 60 && score < 70) {
            letterGrade = "D";
        } else if (score >= 0 && score < 60) {
            letterGrade = "F";
        } else {
            letterGrade = "Invalid score. Please enter a score between 0 and 100.";
        }

        // Display the corresponding letter grade
        System.out.println("The student's letter grade is: " + letterGrade);
    }
}


public class SquareArray {
    public static void main(String[] args) {
        // Define the size of the array
        int size = 10;

        // Create an array to store the squares
        int[] squares = new int[size];

        // Calculate and populate the array with squares
        for (int i = 0; i < size; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        // Print the array of squares
        System.out.print("Array of squares: ");
        for (int i = 0; i < size; i++) {
            System.out.print(squares[i] + " ");
        }
    }
}
