package ex_loops;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long n;
        // const variable
        final long MIN_N = 0L;
        final long MAX_N = 1000000000000000000L;

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
        if (n < 10) {
            sum += n;
        } else {
            while (n > 0) {
                sum += n % 10;
                n /= 10L;
            }
        }

        System.out.println(sum);

        // close scanner
        sc.close();
    }
}
