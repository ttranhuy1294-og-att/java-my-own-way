package bt_if_else;

import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        // --- Handle declaration
        Scanner sc = new Scanner(System.in);
        double a, b;
        final double EPS = 1e-9;

        // --- Handle validation
        // check a
        while (true) {
            if (!sc.hasNextDouble()) {
                sc.next();
                continue;
            }
            a = sc.nextDouble();
            if (-1000 <= a && a <= 1000) {
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
            if (-1000 <= b && b <= 1000) {
                break;
            }
        }

        // --- Handle logic
        if (Math.abs(a) < EPS) {
            if (Math.abs(b) < EPS) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            double x = -b / a;
            System.out.printf("%.2f", x);
        }
        // close scanner
        sc.close();
    }
}
