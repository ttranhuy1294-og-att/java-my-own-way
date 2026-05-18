package method.EzLevel;

import java.util.Scanner;

public class FindMaxMethod {
    /**
     * Finds the maximum of 3 numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the maximum of num1, num2, and num3
     */
    public static long findMax(long num1, long num2, long num3) {
        long max = num1;
        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        long a, b, c;
        Scanner sc = new Scanner(System.in);

        // const variables
        final long MIN_VALUE = -1_000_000_000L;
        final long MAX_VALUE = 1_000_000_000L;

        // == Handle validation of input ===
        // check a
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
            a = sc.nextLong();
            if (MIN_VALUE <= a && a <= MAX_VALUE) {
                break;
            }
            System.out.println(
                    "Input out of range. Please enter a value between " + MIN_VALUE + " and " + MAX_VALUE + ".");

        }

        // check b
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
            b = sc.nextLong();
            if (MIN_VALUE <= b && b <= MAX_VALUE) {
                break;
            }
            System.out.println(
                    "Input out of range. Please enter a value between " + MIN_VALUE + " and " + MAX_VALUE + ".");
        }

        // check c
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
            c = sc.nextLong();
            if (MIN_VALUE <= c && c <= MAX_VALUE) {
                break;
            }
            System.out.println(
                    "Input out of range. Please enter a value between " + MIN_VALUE + " and " + MAX_VALUE + ".");
        }
        // === Handle the main logic of the program ===
        long max = findMax(a, b, c);
        System.out.println(max);

        // === Handle closing of resources ===
        sc.close();
    }
}
