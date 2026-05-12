package ex_loops;

import java.util.Scanner;

public class PrintFibNumb {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int n;
        long fib = 0L, prev, curr;

        // const variable
        // range validation
        final int MIN_N = 0;
        final int MAX_N = 90;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            n = sc.nextInt();
            if (MIN_N <= n && n <= MAX_N) {
                break;
            }
        }

        // Handle logic
        if (n == 0) {
            fib = 0L;
        } else if (n < 3) {
            fib = 1L;
        } else {
            prev = 0L;
            curr = 1L;
            for (int i = 2; i <= n; i++) {
                fib = prev + curr;
                prev = curr;
                curr = fib;
            }
        }

        System.out.println(fib);

        // close scanner
        sc.close();
    }
}
