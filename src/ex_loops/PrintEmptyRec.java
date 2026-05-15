package ex_loops;

import java.util.Scanner;

public class PrintEmptyRec {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int m, n;
        Scanner sc = new Scanner(System.in);

        // const variables
        final int MIN_SIZE = 2;
        final int MAX_SIZE = 50;

        // === Handle validation of input ===
        // check m
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Consume the invalid input
                continue;
            }

            m = sc.nextInt();
            if (MIN_SIZE <= m && m <= MAX_SIZE) {
                break;
            }
        }

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
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // === Handle closing of resources ===
        sc.close();
    }
}
