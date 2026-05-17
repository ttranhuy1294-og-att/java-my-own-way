package ex_loops;

import java.util.Scanner;

public class PrintChessStars {
    public static void main(String[] args) {
        // == Handle declarations ==
        Scanner sc = new Scanner(System.in);
        int n;

        final int MIN_RANGE = 2;
        final int MAX_RANGE = 50;

        // == Handle validation ==
        // check n
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input
                continue;
            }
            n = sc.nextInt();
            if (MIN_RANGE <= n && n <= MAX_RANGE) {
                break;
            } else {
                System.out.println(
                        "Input out of range. Please enter an integer between " + MIN_RANGE + " and " + MAX_RANGE + ".");
            }
        }

        // == Handle logic ==
        for (int row = 1; row <= n; row++) {
            int leadingSpaces = (row % 2 == 0) ? 1 : 0;
            int starsCount = n - leadingSpaces;
            
            // Print leading space if needed
            for (int i = 1; i <= leadingSpaces; i++) {
                System.out.print(" ");
            }

            // Print stars
            for (int i = 1; i <= starsCount; i++) {
                System.out.print("*");
                if (i < starsCount) {
                    System.out.print(" ");
                }
            }
            // new line
            System.out.println();
        }

        // == Close scanner ==
        sc.close();
    }
}
