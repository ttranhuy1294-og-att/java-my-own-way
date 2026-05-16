package ex_loops;

import java.util.Scanner;

public class ArmStrongNumbList {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int n, temp, digitCount = 0;
        long sum = 0L;
        // const variable
        final int MIN_N = 1;
        final int MAX_N = 100000;

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
        for (int i = 1; i <= n; i++) {
            temp = i;
            digitCount = 0;
            sum = 0L;

            // count digits
            while (temp > 0) {
                temp /= 10;
                digitCount++;
            }

            // calculate sum of digits raised to the power of digit count
            temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (long) Math.pow(digit, digitCount);
                temp /= 10;
            }

            // check if the number is an Armstrong number
            if (sum == i) {
                System.out.println(i);
            }
        }

        // close scanner
        sc.close();
    }
}
