package Part2;

public class Cuboid extends Rectangle {
    double height;
    double breadth;
    double length;
    public Cuboid(double iheight,double ibreadth,double ilength){
        super(ilength,ibreadth);
        breadth = ibreadth;
        length = ilength;
        height = iheight;
    }
    public double calculateArea(){
      //  return (2 * length * breadth) + (2 * breadth * height) + (2 * length * height);
        Rectangle breadthHeight = new Rectangle(breadth,height);
        Rectangle lengthHeight = new Rectangle(length,height);
        //turn rectangle into cuboid. original length*breadth = 4 sides. + breadth*height*2 sides. 
       return ((super.calculateArea()*2)+(breadthHeight.calculateArea()*2)+lengthHeight.calculateArea()*2);
    }
}
