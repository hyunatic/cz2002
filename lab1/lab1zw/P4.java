import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();

        //traverse height vertically
        for(int i = 1; i <height; i++)
        {
            //traverse horizontally.
            //from first value of i, current height 
            //check if current height/j value is odd , print AA
            // if even, print BB 
            for(int j =i; j >0; j--)
            {
                if(j%2==1)
                System.out.print("AA");
                else
                System.out.print("BB");
            }
            System.out.print("\n");
        }
    }
}