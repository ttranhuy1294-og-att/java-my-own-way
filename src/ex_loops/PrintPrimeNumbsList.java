package ex_loops;

import java.util.Scanner;

public class PrintPrimeNumbsList {
    /**
     * Checks whether a number is prime.
     *
     * A prime number:
     * - is greater than 1
     * - has exactly two divisors: 1 and itself
     *
     * This method uses two optimizations:
     * 1. Only checks divisors up to sqrt(n)
     * 2. After removing multiples of 2 and 3, only checks numbers
     * of the form 6k - 1 and 6k + 1
     *
     * @param n the number to test
     * @return true if n is prime, otherwise false
     */

    public static boolean checkPrime(long n) {
        if (n == 1L) {
            return false;
        } else if (n <= 3L) {
            return true;
        } else if (n % 2L == 0L || n % 3L == 0L) {
            return false;
        } else {
            for (long i = 5L; i * i <= n; i += 6L) {
                if (n % i == 0L || n % (i + 2L) == 0L) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n;

        // const variable
        // range validation
        final long MIN_N = 1L;
        final long MAX_N = 1000000000L;
        // message
        final String ACCEPT_MESS = "YES";
        final String REJECT_MESS = "NO";

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
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // close scanner
        sc.close();
    }
}
