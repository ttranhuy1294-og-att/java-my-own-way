package bt_if_else;

import java.util.Scanner;

public class RangeWorkingAge {
    public static void main(String[] args) {
        // --- Handle declaration
        Scanner reader = new Scanner(System.in);
        int workingAge = 0;
        char gender;
        // --- Handle validation
        // check working age
        while (true) {
            if (!reader.hasNextInt()) {
                reader.next();
                continue;
            }

            workingAge = reader.nextInt();
            if (0 <= workingAge && workingAge <= 150) {
                break;
            }
        }

        // check gender
        while (true) {
            if (!reader.hasNext()) {
                reader.next();
                continue;
            }

            gender = reader.next().charAt(0);
            if (gender == 'M' || gender == 'F') {
                break;
            }
        }
        // --- Handle logic
        if (workingAge < 15) {
            System.out.println("Under Age");
        } else if ((gender == 'M' && workingAge <= 60) || (gender == 'F' && workingAge <= 55)) {
            System.out.println("Working Age");
        } else {
            System.out.println("Retired");
        }
        // --- Close scanner
        reader.close();
    }
}
