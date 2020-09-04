import java.util.Random;
import java.util.Scanner;

public class Lab2p1 {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2: {
                    System.out.print("Enter Quotient Number:");
                    int m = sc.nextInt();
                    System.out.print("Enter Divisor:");
                    int n = sc.nextInt();
                    int result = divide(m, n);
                    System.out.println(m + "/" + n + "=" + result);
                    break;
                }
                case 3: {
                    System.out.print("Enter Quotient Number:");
                    int m1 = sc.nextInt();
                    System.out.print("Enter Divisor:");
                    int n1 = sc.nextInt();
                    int result1 = modulus(m1, n1);
                    System.out.println(m1 + "%" + n1 + "=" + result1);
                    break;
                }
                case 4: {
                    System.out.print("Enter number:");
                    int number = sc.nextInt();
                    int result2 = countDigits(number);
                    if (result2 == 0)
                        System.out.println("Error input!!");
                    else
                        System.out.println("n : " + number + " - count = " + result2);
                }
                    break;
                case 5:
                    System.out.println("Enter number:");
                    int number = sc.nextInt();
                    System.out.println("Enter Digit:");
                    int digit = sc.nextInt();
                    int result3 = position(number, digit);
                    System.out.println("position = " + result3);
                    break;
                case 6: {
                    System.out.println("Enter number:");
                    long num1 = sc.nextLong();
                    long result4 = extractOddDigits(num1);
                    if (result4 == 0)
                        System.out.println("Error Input!!");
                    else
                        System.out.println("OddDigits = " + result4);
                    break;
                }
                case 7:
                    System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }

    public static void mulTest() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int correct = 0;

        for (int i = 0; i < 5; i++) {
            // this part should be 
  
            // int randomNum = rand.nextInt((max - min) + 1) + min; 
            //  int num = (RandObj.nextInt(9)+1);
            // so 10 + 1 not 9 + 1
int randomNum = rand.nextInt((max - min) + 1) + min;
            int ran_int1 = rand.nextInt(10) + 1;
            int ran_int2 = rand.nextInt(10) + 1;

            int result = ran_int1 * ran_int2;
            System.out.println("How much is " + ran_int1 + " times " + ran_int2);
            int input = sc.nextInt();

            if (result == input)
                correct++;
        }
        System.out.println(correct + " answer out of 5 are correct");
    }

    public static int divide(int m, int n) {
        if (m < n)
            return 0;
        int result = 0;
        do {
            m -= n;
            result++;
        } while (m > 0);
        return result--;
    }

    public static int modulus(int m, int n) {
        do {
            m -= n;
        } while (m > 0);
        System.out.println(m);
        return (m < 0) ? m + n : 0;
    }

    public static int countDigits(int n) {
        if (n < 0) {
            return 0;
        }
        int result = 0;
        while (n > 0) {
            n /= 10;
            result++;
        }
        return result--;
    }

    public static int position(int n, int digit) {
        int totaldigit = countDigits(n);
        int result = 0;
        for (int i = totaldigit; i > 0; i--) {
            if (n % 10 == digit) {
                result = i;
                break;
            }
            n /= 10;
        }
        return (result == 0) ? -1 : result;
    }

    public static long extractOddDigits(long n) {
        if(n < 0)
            return 0;
        int totaldigit = countDigits((int)n);
        int result = 0;
        for (int i = totaldigit; i > 0; i--) {
            int lastdigit = (int)n % 10;
            if (lastdigit % 2 != 0) {
                result *= 10;
                result += n % 10;
            }
            n /= 10;
        }
        if(result == 0)
            return -1;

        int reverse = 0;
        while(result != 0){
            reverse *=10;
            reverse += result % 10;
            result /= 10;
        }
        return reverse;
    }
}
