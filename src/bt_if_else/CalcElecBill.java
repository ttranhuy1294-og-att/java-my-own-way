package bt_if_else;

import java.util.Scanner;

public class CalcElecBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --- Handle declaration
        // declare variables
        int kwh = 0;
        long cost = 0L;

        // declare constants for tier
        final int TIER_1 = 50;
        final int TIER_2 = 100;
        final int TIER_3 = 200;
        // declare constants for rate
        final long RATE_1 = 1500;
        final long RATE_2 = 2000;
        final long RATE_3 = 2500;
        final long RATE_4 = 3000;

        // --- Handle validation
        // check a
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            kwh = sc.nextInt();
            if (1 <= kwh && kwh <= 1000) {
                break;
            }
        }

        int remaining = kwh;
        if (remaining > TIER_3) {
            cost += (remaining - TIER_3) * RATE_4;
            remaining = TIER_3;
        }
        if (remaining > TIER_2) {
            cost += (remaining - TIER_2) * RATE_3;
            remaining = TIER_2;
        }

        if (remaining > TIER_1) {
            cost += (remaining - TIER_1) * RATE_2;
            remaining = TIER_1;
        }

        cost += remaining * RATE_1;

        System.out.println(cost);

        // --- close scanner
        sc.close();
    }
}
