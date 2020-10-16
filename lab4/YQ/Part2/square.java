public class square implements Shape{
    private double width;

    public square(double width){
        this.width = width;
    }
    public double area(){
        return Math.pow(width,2);
    }
}