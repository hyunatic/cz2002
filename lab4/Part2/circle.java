public class circle implements Shape{
    private double radius;

    public circle (double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
}