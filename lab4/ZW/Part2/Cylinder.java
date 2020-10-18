package Part2;

public class Cylinder extends Circle {
    double radius;
    double height;
    public Cylinder(double iradius, double iheight)
    {
        super(iradius);
        radius = iradius;
        height = iheight;
    }
    public double calculateArea()
    {
        double aCircle = 2*(super.calculateArea());
        double aCurved = 2* Math.PI * radius * height;
        return aCircle+ aCurved;
    }
}
