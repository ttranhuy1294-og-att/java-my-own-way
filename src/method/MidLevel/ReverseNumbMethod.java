package method.MidLevel;

import java.util.Scanner;

public class ReverseNumbMethod {
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
     * Reverses the digits of a non-negative {@code long} integer.
     *
     * <p>
     * The method repeatedly extracts the last digit of the number
     * and appends it to a new reversed number.
     * </p>
     *
     * <p>
     * Leading zeros after reversing are automatically removed
     * because numeric types do not preserve leading zeros.
     * </p>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * reverse(12345); // returns 54321
     * reverse(1000); // returns 1
     * }</pre>
     *
     * @param n
     *          the non-negative number to reverse
     *
     * @return
     *         the reversed number
     */
    public static long reverseNumb(long n) {
        long reversed = 0;
        if (n < 10) {
            return n; // Single-digit numbers are the same when reversed
        }

        while (n != 0) {
            long digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            n /= 10; // Remove the last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        // === Handle initialization ===
        Scanner sc = new Scanner(System.in);
        long n;
        long reversedNumber = 0;
        // constants
        final long MIN_VALUE = 0;
        final long MAX_VALUE = 1_000_000_000_000_000_000L;

        // === Handle input ===
        n = readLong(sc, null, MIN_VALUE, MAX_VALUE);

        // === Handle processing ===
        reversedNumber = reverseNumb(n);

        // === Handle output ===
        System.out.println(reversedNumber);

        // === Handle termination resources ===
        sc.close();
    }
}
