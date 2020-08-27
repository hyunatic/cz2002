import java.util.Scanner;

class P4 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height:");
        int input = sc.nextInt();

        for(int i = 1; i <= input; i++){
            for(int j = i; j != 0; j--){
            if(j % 2 == 1)
                System.out.print("AA");
            else
                System.out.print("BB");
            }
            System.out.println("");
        }
    }
}