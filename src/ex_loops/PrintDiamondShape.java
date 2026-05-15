package ex_loops;

import java.util.Scanner;

public class PrintDiamondShape {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n;
        Scanner sc = new Scanner(System.in);

        // const variables
        final int MIN_SIZE = 2;
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
        for (int i = 1; i <= 2 * n - 1; i++) {
            // calculate the number of spaces and stars for the current line
            int distance = Math.abs(n - i);
            int spaceCount = distance;
            int starCount = 2 * (n - distance) - 1;

            // print space (n-i)
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }

            // print *
            for (int k = 1; k <= starCount; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // === Handle closing of resources ===
        sc.close();
    }
}
