import java.util.Scanner;

class P1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String input = sc.next();
        switch (input) {
        case "A":
        case "a": {
            System.out.println("Action movie fan");
            break;
        }
        case "B":
        case "b": {
            System.out.println("Drama movie fan");
            break;
        }
        default: {
            System.out.println("Invalid Choice");
            break;
        }
        }
    }
}