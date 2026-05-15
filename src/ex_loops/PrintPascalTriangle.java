package ex_loops;

import java.util.Scanner;

public class PrintPascalTriangle {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n;
        long c = 1L;
        Scanner sc = new Scanner(System.in);

        // const variables
        final int MIN_SIZE = 0;
        final int MAX_SIZE = 30;

        // === Handle validation of input ===

        // check n
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Consume the invalid input
                continue;
            }

            n = sc.nextInt();
            if (MIN_SIZE <= n && n <= MAX_SIZE) {
                break;
            }
        }

        // === Handle the main logic of the program ===
        for (int i = 0; i <= n; i++) {
            System.out.print(c);
            if (i < n) {
                System.out.print(" ");
            }
            c *= (n - i);
            c /= (i + 1);
        }

        System.out.println();
        // === Handle closing of resources ===
        sc.close();
    }
}
