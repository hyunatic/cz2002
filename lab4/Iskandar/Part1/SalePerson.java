public class SalePerson {
    String firstName, lastName;
    int totalSale;

    public SalePerson(String first,String last,int sales){
        firstName = first;
        lastName = last;
        totalSale = sales;
    }
    public String getfirstname(){
        return firstName;
    }
    public String getlastname(){
        return lastName;
    }
    public int gettotalsales(){
        return totalSale;
    }
    public boolean equals(SalePerson current){
        return (this.firstName == current.getfirstname() && current.getlastname() == this.lastName)  ? true : false;
    }
    public int compareTo(SalePerson A){
        return this.totalSale - A.totalSale;
    }
    public String toString(){
        return this.firstName + " , " + this.lastName + " : " + this.totalSale;
    }
} 

