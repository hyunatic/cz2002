public class Pyramid extends Triangle{
    double length, height;
    public Pyramid(double length, double height){
        super(length,height);
        this.length = length;
        this.height = height;
    }
    public double CalculateArea(){
        Square base = new Square(length);
        return (super.CalculateArea() * 4) + base.CalculateArea();
    }
}
