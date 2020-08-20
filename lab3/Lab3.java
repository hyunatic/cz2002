import java.util.Scanner;
class Lab3{
    public static void main(String args[]){
        Plane test = new Plane();
    }
}

class PlaneSeat {
    private int seatID;
    private boolean assigned;
    private int customerID;

    public PlaneSeat(int seat_id){
        seatID = seat_id;
    }
    public int getSeatID(){
        return seatID;
    }
    public int getCustomerID(){
        return customerID;
    }
    public boolean isOccupied(){
        return assigned;
    }
    public void assign(int cust_id){
        assigned = true;
        customerID = cust_id;
    }
    public void unAssign(){
        assigned = false;
    }
}
class Plane{
    private PlaneSeat seat[] = new PlaneSeat[12];
    private int numEmptySeat;

    public Plane(){
        for(int i = 0; i < seat.length; i++){
            seat[i] = new PlaneSeat(i); 
        }
    }
    // public PlaneSeat [] sortSeats(){
    //     return 0;
    // }

    public void showNumEmptySeats(){
        
    }
    public void NumEmptySeats(){
        
    }
    public void showAssignedSeats(boolean bySeatId){
        
    }
    public void assignSeat(int SeatID, int cust_id){

    }
    public void unAssignSeat(int seatId){

    }
}