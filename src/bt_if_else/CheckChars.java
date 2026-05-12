package bt_if_else;

import java.util.Scanner;

public class CheckChars {
    /**
     * Checks whether a character is within a specified character range.
     *
     * Example:
     * - isWithinCharRange('C', 'A', 'Z') returns true
     * - isWithinCharRange('5', '0', '9') returns true
     * - isWithinCharRange('#', 'A', 'Z') returns false
     *
     * @param ch        the character to check
     * @param charStart the starting character of the range
     * @param charEnd   the ending character of the range
     * @return true if ch is between start and end (inclusive),
     *         otherwise false
     */
    public static boolean isWithinCharRange(char ch, char charStart, char charEnd) {
        return charStart <= ch && ch <= charEnd;
    }

    /**
     * Reads a character from user input.
     * If user presses ENTER without typing anything,
     * returns newline character '\n'.
     *
     * @param sc Scanner used for reading input
     * @return first character of input or '\n' if input is empty
     */
    public static char readCharWithEnter(Scanner sc) {
        String input;
        input = sc.nextLine();

        return input.trim().isEmpty() ? '\n' : input.charAt(0);
    }

    public static void main(String[] args) {
        // Handle declaration
        // Normal variable
        Scanner sc = new Scanner(System.in);
        char ch = '\n';

        // Const variables
        // upper const char
        final char CHAR_UPPER_START = 'A';
        final char CHAR_UPPER_END = 'Z';

        // lower const char
        final char CHAR_LOWER_START = 'a';
        final char CHAR_LOWER_END = 'z';

        // const digits char
        final char CHAR_DIGIT_START = '0';
        final char CHAR_DIGIT_END = '9';

        // Handle validation

        ch = readCharWithEnter(sc);
        System.out.println("ch = " + ch);

        // Handle logic
        if (isWithinCharRange(ch, CHAR_UPPER_START, CHAR_UPPER_END)) {
            System.out.println("UPPERCASE");
        } else if (isWithinCharRange(ch, CHAR_LOWER_START, CHAR_LOWER_END)) {
            System.out.println("LOWERCASE");
        } else if (isWithinCharRange(ch, CHAR_DIGIT_START, CHAR_DIGIT_END)) {
            System.out.println("DIGIT");
        } else {
            System.out.println("OTHER");
        }

        sc.close();
    }
}
