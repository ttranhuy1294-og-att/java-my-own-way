package bt_if_else;

import java.util.Scanner;

public class CountDaysMonth {
    public static void main(String[] args) {
        // handle declaration
        Scanner sc = new Scanner(System.in);
        int days = 0, month, year;
        boolean isLeapYear = false;

        // handle valiation
        // check month
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            month = sc.nextInt();
            if (1 <= month && month <= 12) {
                break;
            }
        }

        // check year
        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            year = sc.nextInt();
            if (1 <= year && year <= 10000) {
                break;
            }
        }

        // handle logic
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                isLeapYear = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
                days = isLeapYear ? 29 : 28;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println(days);

        // close scanner
        sc.close();
    }
}
