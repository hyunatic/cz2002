public class Rectangle implements Shape{
    double length, height;

    public Rectangle(double length,double height){
        this.length = length;
        this.height = height;
    }
    public double CalculateArea(){
        return length * height;
    }
}
