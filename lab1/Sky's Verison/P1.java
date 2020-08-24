package com.company;

import java.util.Scanner;

public class P1 {
    private static Scanner sc;
    private static P1 p1;

    public static void main(String[] args) {
        // write your code here
        sc = new Scanner(System.in);
        p1 = new P1();
        p1.printSwitchCaseReplies(sc.next().charAt(0));
    }

    public void printSwitchCaseReplies (char choice) {
        switch(choice){
            case 'a':
            case 'A':
                System.out.println("Action movie fan");
                break;
            case 'c':
            case 'C':
                System.out.println("Comedy movie fan");
                break;
            case 'd':
            case 'D':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");

        }

    }

}
