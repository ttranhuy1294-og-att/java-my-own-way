package bt_if_else;

import java.util.Scanner;

public class LoginCheckAttempt2 {
    public static void main(String[] args) {
        String correctUsername = "tanthanh";
        String correctPassword = "12345678";
        int countIfWrongPassword = 0;
        int systemState;

        Scanner sc = new Scanner(System.in);

        // const variables
        final int LOGIN_MAX_ATTEMPT = 3;

        // System message
        final String MSG_ENTER_USERNAME = "Enter username: ";
        final String MSG_ENTER_PASSWORD = "Enter password: ";
        final String MSG_INVALID_USERNAME = "Invalid username!";
        final String MSG_INVALID_PASSWORD = "Invalid password!";
        final String MSG_TOO_MANY_ATTEMPTS = "You have entered the wrong password too many times!";
        final String MSG_LOGIN_SUCCESS = "Login Success!";

        // System state
        final int STATE_ENTER_USERNAME = 1;
        final int STATE_ENTER_PASSWORD = 2;
        final int STATE_LOGIN_SUCCESS = 3;
        final int STATE_TOO_MANY_ATTEMPTS = 4;
        final int STATE_FINISHED = 5;

        systemState = STATE_ENTER_USERNAME;

        while (systemState != STATE_FINISHED) {

            // ===== STATE: Input userName and do validation =====
            if (systemState == STATE_ENTER_USERNAME) {
                System.out.print(MSG_ENTER_USERNAME);
                String userName = sc.nextLine();

                if (userName.equals(correctUsername)) {
                    systemState = STATE_ENTER_PASSWORD;
                } else {
                    System.out.println(MSG_INVALID_USERNAME);
                }
            }

            // ===== STATE: Input password and do validation =====
            if (systemState == STATE_ENTER_PASSWORD) {
                System.out.print(MSG_ENTER_PASSWORD);
                String userPass = sc.nextLine();

                if (userPass.equals(correctPassword)) {
                    systemState = STATE_LOGIN_SUCCESS;
                } else {
                    countIfWrongPassword++;
                    System.out.println(MSG_INVALID_PASSWORD);

                    // handle logic when max_attempt is reached
                    if (countIfWrongPassword >= LOGIN_MAX_ATTEMPT) {
                        systemState = STATE_TOO_MANY_ATTEMPTS;
                    }
                }
            }

            // ===== STATE: LOGIN TOO MANY ATTEMPTS =====
            if (systemState == STATE_TOO_MANY_ATTEMPTS) {
                // print out too many attempt error message
                System.out.println(MSG_TOO_MANY_ATTEMPTS);

                // end program
                systemState = STATE_FINISHED;
            }

            // ===== STATE: LOGIN SUCCESS =====
            if (systemState == STATE_LOGIN_SUCCESS) {
                // reset config
                countIfWrongPassword = 0;

                // print out login success message
                System.out.println(MSG_LOGIN_SUCCESS);

                // end program
                systemState = STATE_FINISHED;
            }
        }

        sc.close();
    }
}
