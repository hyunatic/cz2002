public class triangle implements Shape{
    private double height;
    private double base;

    public triangle(double height,double base){
        this.height = height;
        this.base = base;
    }
    public double area(){
        return (height* base )/ 2;
    }
}