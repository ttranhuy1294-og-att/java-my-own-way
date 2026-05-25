package method.MidLevel;

import java.util.Scanner;

public class CalcCombiMethod {
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
     * Calculates the binomial coefficient C(n, k), also known as the number of
     * combinations.
     *
     * <p>
     * C(n, k) represents the number of ways to choose {@code k} items from
     * {@code n} distinct items, where the order of selection does not matter.
     * </p>
     *
     * <p>
     * Mathematical definition:
     * </p>
     *
     * C(n, k) = n! / (k! * (n - k)!)
     *
     * <p>
     * To avoid computing large factorials, this method uses the equivalent formula:
     * </p>
     *
     * C(n, k) =
     * [n × (n - 1) × (n - 2) × ... × (n - k + 1)]
     * / [1 × 2 × 3 × ... × k]
     *
     * <p>
     * The method also uses the symmetry property:
     * </p>
     *
     * C(n, k) = C(n, n - k)
     *
     * <p>
     * This allows the method to replace {@code k} with {@code n - k} when
     * {@code n - k} is smaller, reducing the number of iterations.
     * </p>
     *
     * <p>
     * Special case:
     * </p>
     * <ul>
     * <li>If {@code k > n}, the result is {@code 0}, because it is impossible
     * to choose more items than are available.</li>
     * </ul>
     *
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>{@code combination(5, 2) = 10}</li>
     * <li>{@code combination(10, 5) = 252}</li>
     * <li>{@code combination(3, 5) = 0}</li>
     * </ul>
     *
     * @param n the total number of items ({@code n >= 0})
     * @param k the number of items to choose ({@code k >= 0})
     * @return the value of {@code C(n, k)}, or {@code 0} if {@code k > n}
     */
    public static long calcCombination(int n, int k) {
        if (k > n) {
            return 0L;
        }
        if (k > n - k) {
            k = n - k;
        }

        long combination = 1L;
        for (int i = 1; i <= k; i++) {
            combination = combination * (n - i + 1) / i;
        }
        return combination;
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n, k;
        Scanner sc = new Scanner(System.in);

        // const variables
        // Define the minimum and maximum values for input
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 60;

        // == Handle validation of input ===
        // check and get n
        n = readInt(sc, MIN_VALUE, MAX_VALUE);
        k = readInt(sc, MIN_VALUE, MAX_VALUE);
        // === Handle the main logic of the program ===
        System.out.println(calcCombination(n, k));

        // === Handle closing of resources ===
        sc.close();
    }
}
