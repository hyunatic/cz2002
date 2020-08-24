package com.company;

import java.util.Scanner;

public class P2 {
    private static Scanner sc;
    private static P2 p2;

    public static void main(String[] args) {
        // write your code here
        sc = new Scanner(System.in);
        p2 = new P2();

        System.out.println("salary: ");
        double salary = sc.nextDouble();
        System.out.println("Merit: ");
        int merit = sc.nextInt();

        char salaryClass = p2.getSalaryClass(salary, merit);
        System.out.println("salary: Grade " + salaryClass);


    }
    public char getSalaryClass (double salary, int merit) {
        char SalaryClass = 'D';
        System.out.println( salary);
        if (500 <= salary && salary <= 649) {
            // test if C range personnel has enough merit pts to up class
            SalaryClass = (salary <= 600 && merit < 10) ? 'C' : 'B';
        }
        else if ( 600 <= salary && salary <= 799) {
            // test if B range personnel has enough merit pts to up class
            SalaryClass = (salary <= 700 && merit < 20) ? 'B' : 'A';
        }
        else if (700 <= salary && salary <= 899) {
            SalaryClass = 'A';
        }
        return SalaryClass;
    }

}
