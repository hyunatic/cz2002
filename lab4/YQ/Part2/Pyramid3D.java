//This class inherits from the shape abstract class.
public class Pyramid3D extends Square2D
{
	protected double height;
    //For rectangular pyramid, include private double breadth;

    //Class constructor assigning the length and height.
    public Pyramid3D(double length, double height)
    {
    	//Inherit the variable 'length' from the superclass.
    	super(length);
        this.length = length;
        this.height = height;
    }

    //Method to calculate surface area is inherited from the abstract class,
    //but is implemented by this class.
    public double area()
    {
        return (Math.pow(length, 2)) + (2 * length * (Math.sqrt((Math.pow(length, 2) / 4) + Math.pow(height, 2))));
        /*
        Note: height represents the vertical distance from the center of the base to the tip,
        Not the middle point of the base of each side of the pyramid.
        Pythagorean theorem must be used to calculate the height of the slanted edge.
        
        //Surface area calculation for rectangular pyramid.
        return (length * breadth) + (length * Math.sqrt((Math.pow(width / 2, 2)) + Math.pow(height, 2))) + 
        (breadth * Math.sqrt((Math.pow(length / 2, 2)) + Math.pow(height, 2)););
        */
        /*
        Alternative: Calling the classes triangle2D() and Square2D() to calculate the
        base areas and sides of the square pyramid.

        //Calculate the height of the slanted edge.
        double sides = Math.sqrt((Math.pow(length / 2, 2)) + Math.pow(height, 2));

        Triangle2D sideWall = new Triangle2D(sides, length);
        Square2D base = new Square2D(length);
        
        return (4 * sideWall.area()) + base.area();
        */
    }
}