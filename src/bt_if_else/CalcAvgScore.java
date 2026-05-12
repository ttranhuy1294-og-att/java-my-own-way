package bt_if_else;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalcAvgScore {
    public static void main(String[] args) {
        // Hanlde declaration
        // normal variable
        Scanner sc = new Scanner(System.in);
        double a = 0.0, b = 0.0, c = 0.0, score = 0.0;
        String result = "";

        // const variable
        // tier
        final double TIER_AVG = 5.5;
        final double TIER_GOOD = 7.0;
        final double TIER_EXCEL = 8.5;

        // score ranking
        final String RANK_EXCEL = "Excellent";
        final String RANK_GOOD = "Good";
        final String RANK_AVG = "Average";
        final String RANK_POOR = "Poor";

        // Handle validation
        // check a
        while (true) {
            if (!sc.hasNextDouble()) {
                sc.next();
                continue;
            }

            a = sc.nextDouble();
            if (0 <= a && a <= 10) {
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
            if (0 <= b && b <= 10) {
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
            if (0 <= c && c <= 10) {
                break;
            }
        }

        // Handle logic
        score = (a + b + c) / 3.0;
        if (score >= TIER_EXCEL) {
            result = RANK_EXCEL;
        } else if (score >= TIER_GOOD) {
            result = RANK_GOOD;
        } else if (score >= TIER_AVG) {
            result = RANK_AVG;
        } else {
            result = RANK_POOR;
        }

        BigDecimal scoreDecimal = BigDecimal.valueOf(score).setScale(2, RoundingMode.HALF_UP);

        // print
        System.out.println(scoreDecimal);

        System.out.println(result);
        // close scanner
        sc.close();
    }
}
