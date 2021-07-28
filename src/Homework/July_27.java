package Homework;

import java.util.Scanner;

public class July_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Given an integer N, print the square root of all integers less than N");
//        int n = scanner.nextInt();

//        for (int i = 1; i < n; i++) {
//            System.out.println(i*i);
//        }
//        System.out.println("Display Fibonacci series up to N terms using “while” loop");
//        int n = scanner.nextInt() - 2;
//        int i = 0;
//        int j = 1;
//        int temp;

//        while (n >= 0) {
//            System.out.println(i);
//            temp = i + j;
//            i = j;
//            j = temp;
//            n--;
//        }
//        System.out.println(i);
        System.out.println("Print all prime numbers within a given range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
                continue;
            }
            System.out.println(i);
        }
    }
}
