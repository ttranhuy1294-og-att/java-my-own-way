import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        String correctUsername = "tanthanh";
        String correctPassword = "12345678";
        boolean isEnterUsernameRunning = true;
        boolean isEnterPasswordRunning = true;
        boolean exit = false;

        Scanner sc = new Scanner(System.in);

        while (!exit) {
            // check username
            if (isEnterUsernameRunning) {
                System.out.print("Enter username: ");
                String userName = sc.nextLine().trim();
                if (!userName.equals(correctUsername)) {
                    System.out.println("Invalid username!");
                    continue;
                }

                isEnterUsernameRunning = false;
            }

            // check userpass
            if (isEnterPasswordRunning) {
                System.out.print("Enter password: ");
                String userPass = sc.nextLine();
                if (!userPass.equals(correctPassword)) {
                    System.out.println("Invalid password!");
                    continue;
                }

                isEnterPasswordRunning = false;
            }

            System.out.println("Login success!");
            exit = true;
        }

        sc.close();
    }
}
