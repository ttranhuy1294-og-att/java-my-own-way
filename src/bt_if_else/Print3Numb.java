package bt_if_else;

import java.util.Scanner;

public class Print3Numb {
    public static void main(String[] args) {
        // --- Handling declaration
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        int temp;
        // --- Handling validation
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
            if (-1000000000 <= b && b <= 1000000000) {
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
            if (-1000000000 <= c && c <= 1000000000) {
                break;
            }
        }
        // --- Handling logic
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        // --- Handling output
        System.out.printf("%d %d %d", a, b, c);

        // --- Close scanner
        sc.close();
    }
}
