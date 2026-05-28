package method.MidLevel;

import java.util.Scanner;

public class CalcSumDivisorsMethod {
    // ===== Start readLong overloads =====

    /**
     * Reads and validates a {@code long} value within
     * the inclusive range {@code [minValue, maxValue]}.
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param minValue
     *                 the minimum accepted value
     *
     * @param maxValue
     *                 the maximum accepted value
     *
     * @return
     *         a validated {@code long} value within the
     *         inclusive range {@code [minValue, maxValue]}
     */
    public static long readLong(
            Scanner sc,
            long minValue,
            long maxValue) {

        long result;

        while (true) {

            if (!sc.hasNextLong()) {
                sc.next();
                continue;
            }

            result = sc.nextLong();

            if (result < minValue || result > maxValue) {
                continue;
            }

            return result;
        }
    }

    // ===== End readLong overloads =====

    /**
     * Calculates the sum of all positive divisors
     * of the specified {@code long} value.
     *
     * <p>
     * This method uses prime factorization
     * and the divisor sum formula:
     * </p>
     *
     * <pre>{@code
     * n = p1^a × p2^b × p3^c
     *
     * sumDivisors(n) =
     * (1 + p1 + p1² + ... + p1^a)
     * ×
     * (1 + p2 + p2² + ... + p2^b)
     * × ...
     * }</pre>
     *
     * <p>
     * The algorithm iterates only up to
     * {@code sqrt(n)} for optimization.
     * </p>
     *
     * @param n
     *          the positive number whose divisor sum
     *          will be calculated
     *
     * @return
     *         the sum of all positive divisors
     *         of {@code n}
     *
     * @throws IllegalArgumentException
     *                                  if {@code n <= 0}
     */
    public static long sumDivisors(long n) {

        if (n <= 0L) {
            throw new IllegalArgumentException(
                    "Number must be positive.");
        }

        long divisorsSum = 1L;

        for (long i = 2L; i * i <= n; i++) {

            if (n % i == 0L) {

                long currentPower = 1L;
                long currentSum = 1L;

                while (n % i == 0L) {

                    n /= i;

                    currentPower *= i;

                    currentSum += currentPower;
                }

                divisorsSum *= currentSum;
            }
        }

        /*
         * If n > 1 here,
         * then n itself is a remaining prime factor.
         */
        if (n > 1L) {
            divisorsSum *= (1L + n);
        }

        return divisorsSum;
    }

    public static void main(String[] args) {
        // === Handle initialization ===
        Scanner sc = new Scanner(System.in);
        long n;

        // constants
        final long MIN_VALUE = 1L;
        final long MAX_VALUE = 1_000_000_000_000L;

        // === Handle input ===
        n = readLong(sc, MIN_VALUE, MAX_VALUE);

        // === Handle processing ===
        long sumDivisors = sumDivisors(n);

        // === Handle output ===
        System.out.println(sumDivisors);
        // === Handle termination resources ===
        sc.close();
    }
}
