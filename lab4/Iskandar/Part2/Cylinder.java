public class Cylinder extends Circle{
    double radius,height;
    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
        this.radius = radius;
    }
    public double CalculateArea(){
        return (2* super.CalculateArea()) + (2 * Math.PI * radius * height);
    }
}
