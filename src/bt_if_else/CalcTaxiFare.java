package bt_if_else;

import java.util.Scanner;

public class CalcTaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --- Handle declaration
        // declare variables
        double distance = 0.0;
        long fare = 0L;

        // declare constants for tier
        final double TIER_1 = 1.0;
        final double TIER_2 = 30.0;
        // declare constants for rate
        final long RATE_1 = 15000;
        final long RATE_2 = 13500;
        final long RATE_3 = 11000;

        // --- Handle validation
        // check a
        while (true) {
            if (!sc.hasNextDouble()) {
                sc.next();
                continue;
            }
            distance = sc.nextDouble();
            if (0 < distance && distance <= 200) {
                break;
            }
        }

        // --- Handle logic
        if (distance <= TIER_1) {
            fare = RATE_1;
        } else if (distance <= TIER_2) {
            fare = RATE_1 + (long) ((distance - 1) * RATE_2);
        } else {
            fare = RATE_1 + (long) (TIER_2 - TIER_1) * RATE_2 + (long) ((distance - 30) * RATE_3);
        }

        System.out.println(fare);

        // --- close scanner
        sc.close();
    }
}
