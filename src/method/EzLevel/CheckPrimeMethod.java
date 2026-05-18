package method.EzLevel;

import java.util.Scanner;

public class CheckPrimeMethod {
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
     * Checks whether a number is prime.
     *
     * <p>
     * A prime number is an integer greater than {@code 1} that has exactly
     * two positive divisors: {@code 1} and itself.
     * </p>
     *
     * <p>
     * This method uses the {@code 6k ± 1} optimization:
     * </p>
     *
     * <ul>
     * <li>{@code 1} is not prime.</li>
     * <li>{@code 2} and {@code 3} are prime.</li>
     * <li>Any number divisible by {@code 2} or {@code 3} is not prime.</li>
     * <li>All remaining possible divisors are checked in the form
     * {@code 6k - 1} and {@code 6k + 1} up to {@code sqrt(n)}.</li>
     * </ul>
     *
     * <p>
     * This reduces the number of divisibility checks compared to testing
     * every integer from {@code 2} to {@code n - 1}.
     * </p>
     *
     * @param n the number to test for primality
     * @return {@code true} if {@code n} is prime, {@code false} otherwise
     */
    public static boolean checkPrime(long n) {
        if (n <= 1L) {
            return false;
        }
        if (n <= 3L) {
            return true;
        }
        if (n % 2L == 0L || n % 3L == 0L) {
            return false;
        }
        for (long i = 5L; i * i <= n; i += 6L) {
            if (n % i == 0L || n % (i + 2L) == 0L) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n;

        // const variable
        // range validation
        final long MIN_N = 1L;
        final long MAX_N = 1_000_000_000_000L;
        // message
        final String ACCEPT_MESS = "YES";
        final String REJECT_MESS = "NO";

        // Handle validation
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                continue;
            }

            n = sc.nextLong();
            if (MIN_N <= n && n <= MAX_N) {
                break;
            }
        }

        // Handle logic

        System.out.println(
                checkPrime(n) ? ACCEPT_MESS : REJECT_MESS);

        // close scanner
        sc.close();
    }
}
