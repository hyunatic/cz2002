package Part2;

public class Circle implements Shape{
    protected double radius;
    
    public Circle(double inputRadius)
    {
        this.radius = inputRadius;
    }
    public double calculateArea()
    {
        return Math.pow(radius,2)*Math.PI;
    }
}
