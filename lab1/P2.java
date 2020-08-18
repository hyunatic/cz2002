import java.util.Scanner;

public class P2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Salary");
        int salary = sc.nextInt();

        System.out.println("Please enter merit pts");
        int merit = sc.nextInt();
        String output = "";
        if ((salary >= 700) && (salary <= 899))
            output = ((salary >= 700) && (salary <= 799) && (merit < 20)) ? "Grade B" : "Grade A";
        
        else if ((salary >= 600) && (salary <= 799))
            output = ((salary >= 600) && (salary <= 649) && (merit < 10)) ? "Grade C" : "Grade B";

        else if((salary >= 500) && (salary <= 649))
            output = "Grade C";
        
        
                
        
        
        System.out.println(output);
    }
}