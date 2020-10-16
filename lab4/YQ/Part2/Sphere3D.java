//This class inherits from the shape abstract class.
public class Sphere3D extends Circle2D
{
    //Class constructor assigning the radius.
    public Sphere3D(double radius)
    {
    	//Inherit the variable 'radius' from the superclass.
    	super(radius);
        this.radius = radius;
    }

    //Method to calculate surface area is inherited from the abstract class,
    //but is implemented by this class.
    public double area()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}