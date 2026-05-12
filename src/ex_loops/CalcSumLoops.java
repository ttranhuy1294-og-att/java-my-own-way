package ex_loops;

import java.util.Scanner;

public class CalcSumLoops {
    public static void main(String[] args) {
        // Handle declaration
        Scanner sc = new Scanner(System.in);
        int n;
        long sum = 0;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            n = sc.nextInt();
            if (1 <= n && n <= 1000000) {
                break;
            }
        }

        // Handle logic
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);

        // close scanner
        sc.close();
    }
}
