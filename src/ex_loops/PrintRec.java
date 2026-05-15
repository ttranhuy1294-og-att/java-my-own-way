package ex_loops;

import java.util.Scanner;

public class PrintRec {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        int n;
        Scanner sc = new Scanner(System.in);

        // === Handle validation of input ===
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Consume the invalid input
                continue;
            }

            n = sc.nextInt();
            if (1 <= n && n <= 50) {
                break;
            }
        }
        // === Handle the main logic of the program ===
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // === Handle closing of resources ===
        sc.close();
    }
}
