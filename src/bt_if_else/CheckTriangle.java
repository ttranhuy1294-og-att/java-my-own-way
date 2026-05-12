package bt_if_else;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        // --- Handle validation
        // check a
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            a = sc.nextInt();
            if (1 <= a && a <= 10000) {
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
            if (1 <= b && b <= 10000) {
                break;
            }
        }
        // check c
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            c = sc.nextInt();
            if (1 <= c && c <= 10000) {
                break;
            }
        }

        // --- Handle logic & validation
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("INVALID");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        // --- close scanner
        sc.close();
    }
}
