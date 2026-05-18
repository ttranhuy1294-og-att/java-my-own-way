package method.EzLevel;

import java.util.Scanner;

public class CheckEvenMethod {
    /**
     * Checks if a number is even.
     *
     * @param numb the number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(long numb) {
        return numb % 2 == 0;
    }

    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        long a;
        Scanner sc = new Scanner(System.in);

        // const variables
        // Define the minimum and maximum values for input
        final long MIN_VALUE = -1_000_000_000L;
        final long MAX_VALUE = 1_000_000_000L;

        // Define result message
        final String ACCEPT_MSG = "YES";
        final String REJECT_MSG = "NO";

        // == Handle validation of input ===
        // check a
        while (true) {
            if (!sc.hasNextLong()) {
                sc.next();
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
            a = sc.nextLong();
            if (MIN_VALUE <= a && a <= MAX_VALUE) {
                break;
            }
            System.out.println(
                    "Input out of range. Please enter a value between " + MIN_VALUE + " and " + MAX_VALUE + ".");

        }

        // === Handle the main logic of the program ===
        System.out.println(isEven(a) ? ACCEPT_MSG : REJECT_MSG);

        // === Handle closing of resources ===
        sc.close();
    }
}
