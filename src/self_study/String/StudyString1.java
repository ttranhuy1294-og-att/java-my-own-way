package self_study.String;

public class StudyString1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        // test join method
        String s5 = String.join(", ", "Java", "Python", "C++");
        System.out.println(s5);

        // join an array of strings
        String[] languages = { "Java", "Python", "C++" };
        String s6 = String.join(" | ", languages);
        System.out.println(s6);

        // join strings without a delimiter
        String s7 = String.join("", "Hello", "World");
        System.out.println("s7 = " + s7);

        // test substring method with start index only
        String s8 = "Hello, World!";
        String s9 = s8.substring(7);
        System.out.println("s9 = " + s9);

        // test substring method with start and end index
        String s10 = s8.substring(0, 5);
        System.out.println("s10 = " + s10);

        // test printf method
        String name = "Alice";
        int age = 30;
        System.out.printf(" fff", age, name);
    }
}
