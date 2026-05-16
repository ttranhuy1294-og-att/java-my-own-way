package ex_loops;

import java.util.Scanner;

public class ArmStrongNumb {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int digitCount = 0;
        long n, temp, digit, sum = 0L;
        // const variable
        final long MIN_N = 0L;
        final long MAX_N = 1_000_000_000L;

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
        // count digits
        temp = n;
        if (temp == 0L) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                temp /= 10L;
                digitCount++;
            }
        }

        temp = n;
        if (temp == 0L) {
            sum = 0L;
        } else {
            while (temp > 0) {
                digit = (temp % 10L);
                sum += (long) Math.pow(digit, digitCount);
                temp /= 10L;
            }
        }

        // check & print result
        System.out.println((sum == n) ? "YES" : "NO");

        // close scanner
        sc.close();
    }
}
