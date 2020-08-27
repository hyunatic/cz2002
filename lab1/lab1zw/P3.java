import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scan = null;
        scan = new Scanner(System.in);
        int starting = scan.nextInt();
        int ending = scan.nextInt();
        int increment = scan.nextInt();
        if (starting > ending)
            System.out.println("Error input");
        else {
            System.out.println("US$            S$");
            System.out.println("-----------------");
            for (int i = starting; i <= ending; i = i + increment) {
                // int incrementValue = increment*i;
                System.out.println(i + "                 " + (i * 1.82));
            }
            // second table
            System.out.println("US$            S$");
            System.out.println("-----------------");
            int j = starting;
            while (j <= ending) {
                System.out.println(j + "      " + j * 1.82);
                j = j + increment;
            }

            // third table
            System.out.println("US$            S$");
            System.out.println("-----------------");
            int x = starting;
            do {

                System.out.println(x + "           " + (x * 1.82));
                x = x + increment;

            } while (x <= ending);
        }

    }

}
