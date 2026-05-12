package ex_loops;

import java.util.Scanner;

public class PrintFibNumbsList {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int numberOfFib;
        long fib = 0L, prevFib, currFib;

        // const variable
        // range validation
        final int MIN_N = 1;
        final int MAX_N = 50;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            numberOfFib = sc.nextInt();
            if (MIN_N <= numberOfFib && numberOfFib <= MAX_N) {
                break;
            }
        }

        // Handle logic
        if (numberOfFib == 1) {
            System.out.println(0);
        } else {
            // init f(0) = 0 and f(1) = 1
            prevFib = 0L;
            currFib = 1L;
            for (int i = 1; i <= numberOfFib; i++) {
                if (i > 1) {
                    System.out.print(" ");
                }

                if (i == 1) {
                    System.out.print(prevFib);
                } else if (i == 2) {
                    System.out.print(currFib);
                } else {
                    fib = prevFib + currFib;
                    prevFib = currFib;
                    currFib = fib;
                    System.out.print(fib);
                }
            }
        }

        // close scanner
        sc.close();
    }
}
