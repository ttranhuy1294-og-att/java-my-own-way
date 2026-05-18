package method.EzLevel;

import java.util.Scanner;

public class CalcPowerMethod {
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

    /**
     * Calculates the value of a base raised to a non-negative exponent.
     *
     * <p>
     * This method computes {@code base^exp}.
     * </p>
     *
     * <ul>
     * <li>If {@code exp == 0}, the method returns {@code 1}.</li>
     * <li>If {@code exp > 0}, the method multiplies {@code base}
     * by itself {@code exp} times.</li>
     * </ul>
     *
     * <p>
     * This method assumes that:
     * </p>
     * <ul>
     * <li>{@code exp >= 0}</li>
     * <li>The result fits within the range of the {@code long} type.</li>
     * </ul>
     *
     * @param base the base number
     * @param exp  the non-negative exponent
     * @return the value of {@code base^exp}
     */
    public static long calcPower(long base, int exp) {
        if (exp == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        long base;
        int exp;
        Scanner sc = new Scanner(System.in);

        // const variables
        // Define the minimum and maximum values for input
        final int MIN_BASE_VALUE = 0;
        final int MAX_BASE_VALUE = 100;
        final int MIN_EXP_VALUE = 0;
        final int MAX_EXP_VALUE = 18;

        // == Handle validation of input ===
        // check and get base
        base = readLong(sc, MIN_BASE_VALUE, MAX_BASE_VALUE);
        // check and get exponent
        exp = readInt(sc, MIN_EXP_VALUE, MAX_EXP_VALUE);

        // === Handle the main logic of the program ===
        System.out.println(calcPower(base, exp));

        // === Handle closing of resources ===
        sc.close();
    }
}
