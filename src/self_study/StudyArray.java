package self_study;

import java.util.Scanner;

public class StudyArray {
    public static void main(String[] args) {
        // array of strings
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars.length);

        // create an array size 4
        String[] cars2 = new String[4];
        cars2[0] = "Volvo 1";
        cars2[1] = "Volvo 2";
        cars2[2] = "Volvo 3";
        cars2[3] = "Volvo 4";
        // cars2[4] = "Volvo 5";s

    }
}
