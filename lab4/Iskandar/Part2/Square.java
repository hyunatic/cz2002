public class Square implements Shape{
    double length;
    public Square(double length){
        this.length = length;
    }
    public double CalculateArea(){
        return length * length;
    } 
}

