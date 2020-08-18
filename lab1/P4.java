import java.util.Scanner;

class P4 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height:");
        int input = sc.nextInt();

        for(int i = 0; i < input; i++){
            for(int j = i; j < i; j++){
            if(j % 2 == 0)
                System.out.print("AA");
            else
                System.out.print("BB");
            }
            System.out.println("");
        }
    }
}