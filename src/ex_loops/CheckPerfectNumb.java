package ex_loops;

import java.util.Scanner;

public class CheckPerfectNumb {

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int n, number;
        long sum = 1L;
        // const variable
        // range validation
        final int MIN_N = 1;
        final int MAX_N = 4;

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
        number = 2;
        for (int i = 0; i < n;) {
            sum = 1L;
            for (int j = 2; j * j <= number; j++) {
                if (number % j == 0) {
                    sum += j;
                    if (j != number / j) {
                        sum += number / j;
                    }
                }
            }

            if (sum == number) {
                System.out.println(number);
                i++;
            }
            number++;
        }

        // close scanner
        sc.close();
    }
}
