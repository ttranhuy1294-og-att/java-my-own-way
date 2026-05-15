package ex_loops;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        // == Handle declarations ==
        Scanner sc = new Scanner(System.in);
        long a, b;

        long MIN_RANGE = 1L;
        long MAX_RANGE = 1_000_000_000_000_000_000L;
        // == Handle validation ==
        // check a
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input
                continue;
            }
            a = sc.nextLong();
            if (MIN_RANGE <= a && a <= MAX_RANGE) {
                break;
            }
        }

        // check b
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input
                continue;
            }
            b = sc.nextLong();
            if (MIN_RANGE <= b && b <= MAX_RANGE) {
                break;
            }
        }

        // == Handle logic ==
        while (b != 0) {
            long remainder = b;
            b = a % b;
            a = remainder;
        }
        System.out.println(a);

        // == Close scanner ==
        sc.close();
    }
}
