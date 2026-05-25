package method.MidLevel;

import java.util.Scanner;

public class CalcSum {
    /**
     * Reads a long integer from the given scanner and validates that it is
     * within the specified inclusive range.
     *
     * <p>
     * The method repeatedly reads input until a valid value is entered.
     * </p>
     *
     * <ul>
     * <li>If the next token is not a valid {@code long}, the token is
     * discarded.</li>
     * <li>If the value is outside the range [{@code minValue}, {@code maxValue}],
     * an error message is displayed.</li>
     * <li>If the value is valid, it is returned immediately.</li>
     * </ul>
     *
     * @param sc       the scanner used to read input
     * @param minValue the minimum allowed value (inclusive)
     * @param maxValue the maximum allowed value (inclusive)
     * @return a valid long integer between {@code minValue} and {@code maxValue}
     */

    public static long readLong(Scanner sc, long minValue, long maxValue) {
        long n;
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                System.out.println("Invalid input. Please enter a long integer.");
                continue;
            }
            n = sc.nextLong();
            if (minValue <= n && n <= maxValue) {
                return n;
            }
            System.out.println(
                    "Input out of range. Please enter a value between " + minValue + " and " + maxValue + ".");
        }
    }

    public static void main(String[] args) {

    }
}
