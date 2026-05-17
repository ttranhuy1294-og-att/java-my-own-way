package ex_loops;

import java.util.Scanner;

public class CountCollazSteps {

    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int n, stepCount = 0;

        // const variable
        // range validation
        final int MIN_RANGE = 1;
        final int MAX_RANGE = 1_000_000;

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }

            n = sc.nextInt();
            if (MIN_RANGE <= n && n <= MAX_RANGE) {
                break;
            }
            System.out.println(
                    "Input out of range. Please enter an integer between " + MIN_RANGE + " and " + MAX_RANGE + ".");
        }

        // Handle logic
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            stepCount++;
        }
        System.out.println(stepCount);
        // close scanner
        sc.close();
    }
}
