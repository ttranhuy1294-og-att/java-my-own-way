package ex_loops;

import java.util.Scanner;

public class PrintOddNumbs {
    public static void main(String[] args) {
        // Handle declaration
        Scanner sc = new Scanner(System.in);
        int n;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            n = sc.nextInt();
            if (1 <= n && n <= 1000) {
                break;
            }
        }

        // Handle logic
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        // close scanner
        sc.close();
    }
}
