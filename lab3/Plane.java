class Plane {
    private PlaneSeat seat[] = new PlaneSeat[12];
    private int numEmptySeat;

    public Plane() {
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new PlaneSeat(i+1);
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
        return seat;
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