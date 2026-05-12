package bt_if_else;

import java.util.Scanner;

public class LoginCheckAttempt {
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
        final int STATE_FINISHED = 3;

        systemState = STATE_ENTER_USERNAME;

        while (systemState != STATE_FINISHED) {
            // check username
            if (systemState == STATE_ENTER_USERNAME) {
                System.out.print(MSG_ENTER_USERNAME);
                String userName = sc.nextLine();
                if (!userName.equals(correctUsername)) {
                    System.out.println(MSG_INVALID_USERNAME);
                    continue;
                }

                systemState = STATE_ENTER_PASSWORD;
            }

            // check userpass with attempt
            if (systemState == STATE_ENTER_PASSWORD) {

                System.out.print(MSG_ENTER_PASSWORD);
                String userPass = sc.nextLine();
                if (userPass.equals(correctPassword)) {
                    System.out.println(MSG_LOGIN_SUCCESS);
                    systemState = STATE_FINISHED;
                } else {
                    countIfWrongPassword++;
                    System.out.println(MSG_INVALID_PASSWORD);

                    // handle logic when max_attempt is reached
                    if (countIfWrongPassword >= LOGIN_MAX_ATTEMPT) {
                        System.out.println(MSG_TOO_MANY_ATTEMPTS);
                        systemState = STATE_FINISHED;
                    }
                }

            }
        }

        sc.close();
    }
}
