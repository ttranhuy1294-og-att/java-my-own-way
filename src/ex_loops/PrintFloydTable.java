package ex_loops;

import java.util.Scanner;

public class PrintFloydTable {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n, countNumber = 0;
        Scanner sc = new Scanner(System.in);

        // const variables
        final int MIN_SIZE = 1;
        final int MAX_SIZE = 20;

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
        countNumber = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(countNumber + " ");
                countNumber++;
            }
            System.out.println();
        }

        // === Handle closing of resources ===
        sc.close();
    }
}
