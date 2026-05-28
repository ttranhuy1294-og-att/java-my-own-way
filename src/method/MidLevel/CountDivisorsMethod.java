package method.MidLevel;

import java.util.Scanner;

public class CountDivisorsMethod {
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
     * Counts the number of positive divisors
     * of the specified {@code long} value.
     *
     * <p>
     * This method uses prime factorization
     * and the divisor counting formula:
     * </p>
     *
     * <pre>{@code
     * n = p1^a × p2^b × p3^c
     *
     * divisorsCount =
     *         (a + 1)(b + 1)(c + 1)
     * }</pre>
     *
     * <p>
     * The algorithm iterates only up to
     * {@code sqrt(n)} for optimization.
     * </p>
     *
     * @param n
     *          the positive number whose divisors
     *          will be counted
     *
     * @return
     *         the number of positive divisors
     *         of {@code n}
     *
     * @throws IllegalArgumentException
     *                                  if {@code n <= 0}
     */
    public static long countDivisors(long n) {

        if (n <= 0) {
            throw new IllegalArgumentException(
                    "Number must be positive.");
        }

        if (n == 1) {
            return 1;
        }

        long divisorsCount = 1L;
        long exponent;

        for (long i = 2L; i * i <= n; i++) {

            exponent = 0L;

            while (n % i == 0L) {
                n /= i;
                exponent++;
            }

            if (exponent > 0L) {
                divisorsCount *= (exponent + 1L);
            }
        }

        /*
         * If n > 1 here,
         * then n itself is a remaining prime factor
         * with exponent 1.
         */
        if (n > 1L) {
            divisorsCount *= 2L;
        }

        return divisorsCount;
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
        long divisorsCount = countDivisors(n);

        // === Handle output ===
        System.out.println(divisorsCount);
        // === Handle termination resources ===
        sc.close();
    }
}
