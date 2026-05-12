package bt_if_else;

import java.util.Scanner;

public class CheckWithinRange {
    public static void main(String[] args) {
        // --- Handle declaration
        int x, a, b;
        Scanner sc = new Scanner(System.in);
        boolean isWithin = true;

        // --- Handle validation
        // check x
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            x = sc.nextInt();
            if (-1000000000 <= x && x <= 1000000000) {
                break;
            }
        }

        // check a
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            a = sc.nextInt();
            if (-1000000000 <= a && a <= 1000000000) {
                break;
            }
        }

        // check b
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            b = sc.nextInt();
            if (-1000000000 <= b && b <= 1000000000 && a <= b) {
                break;
            }
        }

        // --- Handle logic
        isWithin = a <= x && x <= b;
        if (isWithin) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // Close scanner
        sc.close();
    }
}
