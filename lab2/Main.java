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
            int num1;
            int num2;
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest(sc);
                    break;
                case 2: /* add divide() call */
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    int count =divide(num1,num2);
                    System.out.println(count);
                    break;
                case 3: /* add modulus() call */
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    int mod = modulus(num1,num2);
                    System.out.println(mod);
                    break;
                case 4: /* add countDigits() call */
                    num1 = sc.nextInt();
                    int countDigits = countDigits(num1);
                    if(countDigits==-1)
                        System.out.println("Error Input!!");
                    else
                    System.out.println(countDigits);
                    break;
                case 5: /* add position() call */
                    num1 = sc.nextInt();
                    num2= sc.nextInt();
                    int position = position(num1,num2);
                    System.out.println(position);
                    break;
                case 6: /* add extractOddDigits() call */
                    long num3 = sc.nextLong();
                    long result = extractOddDigits(num3);
                    System.out.println(result);
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
        public static int divide(int m, int n) {
            int divideCount =0;
            while(m>0)
            {
                m = m-n;
                if(m>0)
                    divideCount++;
            }
            return divideCount;
        }
        public static int modulus(int m, int n){

            int mod =0;
            mod = m % n;
            return mod;
        }
        public static int countDigits(int n){
                int length =0;
                if(n<1)
                {
                    return -1;
                }
                else
                {
                    length = (int) (Math.log10(n) +1);
                    return length;
                }
        }
        public static int position(int n, int digit){
            int position =1;
            while(n>0)
            {
                int modulo = 0;
                modulo=n%10;
                if(modulo==digit)
                {
                    return position;
                }
                n = n/10;
                position++;
            }
            return -1;
        }
    public static long extractOddDigits(long n){
            if(n<0)
                return 0;
            int digitLength = countDigits((int)n);
            int extracted =0;
            for(int i = digitLength; i>0; i--)
            {
                int curr = (int)n%10;
                if(curr % 2 !=0)
                {
                    extracted *=10;
                    extracted += curr;
                }
                n/=10;
            }
            if(extracted==0)
                return -1;
            int flip =0;
            while(extracted!=0){
                flip *=10;
                flip += extracted/10;
                extracted /=10;
            }
            return flip;
    }
}

