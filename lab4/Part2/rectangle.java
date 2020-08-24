public class rectangle implements Shape{
    private double breadth;
    private double length;

    public rectangle(double length,double breadth){
        this.breadth = breadth;
        this.length = length;
    }
    public double area(){
        return breadth * length;
    }
}