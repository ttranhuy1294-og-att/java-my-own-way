package ex_loops;

import java.util.Scanner;

public class PrintSquareNumbList {
    public static void main(String[] args) {
        // == Handle declarations ==
        Scanner sc = new Scanner(System.in);
        int n;

        final int MIN_RANGE = 1;
        final int MAX_RANGE = 10000;

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
            }
        }

        // == Handle logic ==
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i);
            if (i != n) {
                System.out.print(" ");
            }
        }

        // == Close scanner ==
        sc.close();
    }
}
