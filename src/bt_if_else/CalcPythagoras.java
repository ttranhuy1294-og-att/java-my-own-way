package bt_if_else;

import java.util.Scanner;

public class CalcPythagoras {
    public static void main(String[] args) {
        // handle declaration
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        boolean isWithinRange = true;

        // handle read input with validation
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // handle logic
        isWithinRange = 1 <= a && a <= 10000
                && 1 <= b && b <= 10000
                && 1 <= c && c <= 10000;

        if (isWithinRange) {
            boolean isValidTriangle = a + b > c
                    || a + c > b
                    || b + c > a;
            if (!isValidTriangle) {
                System.out.println("NO");
            } else {
                boolean isRightTriangle = true;
                isRightTriangle = (a * a + b * b == c * c)
                        || (a * a + c * c == b * b)
                        || (b * b + c * c == a * a);
                if (isRightTriangle) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        // close scanner
        sc.close();
    }
}
