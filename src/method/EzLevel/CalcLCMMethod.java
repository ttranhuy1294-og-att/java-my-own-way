package method.EzLevel;

import java.util.Scanner;

public class CalcLCMMethod {
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
     * Calculates the greatest common divisor (GCD) of two positive integers.
     *
     * <p>
     * The greatest common divisor is the largest positive integer that
     * divides both numbers without leaving a remainder.
     * </p>
     *
     * <p>
     * This method uses the recursive Euclidean algorithm:
     * </p>
     *
     * <ul>
     * <li>{@code gcd(a, b) = gcd(b, a % b)}</li>
     * <li>When {@code b == 0}, the GCD is {@code a}.</li>
     * </ul>
     *
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>{@code gcd(12, 18) = 6}</li>
     * <li>{@code gcd(100, 25) = 25}</li>
     * <li>{@code gcd(17, 13) = 1}</li>
     * </ul>
     *
     * @param a the first positive integer
     * @param b the second positive integer
     * @return the greatest common divisor of {@code a} and {@code b}
     */
    public static long calcGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return calcGCD(b, a % b);
    }

    /**
     * Calculates the least common multiple (LCM) of two positive integers.
     *
     * <p>
     * The least common multiple is the smallest positive integer that is
     * divisible by both numbers.
     * </p>
     *
     * <p>
     * This method uses the relationship between LCM and GCD:
     * </p>
     *
     * <p>
     * {@code lcm(a, b) = (a / gcd(a, b)) * b}
     * </p>
     *
     * <p>
     * Dividing by the greatest common divisor first helps reduce the risk of
     * intermediate overflow.
     * </p>
     *
     * <p>
     * This method assumes that:
     * </p>
     * <ul>
     * <li>{@code a >= 1}</li>
     * <li>{@code b >= 1}</li>
     * <li>The final result fits within the range of the {@code long} type.</li>
     * </ul>
     *
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>{@code lcm(12, 18) = 36}</li>
     * <li>{@code lcm(5, 7) = 35}</li>
     * <li>{@code lcm(10, 25) = 50}</li>
     * </ul>
     *
     * @param a the first positive integer
     * @param b the second positive integer
     * @return the least common multiple of {@code a} and {@code b}
     */
    public static long calcLCM(long a, long b) {
        long gcd = calcGCD(a, b);
        return (a / gcd) * b;
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        long a, b, lcm;
        Scanner sc = new Scanner(System.in);

        // const variables
        final long MIN_VALUE = 1L;
        final long MAX_VALUE = 1_000_000_000L;

        // == Handle validation of input ===
        // check and get a
        a = readLong(sc, MIN_VALUE, MAX_VALUE);
        // check and get b
        b = readLong(sc, MIN_VALUE, MAX_VALUE);

        // === Handle the main logic of the program ===
        lcm = calcLCM(a, b);
        System.out.println(lcm);

        // === Handle closing of resources ===
        sc.close();
    }
}
