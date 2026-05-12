package bt_if_else;

import java.util.Scanner;

public class CalcCheckAge {
    public static void main(String[] args) {
        // Handle declaration
        // normal variables
        Scanner sc = new Scanner(System.in);
        int birthYear, age;
        String result;

        // const variables
        final int currentYear = 2025;

        // tier age
        final int AGE_TIER_1 = 18;
        final int AGE_TIER_2 = 59;
        // rank by age
        final String RANK_MINOR = "Minor";
        final String RANK_ADULT = "Adult";
        final String RANK_SENIOR = "Senior";

        // other text
        final String TXT_INVALID = "INVALID";
        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            birthYear = sc.nextInt();
            if (1 <= birthYear && birthYear <= 3000) {
                break;
            }
        }

        // Handle logic
        age = currentYear - birthYear;
        if (age < 0) {
            result = TXT_INVALID;
        } else {
            if (age < AGE_TIER_1) {
                result = RANK_MINOR;
            } else if (age <= AGE_TIER_2) {
                result = RANK_ADULT;
            } else {
                result = RANK_SENIOR;
            }
            System.out.println(age);
        }

        System.out.println(result);

        // close scanner
        sc.close();

    }
}
