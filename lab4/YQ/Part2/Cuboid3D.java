//This class inherits from the shape abstract class.
public class Cuboid3D extends Square2D
{
    private double breadth;
    private double height;

    //Class constructor assigning the length, breadth and height.
    public Cuboid3D(double length, double breadth, double height)
    {
    	//Inherit the variable 'length' from the superclass.
    	super(length);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    //Method to calculate surface area is inherited from the abstract class,
    //but is implemented by this class.
    public double area()
    {
        return (2 * length * breadth) + (2 * breadth * height) + (2 * length * height);
        /*
        Alternative: Calling the class Rectangle2D() to calculate the sides and bases.
        Assuming it is a rectangular cuboid.
        2 sides for front and back, 2 sides for left and right, 2 bases for top and bottom.

        Rectangle2D sidesFrontBack = new Rectangle2D(length, height);
        Rectangle2D sidesLeftRight = new Reatangle2D(breadth, height);
        Rectangle2D baseTopBottom = new Reactangle2D(length, breadth);

        return (2 * sidesFrontBack.area()) + (2 * sidesLeftRight.area()) + (2 * baseTopBottom());
        */
    }
}