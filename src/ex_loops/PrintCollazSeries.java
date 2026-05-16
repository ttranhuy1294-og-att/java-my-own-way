package ex_loops;

import java.util.Scanner;

public class PrintCollazSeries {

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n;

        // const variable
        // range validation
        final long MIN_N = 1L;
        final long MAX_N = 1_000_000L;

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
        while (n != 1L) {
            System.out.print(n + " ");
            if (n % 2L == 0L) {
                n /= 2L;
            } else {
                n = 3L * n + 1L;
            }
        }

        System.out.println(n);
        // close scanner
        sc.close();
    }
}
