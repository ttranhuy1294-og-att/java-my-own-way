package ex_loops;

import java.util.Scanner;

public class CountDivisors {

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n;
        long divisorCount = 1L;
        int exp = 0;

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
        for (long i = 2L; i * i <= n; i++) {
            exp = 0;
            while (n % i == 0) {
                n /= i;
                exp++;
            }

            if (exp > 0) {
                divisorCount *= (long) (exp + 1);
            }
        }

        if (n > 1L) {
            divisorCount *= 2L;
        }

        System.out.println(divisorCount);
        // close scanner
        sc.close();
    }
}
