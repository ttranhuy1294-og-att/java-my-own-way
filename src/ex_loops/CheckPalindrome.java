package ex_loops;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        long n, tempN, reversedNumb = 0L;

        // const variable
        // range validation
        final long MIN_N = 0L;
        final long MAX_N = 1000000000000000000L;
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
        // extract last digit
        tempN = n;
        if (tempN < 10L) {
            reversedNumb = n;
        } else {
            for (; tempN > 0L; tempN /= 10L) {
                reversedNumb *= 10L;
                reversedNumb += tempN % 10L;
            }
        }

        System.out.println((reversedNumb == n) ? ACCEPT_MESS : REJECT_MESS);

        // close scanner
        sc.close();
    }
}
