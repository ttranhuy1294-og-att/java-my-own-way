package ex_loops;

import java.util.Scanner;

public class PrintIsoscelesTriangleRev {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n;
        Scanner sc = new Scanner(System.in);

        // const variables
        final int MIN_SIZE = 1;
        final int MAX_SIZE = 50;

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
        for (int i = 1; i <= n; i++) {

            // print space (n-i)
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // print *
            int maxStarCount = 2 * (n - i + 1) - 1;
            for (int k = 1; k <= maxStarCount; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // === Handle closing of resources ===
        sc.close();
    }
}
