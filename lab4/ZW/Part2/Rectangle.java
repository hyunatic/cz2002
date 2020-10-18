package Part2;

public class Rectangle implements Shape{
    private double area;
    private double length;
    private double breadth;
    public Rectangle(double inputLength, double inputBreadth)
    {
        length = inputLength;
        breadth = inputBreadth;
    }
    public double calculateArea(){

        area = length * breadth;
        return area;
    }
}
