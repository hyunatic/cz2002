package Part2;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;
public class Shape2DApp {
    public static void main(String[] args)
    {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Scanner scan = new Scanner(System.in);
        menu(scan,list);
    
    }
    //get an arraylist of shapes
    public static void MakeShape(Scanner scan,ArrayList<Shape> list) {
        list.clear();
        System.out.println("Enter no of shapes : ");
        int num = scan.nextInt();
        for (int i = 0; i < num ; i++){
            System.out.println("Enter : (1) Square |XX| (2) Rectangle |XX| (3) Triangle |XX| (4) Circle");
            int type = scan.nextInt();
            InputShapes(scan,type,list);
        } 
        menu(scan,list);
    }
    //based on input add in new shape using pre-made classes
    public static void InputShapes(Scanner scan,int type,ArrayList<Shape> list){
        double w;
        switch (type) {
            case 1:
                System.out.println("Enter length of square :");
                list.add(new Square(scan.nextDouble()));
                break;
            case 2:
                System.out.println("Enter length of rectangle :");
                w = scan.nextDouble();
                System.out.println("Enter breadth of rectangle :");
                list.add (new Rectangle(w,scan.nextDouble()));
                break;
            case 3:
                System.out.println("Enter height of triangle :");
                w = scan.nextDouble();
                System.out.println("Enter base of triangle :");
                list. add(new Triangle(w,scan.nextDouble()));
                break;
            case 4:
                System.out.println("Enter the radius of circle :");
                list.add( new Circle(scan.nextDouble()));
                break;
            default:
                break;
        }
    }
    public static void menu(Scanner scan,ArrayList<Shape> list){
        System.out.println("Enter number: \n(1) create objects \n----\n(2) get total area \n----\n(3) exit");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                MakeShape(scan,list);
                break;
            case 2:
                double Total =0;
                for (Shape i : list)
                    Total += i.calculateArea();
                    System.out.println("Total area is : " + Total);
                    System.out.println("");
                    menu(scan,list);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                menu(scan,list);
            }
    }
}