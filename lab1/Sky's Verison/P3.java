package com.company;

import java.util.Scanner;

public class P3 {
    private static double conversionRate;

    private static Scanner sc;
    private static P3 p3;

    public static void main(String[] args) {
        // write your code here
        sc = new Scanner(System.in);
        p3 = new P3();


        conversionRate = 1.82;
        System.out.println("Starting :");
        int start = sc.nextInt();
        System.out.println("Ending :");
        int end = sc.nextInt();
        System.out.println("Increment :");
        int inc = sc.nextInt();


        if ((start > end && inc > 0) || (start < end && inc < 0) || inc == 0)
            System.out.println("Error input!!");
        else {
            System.out.println("US$    S$");
            System.out.println("---------");
            for (int i = start; i <= end; i = i + inc) {
                System.out.println(i + "      " + (i * conversionRate));
            }

            System.out.println("US$    S$");
            System.out.println("---------");
            int j = start;
            while (j <= end) {
                System.out.println(j + "      " + (j * conversionRate));
                j = j + inc;
            }

            System.out.println("US$    S$");
            System.out.println("---------");
            int k = start;
            do {
                System.out.println(k + "      " + (k * conversionRate));
                k = k + inc;
            } while (k <= end);
        }

    }
}
