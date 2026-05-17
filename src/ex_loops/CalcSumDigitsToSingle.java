package ex_loops;

import java.util.Scanner;

public class CalcSumDigitsToSingle {
    public static void main(String[] args) {
        // == Handle declarations ==
        Scanner sc = new Scanner(System.in);
        long n;

        final long MIN_RANGE = 0L;
        final long MAX_RANGE = 1_000_000_000_000_000_000L;

        // == Handle validation ==
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.println("Invalid input. Please enter a long integer.");
                sc.next(); // Clear the invalid input
                continue;
            }
            n = sc.nextLong();
            if (MIN_RANGE <= n && n <= MAX_RANGE) {
                break;
            } else {
                System.out.println(
                        "Input out of range. Please enter a long integer between " + MIN_RANGE + " and " + MAX_RANGE
                                + ".");
            }
        }

        // == Handle main logic ==
        while (n >= 10L) {
            long sum = 0L;
            // Calculate the sum of the digits of sum
            while (n > 0L) {
                sum += n % 10L; // Add the last digit to sum
                n /= 10L; // Remove the last digit
            }
            n = sum; // Update n with the new value of sum for the next iteration
        }

        System.out.println(n);

        // == Handle closing of resources ==
        sc.close();
    }
}
