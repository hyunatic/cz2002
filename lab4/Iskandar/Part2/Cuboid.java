public class Cuboid extends Rectangle{
    double length, breadth,height;
    public Cuboid(double length, double breadth,double height){
        super(length,height);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public double CalculateArea(){
        return (2 * super.CalculateArea()) * (2 * breadth * height) * (2 * length * breadth);
    }
}
