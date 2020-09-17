public class Plane {
    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeat;
    public static void main(String[] args) {
        
    }
    public Plane(){
        // constructor initialize all seats. 
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
    }
    // sort from left to right, sortBy determines which variable to sort by.  0 for Customer 1 for seatID
    public PlaneSeat[] sortSeats(int sortBy){
        //Plane seat array 
        // hence need to pass in plane seat objects
        PlaneSeat[] seat2 = new PlaneSeat[12];
        for(int i = 0; i < seat2.length; i ++)
        {
            // initialize seats2 on plane to i
            seat2[i] = new PlaneSeat(i+1);
            seat2[i] = seat[i];
        }
        // temp seat object for swap
        PlaneSeat temporary = new PlaneSeat(1);
        int pointAt;
        for(int i= 0; i<seat2.length-1;i++)
        {
            pointAt = i;
            //compare i'th seat with every other seat.
            // left to right.
            for(int j = i + 1; j < seat2.length; j++)
            {
                if(sortBy==0)
                {
                // if smaller than i'th element, save index of smaller element in pointAt
                if(seat2[j].getCustomerID() < seat2[pointAt].getCustomerID())
                    pointAt = j;
                }
                else if(sortBy==1)
                {
                    if(seat2[j].getSeatID() < seat2[pointAt].getSeatID())
                    pointAt = j;
                }
                
            }
            
            // swap i'th element with identified smaller element.
            //save number of pointAt ( i+ 1)
            temporary = seat2[pointAt];
            //swap pointAt(i+1) with current i )
            seat2[pointAt] = seat2[i];
            //swap 
            seat2[i] = temporary;
        }
        return seat2;

    }
    public void showNumEmptySeat(){
        int emptySeats =0;
        for(int i = 0; i < seat.length; i ++)
        {
            if(seat[i].isOccupied()==false)
            {
                emptySeats++;
            }
        }
        System.out.println(emptySeats);
    }
    public void showEmptySeat(){
        for(int i = 0; i < seat.length; i ++)
        {
            if(seat[i].isOccupied()==false)
            {
                System.out.println("Empty seat at"+seat[i].getSeatID());
            }
        }

    }
    public void showAssignedSeat(Boolean bySeatId){
        int count = 0;
        for (int i = 1; i <= seat.length; i++) {
            if (seat[i].isOccupied())
                count++;
        }
        System.out.println(count);
        
    }
    public void assignSeat(int seatId, int cust_id){
        if (!seat[seatId].isOccupied()) {
            System.out.println("Seat Assigned!");
            seat[seatId].assign(cust_id);

        } else
            System.out.println("Seat already assigned to a customer"); 
    }
    public void unAssignSeat(int seatId){
        
                
        seat[seatId-1].unAssign();
                

        
    }
}
