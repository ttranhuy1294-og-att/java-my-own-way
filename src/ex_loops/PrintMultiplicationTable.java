package ex_loops;

import java.util.Scanner;

public class PrintMultiplicationTable {
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
            if (1 <= n && n <= 100) {
                break;
            }
        }

        // Handle logic
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        // close scanner
        sc.close();
    }
}
