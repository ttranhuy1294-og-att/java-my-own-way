package bt_if_else;

import java.util.Scanner;

public class CalcPhoneFee {
    public static void main(String[] args) {
        // handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int minutes = 0, remainMins = 0;
        long cost = 0L;

        // const variables
        // tier
        final int TIER_1 = 50;
        final int TIER_2 = 200;
        // fee rank
        final int FEE_RANK_1 = 600;
        final int FEE_RANK_2 = 400;
        final int FEE_RANK_3 = 200;

        // handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            minutes = sc.nextInt();
            if (0 <= minutes && minutes <= 10000) {
                break;
            }
        }
        // handle logic
        remainMins = minutes;
        if (remainMins > TIER_2) {
            cost += (remainMins - TIER_2) * FEE_RANK_3;
            remainMins = TIER_2;
        }
        if (remainMins > TIER_1) {
            cost += (remainMins - TIER_1) * FEE_RANK_2;
            remainMins = TIER_1;
        }

        cost += remainMins * FEE_RANK_1;

        System.out.println(cost);
        // close scanner
        sc.close();
    }
}
