package bt_if_else;

import java.util.Scanner;

public class SimplifyFrac {
    public static void main(String[] args) {
        // handle declaration
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);

        // handle validation
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
            if (-1000000000 <= b && b <= 1000000000 && b != 0) {
                break;
            }
        }

        // handle logic
        if (a == 0) {
            System.out.println("0/1");
        } else {
            if (b < 0) {
                a = a * -1;
                b = b * -1;
            }

            int x = Math.abs(a);
            int y = Math.abs(b);

            int gcd = 1;

            while (y != 0) {
                int r = x % y;
                x = y;
                y = r;
            }

            gcd = x;

            a = a / gcd;
            b = b / gcd;

            System.out.println(a + "/" + b);
        }
        // close scanner

        sc.close();
    }
}
