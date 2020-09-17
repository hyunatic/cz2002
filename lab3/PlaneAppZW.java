import java.util.Scanner;

public class PlaneApp {
    public static void printMenu() {
        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        System.out.print("Enter the number of your choice: ");
    }

    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);

        Plane plane = new Plane();
        printMenu();
        Selector(scan, plane);

    }

    public static void Selector(Scanner scan, Plane plane) {
        System.out.println("Enter number of your choice");
        int choice = scan.nextInt();
        switch (choice) {
            case (1):
                System.out.print("There are ");
                plane.showNumEmptySeat();
                System.out.println("empty seats.");
                System.out.println("");
                break;
            case (2):
                plane.showEmptySeat();
                break;
            case (3):
                System.out.println("The seat assignments are:");
                PlaneSeat seats[] = plane.sortSeats(1);
                for (int i = 0; i < seats.length; i++) {
                    if (seats[i].isOccupied()) {
                        System.out.println("SeatID " + seats[i].getSeatID() + " assigned to CustomerID "
                                + seats[i].getCustomerID());
                    }
                }
                System.out.println("");
                break;
            case (4):
                System.out.println("The seat assignments are as follow sorted according to customerID:");
                PlaneSeat temp[]= plane.sortSeats(0);
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i].isOccupied()) {
                        System.out.println("SeatID " + temp[i].getSeatID() + " assigned to CustomerID "
                                + temp[i].getCustomerID());
                    }
                }
                System.out.println("");
                break;
            case (5):
                System.out.println("Assigning Seat ..");
                System.out.println("Please Enter SeatID: ");
                int seatId = scan.nextInt();
                System.out.println("Please Enter CustomerID: ");
                int cust_id = scan.nextInt();
                plane.assignSeat(seatId - 1, cust_id);
                System.out.println("");
                break;
            case (6):
                System.out.println("Enter Seat ID to unassign customer from: ");
                int seatId2 = scan.nextInt();
                plane.unAssignSeat(seatId2);
                System.out.println("Seat Unassigned!");
                System.out.println("");
                break;
            case (7):
                System.exit(0);
                break;
            default:
                System.out.println("Please select from 1 to 6. \n to exit please select 7.");
                printMenu();
                Selector(scan, plane);

        }
        Selector(scan, plane);
    }
}
