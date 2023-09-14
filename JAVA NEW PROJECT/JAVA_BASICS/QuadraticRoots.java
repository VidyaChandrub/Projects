import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double[] roots = findQuadraticRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two real roots:");
            System.out.println("Root 1 of x = " + roots[0]);
            System.out.println("Root 2 of x = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root:");
            System.out.println("x = " + roots[0]);
        } else {
            System.out.println("Complex roots:");
            System.out.println("Root 1 of x = " + roots[0] + " + i" + roots[1]);
            System.out.println("Root 2 of x = " + roots[0] + " - i" + roots[1]);
        }

        input.close();
    }

    public static double[] findQuadraticRoots(double a, double b, double c) {
        double[] roots;
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        } else {
            roots = new double[2];
            roots[0] = -b / (2 * a);
            roots[1] = Math.sqrt(Math.abs(delta)) / (2 * a);
        }

        return roots;
    }
}
