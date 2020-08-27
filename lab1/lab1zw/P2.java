import java.util.Scanner;

public class P2 {

    public static void Grade(int salary, int merit) {
        if (salary <= 649)
            if (salary > 600 && merit >= 10)
                System.out.println("Grade B");
            else
                System.out.println("Grade C");
        else if (salary <= 799)
            if (salary > 700 && merit > 20)
                System.out.println("Grade A");
            else
                System.out.println("Grade B");
        else if (salary >= 799)
            System.out.println("Grade A");
        else
            System.out.println("Invalid choice");
    }

    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            int inputSalary = scan.nextInt();
            int inputMerit = scan.nextInt();
            Grade(inputSalary, inputMerit);
        } finally {
            if (scan != null)
                scan.close();
        }
    }
}