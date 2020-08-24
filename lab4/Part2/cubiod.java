public class cubiod implements Shape{
    private double breadth;
    private double height;
    private double length;

    public cubiod (double length,double breadth,double height){
        this.breadth = breadth;
        this.height = height;
        this.length = length;
    }

    public double area(){
        rectangle sides = new rectangle(this.length,this.breadth);
        rectangle base = new rectangle(this.breadth,this.height);
        return 4*sides.area() + base.area();
    }
}