package ex_loops;

import java.util.Scanner;

public class PrintSquareNumbList {
    public static void main(String[] args) {
        // === Handle declaration and initialization of variables ===
        Scanner sc = new Scanner(System.in);
        long a, b, count = 0;
        long start, end;
        // const variables
        final long MIN_SIZE = 0;
        final long MAX_SIZE = 1_000_000_000_000_000_000L;

        // === Handle validation of input ===

        // check a
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.println("Invalid input. Please enter a long integer.");
                sc.next(); // Consume the invalid input
                continue;
            }

            a = sc.nextLong();
            if (MIN_SIZE <= a && a <= MAX_SIZE) {
                break;
            }
        }

        // check b
        while (true) {
            if (!sc.hasNextLong()) {
                System.out.println("Invalid input. Please enter a long integer.");
                sc.next(); // Consume the invalid input
                continue;
            }

            b = sc.nextLong();
            if (a <= b && MIN_SIZE <= b && b <= MAX_SIZE) {
                break;
            }
        }

        // === Handle the main logic of the program ===
        start = (long) Math.sqrt(a);
        end = (long) Math.sqrt(b);
        if (start * start < a) {
            start++;
        }

        if (end * end > b) {
            end--;
        }

        count = end - start + 1;
        if (count < 0) {
            count = 0;
        }

        // === Handle output of the program ===
        System.out.println(count);

        // === Handle closing of resources ===
        sc.close();
    }
}
