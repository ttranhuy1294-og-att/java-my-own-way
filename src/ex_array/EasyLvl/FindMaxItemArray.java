package ex_array.EasyLvl;

import java.util.Scanner;

public class FindMaxItemArray {
    // ===== Start readInt overloads =====
    /**
     * Reads and validates an {@code int} value.
     *
     * <p>
     * This overload accepts the full {@code int} range
     * and does not display a custom prompt message.
     * </p>
     *
     * @param sc
     *           the {@code Scanner} used for reading user input
     *
     * @return
     *         a validated {@code int} value
     */
    public static int readInt(Scanner sc) {
        return readInt(sc, null, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates an {@code int} value
     * using a custom prompt message.
     *
     * <p>
     * This overload accepts the full {@code int} range.
     * </p>
     *
     * @param sc
     *               the {@code Scanner} used for reading user input
     *
     * @param prompt
     *               the message displayed before reading input;
     *               may be {@code null} or empty
     *
     * @return
     *         a validated {@code int} value
     */
    public static int readInt(Scanner sc, String prompt) {
        return readInt(sc, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates an {@code int} value greater
     * than or equal to {@code minValue}.
     *
     * <p>
     * This overload does not display a custom prompt message.
     * </p>
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param minValue
     *                 the minimum accepted value
     *
     * @return
     *         a validated {@code int} value greater than
     *         or equal to {@code minValue}
     */
    public static int readInt(Scanner sc, int minValue) {
        return readInt(sc, null, minValue, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates an {@code int} value greater
     * than or equal to {@code minValue}
     * using a custom prompt message.
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
     *         a validated {@code int} value greater than
     *         or equal to {@code minValue}
     */
    public static int readInt(Scanner sc, String prompt, int minValue) {
        return readInt(sc, prompt, minValue, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates an {@code int} value within
     * the inclusive range {@code [minValue, maxValue]}.
     *
     * <p>
     * This overload does not display a custom prompt message.
     * </p>
     *
     * <h2>Validation Rules</h2>
     *
     * <ul>
     * <li>
     * Non-integer input is rejected.
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
     *         a validated {@code int} value within the
     *         inclusive range
     *         {@code [minValue, maxValue]}
     */
    public static int readInt(Scanner sc, int minValue, int maxValue) {
        return readInt(
                sc,
                null,
                minValue,
                maxValue);
    }

    /**
     * Reads and validates an {@code int} value within
     * the inclusive range {@code [minValue, maxValue]}
     * using an optional prompt message.
     *
     * <p>
     * The method repeatedly prompts the user until a valid
     * integer within the inclusive range
     * {@code [minValue, maxValue]} is entered.
     * </p>
     *
     * <h2>Validation Rules</h2>
     *
     * <ul>
     * <li>
     * Non-integer input is rejected.
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
     * int age = readInt(
     *         sc,
     *         "Enter your age: ",
     *         0,
     *         150);
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
     *         a validated {@code int} value within the
     *         inclusive range
     *         {@code [minValue, maxValue]}
     */
    public static int readInt(Scanner sc, String prompt, int minValue, int maxValue) {

        int result = 0;
        if (prompt != null && !prompt.isEmpty()) {
            System.out.print(prompt);
        }
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

        return result;
    }
    // ===== End readInt overloads =====

    // ===== Start readArray overloads =====
    /**
     * Reads and validates values for every element
     * in the specified {@code int} array.
     *
     * <p>
     * This overload accepts the full {@code int} range
     * and does not display a custom prompt message.
     * </p>
     *
     * @param sc
     *            the {@code Scanner} used for reading user input
     *
     * @param arr
     *            the {@code int} array to store validated input values
     */
    public static void readArray(Scanner sc, int[] arr) {
        readArray(sc, arr, null, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates values for every element
     * in the specified {@code int} array
     * using a custom prompt message.
     *
     * <p>
     * This overload accepts the full {@code int} range.
     * </p>
     *
     * @param sc
     *               the {@code Scanner} used for reading user input
     *
     * @param arr
     *               the {@code int} array to store validated input values
     *
     * @param prompt
     *               the message displayed before reading each input value;
     *               may be {@code null} or empty
     */
    public static void readArray(Scanner sc, int[] arr, String prompt) {
        readArray(sc, arr, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates values for every element
     * in the specified {@code int} array greater
     * than or equal to {@code minValue}.
     *
     * <p>
     * This overload does not display a custom prompt message.
     * </p>
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param arr
     *                 the {@code int} array to store validated input values
     *
     * @param minValue
     *                 the minimum accepted value for each array element
     */
    public static void readArray(Scanner sc, int[] arr, int minValue) {
        readArray(sc, arr, null, minValue, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates values for every element
     * in the specified {@code int} array within
     * the inclusive range {@code [minValue, maxValue]}.
     *
     * <p>
     * This overload does not display a custom prompt message.
     * </p>
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param arr
     *                 the {@code int} array to store validated input values
     *
     * @param minValue
     *                 the minimum accepted value for each array element
     *
     * @param maxValue
     *                 the maximum accepted value for each array element
     */
    public static void readArray(Scanner sc, int[] arr, int minValue, int maxValue) {
        readArray(sc, arr, null, minValue, maxValue);
    }

    /**
     * Reads and validates values for every element
     * in the specified {@code int} array greater
     * than or equal to {@code minValue}
     * using a custom prompt message.
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param arr
     *                 the {@code int} array to store validated input values
     *
     * @param prompt
     *                 the message displayed before reading each input value;
     *                 may be {@code null} or empty
     *
     * @param minValue
     *                 the minimum accepted value for each array element
     */
    public static void readArray(Scanner sc, int[] arr, String prompt, int minValue) {
        readArray(sc, arr, prompt, minValue, Integer.MAX_VALUE);
    }

    /**
     * Reads and validates values for every element
     * in the specified {@code int} array within
     * the inclusive range {@code [minValue, maxValue]}
     * using a custom prompt message.
     *
     * <p>
     * Each element must satisfy the inclusive range
     * constraint {@code [minValue, maxValue]}.
     * </p>
     *
     * @param sc
     *                 the {@code Scanner} used for reading user input
     *
     * @param arr
     *                 the {@code int} array to store validated input values
     *
     * @param prompt
     *                 the message displayed before reading each input value;
     *                 may be {@code null} or empty
     *
     * @param minValue
     *                 the minimum accepted value for each array element
     *
     * @param maxValue
     *                 the maximum accepted value for each array element
     */
    public static void readArray(Scanner sc, int[] arr, String prompt, int minValue, int maxValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readInt(sc, prompt, minValue, maxValue);
        }
    }
    // ===== End readArray overloads =====

    // ===== Find maximum item in array methods =====
    /**
     * Finds the index of the largest element
     * in the specified {@code int} array.
     *
     * <p>
     * If multiple elements share the same maximum value,
     * the index of the first occurrence is returned.
     * </p>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * int[] arr = { 3, 8, 2, 8, 5 };
     *
     * int maxIdx = findMaxItemIdx(arr);
     *
     * System.out.println(maxIdx);
     * // Output: 1
     * }</pre>
     *
     * @param arr
     *            the {@code int} array to search
     *
     * @return
     *         the index of the largest element
     *         in the array
     *
     * @throws IllegalArgumentException
     *                                  if {@code arr} is {@code null}
     *                                  or empty
     */
    public static int findMaxIdx(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void main(String[] args) {
        // === Handle initialization ===
        Scanner sc = new Scanner(System.in);
        int n, maxItemIdx;
        int[] arr;
        // constants
        final int MIN_ARRAY_SIZE = 1;
        final int MAX_ARRAY_SIZE = 1_00_000;
        final int MIN_ARRAY_EL_VALUE = -1_000_000_000;
        final int MAX_ARRAY_EL_VALUE = 1_000_000_000;

        // === Handle input ===
        n = readInt(sc, MIN_ARRAY_SIZE, MAX_ARRAY_SIZE);
        arr = new int[n];
        // === Handle processing ===
        readArray(sc, arr, MIN_ARRAY_EL_VALUE, MAX_ARRAY_EL_VALUE);

        // === Handle output ===
        maxItemIdx = findMaxIdx(arr);
        System.out.println(arr[maxItemIdx]);
        // === Handle termination resources ===
        sc.close();
    }

}
