package ex_loops;

import java.util.Scanner;

public class PrimeFactorize {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        Scanner sc = new Scanner(System.in);
        long n;
        boolean isFirst = true;

        // const variables
        final long MIN_SIZE = 2;
        final long MAX_SIZE = 1_000_000_000_000L;

        // === Handle validation of input ===

        // check n
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.println("Invalid input. Please enter a long integer.");
                sc.next(); // Consume the invalid input
                continue;
            }

            n = sc.nextLong();
            if (MIN_SIZE <= n && n <= MAX_SIZE) {
                break;
            }
        }

        // === Handle the main logic of the program ===
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                System.out.print(i);
                n /= i;
                isFirst = false;
            }
        }

        if (n > 1) {
            if (!isFirst) {
                System.out.print(" ");
            }
            System.out.print(n);
        }

        // === Handle closing of resources ===
        sc.close();
    }
}
