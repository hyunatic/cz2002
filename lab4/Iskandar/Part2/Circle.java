public class Circle implements Shape{
    double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    public double CalculateArea(){
        return Math.PI * radius * radius;
    }
}
