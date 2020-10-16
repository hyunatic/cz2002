public class sphere implements Shape{
    private double radius;

    public sphere(double radius){
        this.radius = radius;
    }
    public double area(){
        return 4* Math.PI*Math.pow(this.radius,2);
    }
}