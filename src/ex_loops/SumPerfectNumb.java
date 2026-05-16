package ex_loops;

import java.util.Scanner;

public class SumPerfectNumb {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int n, sumPerfect = 0;
        // const variable
        final int MIN_N = 1;
        final int MAX_N = 10000;

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
            int sumDiv = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    // we found a divisor, add it to the sum
                    // exclude the number itself
                    if (j != i) {
                        sumDiv += j;
                    }
                    int otherDiv = i / j;
                    // if the other divisor is not the same as j and not the number itself, add it
                    // to the sum
                    if (otherDiv != i && otherDiv != j) {
                        sumDiv += otherDiv;
                    }
                }
            }

            if (sumDiv == i) {
                sumPerfect += i;
            }
        }

        // print result
        System.out.println(sumPerfect);
        // close scanner
        sc.close();
    }
}
