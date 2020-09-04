package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest(sc);
                    break;
                case 2: /* add divide() call */
                    break;
                case 3: /* add modulus() call */
                    break;
                case 4: /* add countDigits() call */
                    break;
                case 5: /* add position() call */
                    break;
                case 6: /* add extractOddDigits() call */
                    break;
                case 7:
                    System.out.println("Program terminating ….");
            }
        }
        while (choice < 7);
        }
        public static int generateRandNum()
        {
            Random RandObj = new Random();
            // (0-8)+1 -->>  1-9
            int num = (RandObj.nextInt(9)+1);
            return num;
        }
        /* add method code here */
        public static void mulTest(Scanner scanner){
            int correctCount =0;
           for(int i =0; i<5; i++)
           {
               int num1 = generateRandNum();
               int num2 = generateRandNum();
               System.out.println("How much is "+num1+" times "+num2);
               int answer = scanner.nextInt();

               if (answer == (num1 * num2)) {
                   correctCount++;
               }

           }
           System.out.println(correctCount+" answers out of 5 are correct");



        }
        }

