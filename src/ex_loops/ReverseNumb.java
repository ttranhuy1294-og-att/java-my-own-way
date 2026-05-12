package ex_loops;

import java.util.Scanner;

public class ReverseNumb {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n, reversedNumb = 0L;
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
        if (n < 10L) {
            reversedNumb = n;
        } else {
            for (; n > 0L; n /= 10L) {
                reversedNumb *= 10L;
                reversedNumb += n % 10L;
            }
        }

        System.out.println(reversedNumb);

        // close scanner
        sc.close();
    }
}
