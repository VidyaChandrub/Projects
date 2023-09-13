public class SquareArrayGenerator {
    public static void main(String[] args) {
        // Create an array to store the squares
        int[] squares = new int[10];

        // Calculate and store the squares of numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            squares[i - 1] = i * i;
        }

        // Print the array of squares
        System.out.println("Array of Squares from 1 to 10:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square of " + (i + 1) + " is " + squares[i]);
        }
    }
}
