import java.util.Scanner;

class P3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Starting Number:");
        int starting = sc.nextInt();

        System.out.println("Ending Number:");
        int ending = sc.nextInt();

        System.out.println("US$    S$");
        System.out.println("---------");
        for (int i = starting; i <= ending; i++)
            System.out.println(i + "      " + i * 1.82);

        System.out.println("US$    S$");
        System.out.println("---------");
        int j = starting;
        while (j <= ending) {
            System.out.println(j + "      " + j * 1.82);
            j++;
        }
        System.out.println("US$    S$");
        System.out.println("---------");
        int k = starting;
        do {
            System.out.println(j + "      " + j * 1.82);
            k++;
        } while (k <= ending);
    }
}