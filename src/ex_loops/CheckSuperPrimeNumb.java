package ex_loops;

import java.util.Scanner;

public class CheckSuperPrimeNumb {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n, temp;
        boolean isSuperPrime = true;

        // const variable
        // range validation
        final long MIN_RANGE = 1L;
        final long MAX_RANGE = 1_000_000_000L;

        // Handle validation
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                continue;
            }

            n = sc.nextLong();
            if (MIN_RANGE <= n && n <= MAX_RANGE) {
                break;
            }
        }

        // Handle logic

        temp = n;
        while (temp > 0L) {
            boolean isPrime = true;
            if (temp <= 1L) {
                isPrime = false;
            } else if (temp > 3L && (temp % 2L == 0L || temp % 3L == 0L)) {
                isPrime = false;
            } else {
                for (long i = 5L; i * i <= temp; i += 6L) {
                    if (temp % i == 0L || temp % (i + 2L) == 0L) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (!isPrime) {
                isSuperPrime = false;
                break;
            }

            temp /= 10L;
        }

        System.out.println(isSuperPrime ? "YES" : "NO");

        // close scanner
        sc.close();
    }
}
