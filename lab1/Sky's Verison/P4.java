package com.company;

import java.util.Scanner;

public class P4 {
    private static Scanner sc;
    private static P4 p4;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        p4 = new P4();
        System.out.println("Height : ");
        int limit = sc.nextInt();
        if (limit < 1) System.out.println("Error input!!");
        else {
            for (int row = 1; row <= limit; row++) {
                for (int col = row; col > 0; col--) {
                    if (col % 2 == 1) System.out.print("AA");
                    else System.out.print("BB");
                }
                System.out.print("\n");
            }
        }

    }
}
