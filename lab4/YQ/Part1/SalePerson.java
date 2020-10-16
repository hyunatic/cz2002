public class SalePerson {
    private String FirstName;
    private String LastName;
    private int TotalSale;

    public SalePerson(String first,String last,int sales){
        FirstName = first;
        LastName = last;
        TotalSale = sales;
    }
    public String getfirstname(){
        return FirstName;
    }
    public String getlastname(){
        return LastName;
    }
    public int gettotalsales(){
        return TotalSale;
    }
    public boolean equals(SalePerson current){
        if(this.FirstName == current.getfirstname() && current.getlastname() == this.LastName) 
            return true;
        else
            return false;
    }
    public int compareTo(SalePerson A){
        return this.TotalSale - A.TotalSale;
    }
    public String toString(){
        return this.FirstName + " , " + this.LastName + " : " + this.TotalSale;
    }
} 