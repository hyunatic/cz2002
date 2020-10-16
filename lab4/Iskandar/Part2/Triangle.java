public class Triangle implements Shape{
    double length, height;
    
    public Triangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    public double CalculateArea(){
        return (length * height) * 0.5;
    }
}
