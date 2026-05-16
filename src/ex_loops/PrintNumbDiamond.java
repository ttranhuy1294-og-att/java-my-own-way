package ex_loops;

import java.util.Scanner;

public class PrintNumbDiamond {
    public static void main(String[] args) {
        // == Handle declarations ==
        Scanner sc = new Scanner(System.in);
        int n;

        final int MIN_RANGE = 2;
        final int MAX_RANGE = 9;

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
        for (int row = 1; row <= 2 * n - 1; row++) {
            int distance = Math.abs(n - row);
            int k = n - distance;
            // print space
            for (int space = 1; space <= distance; space++) {
                System.out.print(" ");
            }

            // print number upto k
            for (int numb = 1; numb <= k; numb++) {
                System.out.print(numb);
            }

            // print number from k-1 to 1
            for (int numb = k - 1; numb >= 1; numb--) {
                System.out.print(numb);
            }

            // new line
            System.out.println();
        }

        // == Close scanner ==
        sc.close();
    }
}
