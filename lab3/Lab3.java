import java.util.Scanner;

class Lab3 {
    public static void main(String args[]) {
        Scanner Scan = new Scanner(System.in);
        Plane test = new Plane();
        printMenu();
        Selection(Scan,test);
    }

    public static void printMenu(){
        // compile using javac --release 14 --enable-preview Lab3.java
        // required to use java --enable-preview Lab3
        /*String menu = 
        """
        (1) Show number of empty seats \n \
        (2) Show the list of empty seats\n \
        (3) Show the list of seat assignments by seat ID\n \
        (4) Show the list of seat assignments by customer ID\n \
        (5) Assign a customer to a seat\n \
        (6) Remove a seat assignment\n \
        (7) Exit \
        """;
        */
        String menu = "(1) Show number of empty seats\n(2) Show the list of empty seats\n(3) Show the list of seat assignments by seat ID\n(4) Show the list of seat assignments by customer ID\n(5) Assign a customer to a seat\n(6) Remove a seat assignment\n(7) Exit";

        System.out.println(menu);
    }
    public static void Selection(Scanner scan,Plane test){
        System.out.print("Enter the number of your choice: ");
        int sel = scan.nextInt();
        switch(sel){
            case 1:
                System.out.print("There are "); 
                test.NumEmptySeats();
                System.out.println(" empty seats.");
                System.out.println("");

                break;
            case 2:
                test.showNumEmptySeats();
                break;
            case 3:
                System.out.println("The seat assignments are as follow:");
                PlaneSeat seats[] = test.sortSeats();
                for (int i = 0; i < seats.length; i++){
                    if(seats[i].isOccupied()){
                        System.out.println("SeatID "+ seats[i].getSeatID() +" assigned to CustomerID "+ seats[i].getCustomerID());
                    }
                }
                System.out.println("");
                break;
            case 4:
                System.out.println("The seat assignments are as follow:");
                test.sortSeats();
                System.out.println("");
                break;
            case 5:
                System.out.println("Assigning Seat ..");
                System.out.println("Please Enter SeatID: ");
                int seatid = scan.nextInt();
                System.out.println("Please Enter CustomerID: ");
                int cust = scan.nextInt();
                test.assignSeat(seatid-1,cust);
                System.out.println("");
                break;
            case 6:
                System.out.println("Enter Seat ID to unassign cusomter from: ");
                int choice = scan.nextInt();
                test.unAssignSeat(choice);
                System.out.println("Seat Unassigned!");
                System.out.println("");
                break;
            case 7:
                System.exit(0);
                break;

            default:
                    System.out.println("Please select from 1 to 6. \n to exit please select 7.");
                    printMenu();
                    Selection(scan,test);
            }
            Selection(scan,test);
    }

}