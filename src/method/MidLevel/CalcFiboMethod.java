package method.MidLevel;

import java.util.Scanner;

public class CalcFiboMethod {
    /**
     * Reads and validates an {@code int} value within
     * an inclusive range.
     *
     * <p>
     * The method repeatedly prompts the user until a valid
     * {@code int} within the specified range is entered.
     * </p>
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
     *         a validated {@code int} value within the
     *         inclusive range
     */
    public static int readInt(Scanner sc, String prompt, int minValue, int maxValue) {

        if (prompt != null && !prompt.isEmpty()) {
            System.out.print(prompt);
        }

        int result = 0;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                sc.nextLine(); // consume the invalid input
                continue;
            }
            result = sc.nextInt();
            if (result < minValue || result > maxValue) {
                System.out.print("Please enter an integer between " + minValue + " and " + maxValue + ": ");
            }
            break;
        }

        // consume the remaining newline character after reading the integer
        sc.nextLine();
        return result;
    }

    /**
     * Calculates the {@code n}-th Fibonacci number.
     *
     * <p>
     * The Fibonacci sequence is defined as:
     * </p>
     *
     * <pre>{@code
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)
     * }</pre>
     *
     * <p>
     * This implementation uses an iterative approach
     * with constant extra memory.
     * </p>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * fibonacci(0); // returns 0
     * fibonacci(1); // returns 1
     * fibonacci(10); // returns 55
     * }</pre>
     *
     * @param n
     *          the Fibonacci index
     *
     * @return
     *         the {@code n}-th Fibonacci number
     */
    public static long calcFibo(int n) {
        long f0 = 0, f1 = 1;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long fN;
        for (int i = 2; i <= n; i++) {
            fN = f0 + f1;
            f0 = f1;
            f1 = fN;
        }
        return f1;
    }

    public static void main(String[] args) {
        // === Handle initialization ===
        Scanner sc = new Scanner(System.in);
        int n;
        long fibo;
        // constants

        // === Handle input ===
        n = readInt(sc, null, 0, 90);

        // === Handle processing ===
        fibo = calcFibo(n);
        // === Handle output ===
        System.out.println(fibo);

        // === Handle termination resources ===
        sc.close();
    }
}
