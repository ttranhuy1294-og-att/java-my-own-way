package ex_loops;

import java.util.Scanner;

public class PrintDivisorsList {

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int n;

        // const variable
        // range validation
        final int MIN_N = 1;
        final int MAX_N = 1_000_000;

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
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        }

        // check if n is a squared number
        int sqrtN = (int) Math.sqrt(n);
        if (sqrtN * sqrtN == n) {
            sqrtN--;
        }

        for (int i = sqrtN; i >= 1; i--) {
            if (n % i == 0) {
                System.out.print(" " + (n / i));
            }
        }
        // close scanner
        sc.close();
    }
}
