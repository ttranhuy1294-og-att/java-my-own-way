package self_study.String;

import java.util.Scanner;

public class MyFormat {
    /**
     * Reads a full line of text from the user.
     *
     * <p>
     * This method displays a prompt message, then reads
     * the entire input line using {@link Scanner#nextLine()}.
     * </p>
     *
     * @param sc
     *               the {@code Scanner} used for reading user input
     *
     * @param prompt
     *               the message displayed before reading input
     *
     * @return
     *         the line entered by the user
     */
    public static String readString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    /**
     * Reads and validates a non-negative integer from the user.
     *
     * <p>
     * The method repeatedly prompts the user until a valid
     * non-negative integer is entered.
     * </p>
     *
     * <h2>Validation Rules</h2>
     *
     * <ul>
     * <li>
     * Non-integer input is rejected.
     * </li>
     *
     * <li>
     * Negative integers are rejected.
     * </li>
     * </ul>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * int age = readInt(sc, "Enter your age: ");
     * }</pre>
     *
     * @param sc
     *               the {@code Scanner} used for reading user input
     *
     * @param prompt
     *               the message displayed before reading input
     *
     * @return
     *         a validated non-negative integer
     */
    public static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        int result = 0;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                sc.nextLine(); // consume the invalid input
                continue;
            }
            result = sc.nextInt();
            if (result < 0) {
                System.out.print("Please enter a non-negative integer: ");
                sc.nextLine(); // consume the invalid input
                continue;
            }
            break;
        }

        // consume the remaining newline character after reading the integer
        sc.nextLine();
        return result;
    }

    /**
     * Reads replacement values for template placeholders.
     *
     * <p>
     * The method prompts the user repeatedly and stores each
     * entered value inside the provided array.
     * </p>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * String[] values = new String[2];
     *
     * readValues(sc, 2, values);
     * }</pre>
     *
     * @param sc
     *                    the {@code Scanner} used for reading user input
     *
     * @param valuesCount
     *                    the number of replacement values to read
     *
     * @param valuesList
     *                    the array used to store the entered values
     */
    public static void readValues(Scanner sc, int valuesCount, String[] valuesList) {
        for (int i = 0; i < valuesCount; i++) {
            valuesList[i] = readString(sc, "Enter value for placeholder " + (i + 1) + ": ");
        }
    }

    /**
     * Replaces all {@code "{?}"} placeholders inside a template
     * string using the provided replacement values in order.
     *
     * <p>
     * Each placeholder is replaced sequentially using the
     * corresponding value from {@code values}.
     * </p>
     *
     * <h2>Behavior</h2>
     *
     * <ul>
     * <li>
     * If the template contains no placeholders,
     * the original template is returned unchanged.
     * </li>
     *
     * <li>
     * If there are fewer replacement values than
     * placeholders, an exception is thrown.
     * </li>
     *
     * <li>
     * If there are more replacement values than
     * placeholders, the extra values are ignored.
     * </li>
     * </ul>
     *
     * <h2>Example</h2>
     *
     * <pre>{@code
     * String result = myFormat(
     *         "My name is {?} and I am {?} years old.",
     *         "Alice",
     *         "30");
     *
     * System.out.println(result);
     * }</pre>
     *
     * <p>
     * Output:
     * </p>
     *
     * <pre>{@code
     * My name is Alice and I am 30 years old.
     * }</pre>
     *
     * @param template
     *                 the template string containing
     *                 {@code "{?}"} placeholders
     *
     * @param values
     *                 replacement values inserted into the template
     *                 in sequential order
     *
     * @return
     *         a formatted string with placeholders replaced
     *         by the provided values
     *
     * @throws IllegalArgumentException
     *                                  if {@code template} is {@code null}
     *
     * @throws IllegalArgumentException
     *                                  if placeholders exist but no replacement
     *                                  values
     *                                  are provided
     *
     * @throws IllegalArgumentException
     *                                  if there are not enough replacement values
     *                                  for all placeholders
     */
    public static String myFormat(String template, String... values) {
        StringBuilder result = new StringBuilder();
        int startIdx, valueIdx;
        String placeholder = "{?}";
        final int PLACEHOLDER_LENGTH = placeholder.length();

        // Check if the template is null and initialize tempTemplate accordingly
        if (template == null) {
            throw new IllegalArgumentException("Template cannot be null.");
        }

        int placeholderIdx = template.indexOf(placeholder);
        if (placeholderIdx == -1) {
            return template;
        }

        // Check if values are provided for the placeholders
        if (values.length == 0) {
            throw new IllegalArgumentException("No values provided for the placeholders.");
        }

        // Handle the main formatting logic
        startIdx = 0;
        valueIdx = 0;
        while (placeholderIdx != -1) {
            // append the part of the template before the placeholder
            result.append(template.substring(startIdx, placeholderIdx));

            // replace the placeholder with the value if available
            if (valueIdx < values.length) {
                result.append(values[valueIdx]);
                valueIdx++;
            } else {
                throw new IllegalArgumentException("Not enough values provided for the placeholders.");
            }

            // update the start index for the next search
            startIdx = placeholderIdx + PLACEHOLDER_LENGTH;
            // update the index of the next placeholder
            placeholderIdx = template.indexOf(placeholder, startIdx);

        }

        // append any remaining part of the template
        result.append(template.substring(startIdx));

        return result.toString();
    }

    public static void main(String[] args) {
        // === Initialize resources ===
        Scanner sc = new Scanner(System.in);
        String template;
        String[] valuesList;

        // === Read input ===
        template = readString(sc, "Enter the template string (use '{?}' as placeholders): ");

        int valuesCount = readInt(sc, "Enter the number of values to replace the placeholders: ");

        valuesList = new String[valuesCount];

        readValues(sc, valuesCount, valuesList);

        // === Process and output results ===
        System.out.println(myFormat(template, valuesList));

        // === Clean up resources ===
        sc.close();
    }
}
