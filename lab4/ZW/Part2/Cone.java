package Part2;

public class Cone extends Circle
{
    double radius;
    double height;
    public Cone(double iradius,double iheight){
        super(iradius);
        radius = iradius;
        height =iheight;
    }
    public double calculateArea(){
//surface area of cone = area of circle + area of cone
    double aCircle = super.calculateArea();
    double length =(Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));
    double aCone = Math.PI*radius*length;
    
    return aCone+aCircle;
    }
}
