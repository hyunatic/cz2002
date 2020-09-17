public class PlaneSeat {

    int seatId;
    Boolean assigned =false;
    int customerId;

    public static void main(String[] args) {
        System.out.println("Hello World");
      }
    public PlaneSeat(int seat_id)
    {
        //constructor fills up seat_id by default 1- N 
        seatId = seat_id;
    }  
    //getter methods
    public int getSeatID() {
        return seatId;
    }
    public int getCustomerID(){
        return customerId ;
    }
    public Boolean isOccupied(){
        return assigned;
    }
    // seats need to be assigned to customer, hence take in customer input id and store into local planeSeat customerId variable
    public void assign(int cust_id){
        assigned =true;
        customerId = cust_id;
    }
    // unassign customer by setting to 0, and also toggling boolean to false
    public void unAssign(){
        assigned = false;
        customerId=0;
    }


}