package Part1;
public class SalePerson {
    String firstName;
    String lastName;
    int totalSales;

    public SalePerson(String f, String l, int t)
    {
        firstName =f;
        lastName =l;
        totalSales =t;
    }
    public int getTotalSales(){
        return totalSales;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public int compareTo(SalePerson o)
    {
        return this.totalSales - o.totalSales;
    }
    public boolean equals(SalePerson o)
    {
        if( this.firstName== o.getFirstName() && this.lastName==o.getLastName())
        {
            return true;
        }
        else
            return false;
    }
    public String toString()
    {
        String result = "";
        result += this.lastName +" , "+this.firstName+" : "+this.totalSales;
        return result;
    }
}
