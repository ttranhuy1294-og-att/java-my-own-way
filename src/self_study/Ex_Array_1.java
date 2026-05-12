package self_study;

import java.util.Scanner;

public class Ex_Array_1 {
    public static int[] readIntArr() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        return arr;
    }

    public static void ex1() {
        int arr[] = readIntArr();
        // print array
        System.out.println("===== PRINT THE ARRAY: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void ex2() {
        int arr[] = readIntArr();

        System.out.println("Print reverse");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void ex3() {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

    }

    public static void main(String[] args) {
        // ex1()
        // ex2();
        ex3();
    }
}
