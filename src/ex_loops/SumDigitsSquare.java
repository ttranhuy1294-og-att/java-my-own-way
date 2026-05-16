package ex_loops;

import java.util.Scanner;

public class SumDigitsSquare {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int sum = 0, digit;
        long n;
        // const variable
        final long MIN_N = 0L;
        final long MAX_N = 1_000_000_000_000_000_000L;

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
        // extract last digit
        if (n < 10L) {
            sum += n*n;
        } else {
            while (n > 0) {
                digit = (int) (n % 10L);
                sum += digit * digit;
                n /= 10L;
            }
        }

        System.out.println(sum);

        // close scanner
        sc.close();
    }
}
