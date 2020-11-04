class Plane {
    private PlaneSeat seat[] = new PlaneSeat[12];
    public static int sortingmode = 0;

    public Plane() {
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
    }

    private PlaneSeat[] sortSeats() {
        // Selection Sort
        //System.out.println("Did run");
        PlaneSeat ar[] = new PlaneSeat[12];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new PlaneSeat(i + 1);
            ar[i] = seat[i];
        }

        PlaneSeat temp = new PlaneSeat(1);
        int sel;
        switch (sortingmode){
            case 0:
                for (int i = 0; i < ar.length - 1; i++) {
                    sel = i;
                    for (int j = i + 1; j < ar.length; j++) {
                        if (ar[j].getCustomerID() > ar[sel].getCustomerID())
                            sel = j;
                        }
                    temp = ar[sel];
                    ar[sel] = ar[i];
                    ar[i] = temp;
                }
                return ar;
            case 1:
                for (int i = 0; i < ar.length - 1; i++) {
                    sel = i;
                    for (int j = i + 1; j < ar.length; j++) {
                        if(ar[j].getSeatID() < ar[sel].getSeatID())
                            sel = j;
                    }
                    temp = ar[sel];
                    ar[sel] = ar[i];
                    ar[i] = temp;
                }
                return ar;
            default:
             return ar;
        }
    }

    public void showNumEmptySeats() {
        System.out.println("Showing List of Empty Seats:");
        for (int i = 0; i < seat.length; i++) {
            if (!seat[i].isOccupied()) {
                System.out.println("SeatID: " + seat[i].getSeatID());
            }
        }
    }

    public void NumEmptySeats() {
        // System.out.println("Showing Number of Empty Seats");
        int count = 0;
        for (int i = 0; i < seat.length; i++) {
            if (!seat[i].isOccupied())
                count++;
        }
        System.out.print(count);
    }

    public void showAssignedSeats(boolean bySeatId) {
        // System.out.println("Showing Number of Assigned Seats");
        int count = 0;
        for (int i = 1; i <= seat.length; i++) {
            if (seat[i].isOccupied())
                count++;
        }
        System.out.println(count);
    }

    public void assignSeat(int SeatID, int cust_id) {
        if (!seat[SeatID].isOccupied()) {
            System.out.println("Seat Assigned!");
            seat[SeatID].assign(cust_id);
        } else
            System.out.println("Seat already assigned to a customer");
    }

    public void unAssignSeat(int seatId) {
        seat[seatId].unAssign();
    }
    public PlaneSeat[] sortbyCustID(){
        sortingmode = 1;
        PlaneSeat [] result = sortSeats();
        return result;
    }
    public PlaneSeat[] sortbySeatID(){
        sortingmode = 0;
        PlaneSeat [] result = sortSeats();
        return result;
    }
}