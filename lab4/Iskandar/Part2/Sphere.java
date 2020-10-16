public class Sphere extends Circle{
    double radius;
    public Sphere(double radius){
        super(radius);
        this.radius = radius;
    }
    public double CalculateArea(){
        //super.Calculate gives Math.PI * radius * radius;
        return (4 * super.CalculateArea());
    }
}
