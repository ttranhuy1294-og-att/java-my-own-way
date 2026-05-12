package bt_if_else;

import java.util.Scanner;

public class CalcTax {
    public static void main(String[] args) {
        // --- Handle declaration
        // declare normal variables
        Scanner sc = new Scanner(System.in);

        int income = 0, remaining = 0;
        double tax = 0.0;

        // declare constant
        // tier
        final int TIER_1 = 5;
        final int TIER_2 = 10;
        final int TIER_3 = 18;
        final int TIER_4 = 32;
        final int TIER_5 = 52;
        // rate
        final int RATE_1 = 0;
        final int RATE_2 = 5;
        final int RATE_3 = 10;
        final int RATE_4 = 15;
        final int RATE_5 = 20;
        final int RATE_6 = 25;

        // --- Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            income = sc.nextInt();
            if (0 <= income && income <= 1000) {
                break;
            }
        }
        // --- Handle logic
        remaining = income;
        if (remaining > TIER_5) {
            int differences = remaining - TIER_5;
            tax += ((double) (differences * RATE_6)) / 100.0;
            remaining = TIER_5;
        }

        if (remaining > TIER_4) {
            int differences = remaining - TIER_4;
            tax += ((double) (differences * RATE_5)) / 100.0;
            remaining = TIER_4;
        }

        if (remaining > TIER_3) {
            int differences = remaining - TIER_3;
            tax += ((double) (differences * RATE_4)) / 100.0;
            remaining = TIER_3;
        }

        if (remaining > TIER_2) {
            int differences = remaining - TIER_2;
            tax += ((double) (differences * RATE_3)) / 100.0;
            remaining = TIER_2;
        }

        if (remaining > TIER_1) {
            int differences = remaining - TIER_1;
            tax += ((double) (differences * RATE_2)) / 100.0;
            remaining = TIER_1;
        }

        System.out.printf("%.2f", tax);

        // Close scanner
        sc.close();
    }
}
