package method.EzLevel;

import java.util.Scanner;

public class CalcFactMethod {
    /**
     * Reads an integer from the given scanner and validates that it is
     * within the specified inclusive range.
     *
     * <p>
     * The method repeatedly reads input until a valid value is entered.
     * </p>
     *
     * <ul>
     * <li>If the next token is not a valid {@code int}, the token is
     * discarded.</li>
     * <li>If the value is outside the range [{@code minValue}, {@code maxValue}],
     * an error message is displayed.</li>
     * <li>If the value is valid, it is returned immediately.</li>
     * </ul>
     *
     * @param sc       the scanner used to read input
     * @param minValue the minimum allowed value (inclusive)
     * @param maxValue the maximum allowed value (inclusive)
     * @return a valid integer between {@code minValue} and {@code maxValue}
     */

    public static int readInt(Scanner sc, int minValue, int maxValue) {
        int a;
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
            a = sc.nextInt();
            if (minValue <= a && a <= maxValue) {
                return a;
            }
            System.out.println(
                    "Input out of range. Please enter a value between " + minValue + " and " + maxValue + ".");
        }
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * <p>
     * The factorial of n is defined as:
     * </p>
     * <ul>
     * <li>0! = 1</li>
     * <li>n! = n × (n - 1)! for n > 0</li>
     * </ul>
     *
     * @param n the non-negative integer whose factorial is to be calculated
     * @return the factorial of n
     */
    public static long calcFactorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcFactorial(n - 1);
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n;
        Scanner sc = new Scanner(System.in);

        // const variables
        // Define the minimum and maximum values for input
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 20;

        // == Handle validation of input ===
        // check and get n
        n = readInt(sc, MIN_VALUE, MAX_VALUE);

        // === Handle the main logic of the program ===
        System.out.println(calcFactorial(n));

        // === Handle closing of resources ===
        sc.close();
    }
}
