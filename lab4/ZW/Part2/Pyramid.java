package Part2;

public class Pyramid extends Triangle {
    double length,height;
    public Pyramid(double ilength,double iheight)
    {
        super(ilength,iheight);
        length = ilength;
        height= iheight;
    }
    public double calculateArea(){
        //Calculate the height of the slanted edge.
        double slantHeight = Math.sqrt((Math.pow(length / 2, 2)) + Math.pow(height, 2));
        Triangle sideWall = new Triangle(length, slantHeight);
        Square base = new Square(length);
        
        return ((4 * sideWall.calculateArea()) + base.calculateArea());
    }
}
