//This class inherits from the shape abstract class.
public class Cylinder3D extends Circle2D
{
    private double height;

    //Class constructor assigning the radius and height.
    public Cylinder3D(double radius, double height)
    {
    	//Inherit the variable 'radius' from the superclass.
    	super(radius);
        this.radius = radius;
        this.height = height;
    }

    //Method to calculate surface area is inherited from the abstract class,
    //but is implemented by this class.
    public double area()
    {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        /*
        Alternative: Calling the class Circle2D to calculate the base areas
        of the top and bottom of the cylinder.
        
        double circumferenceCurvedArea = 2 * Math.PI * radius * height;
        Circle2D base = new Circle2D(radius);

        return circumferenceCurvedArea + (2 * circle.base());
        */
    }
}