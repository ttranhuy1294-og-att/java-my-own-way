package method.MidLevel;

import java.util.Scanner;

public class CountDigitsMethod {
    /**
     * Reads and validates a {@code long} value that must be
     * greater than or equal to a minimum value.
     *
     * <p>
     * The method repeatedly prompts the user until a valid
     * {@code long} satisfying the minimum constraint is entered.
     * </p>
     *
     * <h2>Validation Rules</h2>
     *
     * <ul>
     * <li>
     * Non-numeric input is rejected.
     * </li>
     *
     * <li>
     * Values smaller than {@code minValue}
     * are rejected.
     * </li>
     * </ul>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * long age = readLong(sc, "Enter age: ", 0);
     * }</pre>
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param prompt
     *                 the message displayed before reading input;
     *                 may be {@code null} or empty
     *
     * @param minValue
     *                 the minimum accepted value
     *
     * @return
     *         a validated {@code long} value greater than
     *         or equal to {@code minValue}
     */
    public static long readLong(Scanner sc, String prompt, long minValue) {
        if (prompt != null && !prompt.isEmpty()) {
            System.out.print(prompt);
        }

        long result = 0;
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.print("Invalid input. Please enter a long integer: ");
                sc.nextLine(); // consume the invalid input
                continue;
            }
            result = sc.nextLong();
            if (result < minValue) {
                System.out.print("Please enter a long integer greater than or equal to " + minValue + ": ");

                continue;
            }
            break;
        }

        // consume the remaining newline character after reading the integer
        sc.nextLine();
        return result;
    }

    /**
     * Reads and validates a {@code long} value within
     * an inclusive range.
     *
     * <p>
     * The method repeatedly prompts the user until a valid
     * {@code long} within the specified range is entered.
     * </p>
     *
     * <h2>Validation Rules</h2>
     *
     * <ul>
     * <li>
     * Non-numeric input is rejected.
     * </li>
     *
     * <li>
     * Values smaller than {@code minValue}
     * are rejected.
     * </li>
     *
     * <li>
     * Values greater than {@code maxValue}
     * are rejected.
     * </li>
     * </ul>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * long month = readLong(sc, "Enter month: ", 1, 12);
     * }</pre>
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param prompt
     *                 the message displayed before reading input;
     *                 may be {@code null} or empty
     *
     * @param minValue
     *                 the minimum accepted value
     *
     * @param maxValue
     *                 the maximum accepted value
     *
     * @return
     *         a validated {@code long} value within the
     *         inclusive range
     *         [{@code minValue}, {@code maxValue}]
     */
    public static long readLong(Scanner sc, String prompt, long minValue, long maxValue) {

        if (prompt != null && !prompt.isEmpty()) {
            System.out.print(prompt);
        }

        long result = 0;
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.print("Invalid input. Please enter a long integer: ");
                sc.nextLine(); // consume the invalid input
                continue;
            }
            result = sc.nextLong();
            if (result < minValue || result > maxValue) {
                System.out.print("Please enter a long integer between " + minValue + " and " + maxValue + ": ");

                continue;
            }
            break;
        }

        // consume the remaining newline character after reading the integer
        sc.nextLine();
        return result;
    }

    /**
     * Counts the number of digits in a non-negative
     * {@code long} integer.
     *
     * <p>
     * The method repeatedly divides the number by {@code 10}
     * until the number becomes {@code 0}.
     * Each division removes one digit from the right side
     * of the number.
     * </p>
     *
     * <h2>Special Case</h2>
     *
     * <p>
     * The number {@code 0} is considered to have exactly
     * {@code 1} digit.
     * </p>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * countDigits(12345); // returns 5
     * countDigits(0); // returns 1
     * }</pre>
     *
     * @param n
     *          the non-negative number whose digits
     *          are counted
     *
     * @return
     *         the number of digits in {@code n}
     */
    public static int countDigits(long n) {
        if (n == 0) {
            return 1; // Special case for 0, which has 1 digit
        }

        int count = 0;
        while (n != 0) {
            n /= 10; // Remove the last digit
            count++; // Increment the digit count
        }

        return count;
    }

    public static void main(String[] args) {
        // === Handle initialization ===
        Scanner sc = new Scanner(System.in);
        long n;
        int digitsCount = 0;
        // constants
        final long MIN_VALUE = 0;
        final long MAX_VALUE = 1_000_000_000_000_000_000L;

        // === Handle input ===
        n = readLong(sc, null, MIN_VALUE, MAX_VALUE);

        // === Handle processing ===
        digitsCount = countDigits(n);

        // === Handle output ===
        System.out.println(digitsCount);

        // === Handle termination resources ===
        sc.close();
    }
}
