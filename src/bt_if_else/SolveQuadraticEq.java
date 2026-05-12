package bt_if_else;

import java.util.Scanner;

public class SolveQuadraticEq {
    public static void main(String[] args) {
        // --- Handle declaration
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        final double EPS = 1e-9;

        // --- Handle validation
        // check a
        while (true) {
            if (!sc.hasNextDouble()) {
                sc.next();
                continue;
            }
            a = sc.nextDouble();
            if (-1000.0 <= a && a <= 1000.0) {
                break;
            }
        }

        // check b
        while (true) {
            if (!sc.hasNextDouble()) {
                sc.next();
                continue;
            }
            b = sc.nextDouble();
            if (-1000.0 <= b && b <= 1000.0) {
                break;
            }
        }

        // check c
        while (true) {
            if (!sc.hasNextDouble()) {
                sc.next();
                continue;
            }
            c = sc.nextDouble();
            if (-1000.0 <= c && c <= 1000.0) {
                break;
            }
        }

        // --- Handle logic
        // --- Case 1: When a = 0, handle like simple equation
        if (Math.abs(a) < EPS) {
            if (Math.abs(b) < EPS) {
                if (Math.abs(c) < EPS) {
                    System.out.println("INF");
                } else {
                    System.out.println("NO");
                }
            } else {
                double x = -c / b;
                System.out.printf("%.2f", x);
            }
        } else {
            double delta = Math.pow(b, 2.0) - 4.0 * a * c;
            if (delta < -EPS) {
                System.out.println("NO");
            } else if (Math.abs(delta) < EPS) {
                double x = -b / (2 * a);
                System.out.printf("%.2f", x);
            } else {
                double deltaSqrt = Math.sqrt(delta);
                double x1 = (-b - deltaSqrt) / (2.0 * a);
                double x2 = (-b + deltaSqrt) / (2.0 * a);
                if (x1 > x2) {
                    x1 = x1 + x2;
                    x2 = x1 - x2;
                    x1 = x1 - x2;
                }

                System.out.printf("%.2f %.2f\n", x1, x2);
            }
        }

        // close scanner
        sc.close();
    }
}
