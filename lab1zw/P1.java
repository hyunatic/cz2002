import java.util.Scanner;

public class P1 {

    public static void MovieFanSearch(char choice) {
        if ((choice == 'A') || (choice == 'a'))
            System.out.println("Action movie fan");
        else if ((choice == 'C') || (choice == 'c'))
            System.out.println("Comedy movie fan");
        else if ((choice == 'D') || (choice == 'd'))
            System.out.println("Drama movie fan");
        else
            System.out.println("Invalid choice");
    }

    public static void main(String[] args) {
        Scanner scan = null;
        try{
         scan = new Scanner(System.in);
        char inputString = scan.next().charAt(0);
        MovieFanSearch(inputString);
        }
        finally{
            if(scan!=null)
                scan.close();
        }
    }
}