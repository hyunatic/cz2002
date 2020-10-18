package Part2;
public class Sphere extends Circle{
    
    double radius;
    public Sphere(double iRadius)
    {
        super(iRadius);
        radius =iRadius;
    }
    public double calculateArea(){
        return (4*super.calculateArea());
    }
}
