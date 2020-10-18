package Part2;

public class Square implements Shape{
    private double length;
    
    public Square(double inputLength){
        this.length = inputLength;
    }
    public double calculateArea(){
        return Math.pow(length,2);
    }
}
