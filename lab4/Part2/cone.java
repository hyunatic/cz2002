public class cone implements Shape{
    private double radius;
    private double height;

    public cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double area(){
        return Math.PI*this.radius*(this.radius+Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));
    }
}