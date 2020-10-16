public class cylinder implements Shape{
    private double height;
    private double radius;

    public cylinder(double height, double radius){
        this.height = height;
        this.radius = radius; 
    }
    public double area(){
        double circumfrence = 2*Math.PI*radius;
        circle base = new circle(this.radius);
        return height*circumfrence + base.area();
    }
}