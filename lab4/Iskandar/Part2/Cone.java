public class Cone extends Circle{
    double radius, height;
    public Cone(double radius, double height){
        super(radius);
        this.height = height;
        this.radius = radius;
    }
    public double CalculateArea(){
        //Cone formula (pi * r * r) + (pi * radius *sqrt(r*r + h*h))
        return (super.CalculateArea()) + (Math.PI * radius * Math.sqrt(radius*radius + height * height));
    }
}
