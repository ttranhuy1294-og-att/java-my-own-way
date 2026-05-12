package bt_if_else;

import java.util.Scanner;

public class CheckYearCentury {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Handling declaration
        float a = 0.0f, b = 0.1f, result = 0.0f;
        char operator;
        boolean error = false;

        // --- Handling validation
        // check a
        while (true) {
            if (!sc.hasNextFloat()) {
                sc.next();
                continue;
            }

            a = sc.nextFloat();
            if (a >= -1000.0f && a <= 1000.0f) {
                break;
            }
        }
        // check b
        while (true) {
            if (!sc.hasNextFloat()) {
                sc.next();
                continue;
            }

            b = sc.nextFloat();
            if (b >= -1000.0f && b <= 1000.0f) {
                break;
            }
        }

        operator = sc.next().charAt(0);

        // --- Handling logic
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    error = true;
                }
                result = a / b;
                break;
            default:
                error = true;
                break;
        }

        if (error) {
            System.out.println("ERROR");
        } else {
            System.out.printf("%.2f", result);
        }
        // --- close scanner
        sc.close();
    }
}
