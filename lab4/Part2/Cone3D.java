//This class inherits from the shape abstract class.
public class Cone3D extends Circle2D
{
    private double height;

    //Class constructor assigning the radius and height.
    public Cone3D(double radius, double height)
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
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        /*
        Alternative: Calling the class Circle2D to calculate the base area of the cone.
        Circle2D base = new Circle2D(radius);

        //Calculate the curved surface area using pythagoras theorem to obtain the slanted edge height.
        double circumferenceCurvedArea = Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        
        return circumferenceCurvedArea + circle.base();
        */
    }
}