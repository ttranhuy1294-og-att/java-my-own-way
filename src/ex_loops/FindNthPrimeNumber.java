package ex_loops;

import java.util.Scanner;

public class FindNthPrimeNumber {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int k, count = 0;
        long n;
        boolean isPrime = true;

        // const variable
        // range validation
        final int MIN_RANGE = 1;
        final int MAX_RANGE = 100000;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            k = sc.nextInt();
            if (MIN_RANGE <= k && k <= MAX_RANGE) {
                break;
            }
        }

        // Handle logic
        n = 1L;
        while (count < k) {
            n++;
            isPrime = true;
            if (n <= 1L) {
                isPrime = false;
            } else if (n <= 3L) {
                isPrime = true;
            } else if (n % 2L == 0L || n % 3L == 0L) {
                isPrime = false;
            } else {
                for (long i = 5L; i * i <= n; i += 6L) {
                    if (n % i == 0L || n % (i + 2L) == 0L) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println(n);

        // close scanner
        sc.close();
    }
}
