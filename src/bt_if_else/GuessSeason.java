package bt_if_else;

import java.util.Scanner;

public class GuessSeason {
    public static void main(String[] args) {
        // Handle declaration
        Scanner sc = new Scanner(System.in);
        int month;
        String result = "INVALID";

        // Handle validation
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            month = sc.nextInt();
            if (1 <= month && month <= 100) {
                break;
            }
        }
        // Handle logic
        if (1 <= month && month <= 3) {
            result = "Spring";
        } else if (month <= 6) {
            result = "Summer";
        } else if (month <= 9) {
            result = "Autumn";
        } else if (month <= 12) {
            result = "Winter";
        }

        System.out.println(result);

        // close scanner
        sc.close();
    }
}
