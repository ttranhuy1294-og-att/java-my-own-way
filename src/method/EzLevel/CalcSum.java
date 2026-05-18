package method.EzLevel;

import java.util.Scanner;

public class CalcSum {
    /**
     * Calculates the sum of two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public static long calculateSum(long num1, long num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        long a, b;
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

        // === Handle the main logic of the program ===
        long sum = calculateSum(a, b);
        System.out.println(sum);

        // === Handle closing of resources ===
        sc.close();
    }
}
