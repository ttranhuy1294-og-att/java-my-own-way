package ex_loops;

import java.util.Scanner;

public class CalcSumDivisors {

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n, sum = 0L;

        // const variable
        // range validation
        final long MIN_N = 1L;
        final long MAX_N = 1_000_000_000_000L;

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
        for (long i = 1L; i * i <= n; i++) {
            if (n % i == 0L) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        System.out.println(sum);

        // close scanner
        sc.close();
    }
}
