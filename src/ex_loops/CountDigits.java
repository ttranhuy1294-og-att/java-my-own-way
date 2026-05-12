package ex_loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int count = 0;
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
            count = 1;
        } else if (n < 100) {
            count = 2;
        } else {
            while (n > 0) {
                n /= 10L;
                count++;
            }
        }

        System.out.println(count);

        // close scanner
        sc.close();
    }
}
