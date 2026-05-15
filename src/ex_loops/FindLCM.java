package ex_loops;

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        // == Handle declarations ==
        Scanner sc = new Scanner(System.in);
        long a, b, x, y;

        long MIN_RANGE = 1L;
        long MAX_RANGE = 1_000_000_000L;
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
        x = a;
        y = b;
        while (y != 0L) {
            long remainder = x % y;
            x = y;
            y = remainder;
        }

        // Calculate LCM using GCD
        long lcm = (a / x) * b; // LCM = (a * b) / GCD

        // == Handle output ==
        System.out.println(lcm);

        // == Close scanner ==
        sc.close();
    }
}
