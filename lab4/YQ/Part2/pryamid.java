public class pryamid implements Shape {
    private double height;
    private double baselength;

    public pryamid(double height, double baselength){
        this.height = height;
        this.baselength = baselength;
    }

    public double area(){
        double sides =Math.sqrt(Math.pow(baselength/ 2, 2) + Math.pow(height,2));

        triangle sidewall = new triangle(sides,this.baselength);
        square base = new square(this.baselength);
        return 4*sidewall.area() + base.area();
    }
}