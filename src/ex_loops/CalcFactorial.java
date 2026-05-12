package ex_loops;

import java.util.Scanner;

public class CalcFactorial {
    public static void main(String[] args) {
        // Handle declaration
        Scanner sc = new Scanner(System.in);
        int n;
        long factorial = 1;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            n = sc.nextInt();
            if (0 <= n && n <= 20) {
                break;
            }
        }

        // Handle logic
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        // close scanner
        sc.close();
    }
}
