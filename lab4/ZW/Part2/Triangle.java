package Part2;

public class Triangle implements Shape{
    private double base;
    private double height;
    public Triangle(double iBase, double iHeight)
    {
        base = iBase;
        height = iHeight;
    }
    public double calculateArea()
    {
        return (base * height)/2;
    }
}
