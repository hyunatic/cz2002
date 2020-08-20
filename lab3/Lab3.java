import java.util.Scanner;

class Lab3 {
    public static void main(String args[]) {
        Plane test = new Plane();
    }
}

class PlaneSeat {
    private int seatID;
    private boolean assigned;
    private int customerID;

    public PlaneSeat(int seat_id) {
        seatID = seat_id;
    }

    public int getSeatID() {
        return seatID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        assigned = true;
        customerID = cust_id;
    }

    public void unAssign() {
        assigned = false;
    }
}

class Plane {
    private PlaneSeat seat[] = new PlaneSeat[12];
    private int numEmptySeat;

    public Plane() {
        for (int i = 1; i <= seat.length; i++) {
            seat[i] = new PlaneSeat(i);
        }
    }
    public PlaneSeat [] sortSeats(){
        //Selection Sort
        PlaneSeat temp = new PlaneSeat(1);
        int sel;
        for(int i = 0; i < seat.length -1; i++){
            sel = i;
            for(int j = i + 1; j < seat.length; j++){
                if(seat[j].getCustomerID() < seat[sel].getCustomerID())
                    sel = j;
            }
            temp = seat[sel];
            seat[sel] = seat[i];
            seat[i] = temp;
        }
        
    }

    public void showNumEmptySeats() {
        System.out.println("Showing SeatID of Empty Seats");
        for (int i = 1; i <= seat.length; i++) {
            if (!seat[i].isOccupied()) {
                System.out.println(seat[i].getSeatID());
            }
        }
    }
    public void NumEmptySeats() {
        System.out.println("Showing Number of Empty Seats");
        int count = 0;
        for (int i = 1; i <= seat.length; i++) {
            if (!seat[i].isOccupied())
                count++;
        }
        System.out.println(count);
    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("Showing Number of Assigned Seats");
        int count = 0;
        for (int i = 1; i <= seat.length; i++) {
            if (seat[i].isOccupied())
                count++;
        }
        System.out.println(count);
    }

    public void assignSeat(int SeatID, int cust_id) {

    }

    public void unAssignSeat(int seatId) {

    }
}