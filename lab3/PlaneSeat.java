class PlaneSeat {
    private int seatID;
    private boolean assigned = false;
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
        customerID = 0;
    }
}
