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
