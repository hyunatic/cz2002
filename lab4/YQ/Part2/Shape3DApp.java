import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {
    
    public static void main(String[] args)
    {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Scanner scan = new Scanner(System.in);
        menu(scan,list);
        /*circle circle = new circle(10);
        triangle triangle = new triangle(25,20);
        rectangle rectangle = new rectangle(50,20);

        double totalArea = circle.area() + triangle.area() + rectangle.area();
        System.out.println("Total area of is " + Math.floor(totalArea*100)/100);*/
    
    }

    public static void requestshape(Scanner scan,ArrayList<Shape> list) {
        list.clear();
        System.out.println("Enter number of shapes : ");
        int num = scan.nextInt();
        for (int i = 0; i < num ; i++){
            System.out.println("Enter : (1) Cubiod | Pryamid | (4) Sphere");
            int type = scan.nextInt();
            ShapeCreation(scan,type,list);
        } 
        menu(scan,list);
    }
    public static void ShapeCreation(Scanner scan,int type,ArrayList<Shape> list){
        double w,h;
        switch (type) {
            case 1:
                System.out.println("Enter the length of Cubiod :");
                w = scan.nextDouble();
                System.out.println("Enter the breadth of Cubiod :");
                h = scan.nextDouble();
                System.out.println("Enter the height of Cubiod :");
                list.add(new cubiod(w,h,scan.nextDouble()));
                break;
            case 2:
                System.out.println("Enter the height of pryamid :");
                w = scan.nextDouble();
                System.out.println("Enter the base length of pryamid :");
                list.add (new pryamid(w,scan.nextDouble()));
                break;
            case 3:
                System.out.println("Enter the height of sphere :");
                list. add(new sphere(scan.nextDouble()));
                break;
            default:
                break;
        }
    }
    public static void menu(Scanner scan,ArrayList<Shape> list){
        System.out.println("Enter number: \n(1) create objects \n(2) get total area \n(3) exit");
        int sel = scan.nextInt();
        switch (sel){
            case 1:
                requestshape(scan,list);
                break;
            case 2:
                double totalarea =0;
                for (Shape i : list)
                    totalarea += i.area();
                    System.out.println("Total area is : " + totalarea);
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