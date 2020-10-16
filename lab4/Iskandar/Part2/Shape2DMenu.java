import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DMenu {
    
    public static void main(String[] args)
    {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Scanner scan = new Scanner(System.in);
        DisplayMenu(scan,list);
    }

    public static void DisplayShapeOption(Scanner scan,ArrayList<Shape> list) {
        list.clear();
        System.out.println("Enter number of shapes : ");
        int num = scan.nextInt();
        for (int i = 0; i < num ; i++){
            System.out.println("Option Available :");
            System.out.println("Square: 1");
            System.out.println("Recangle: 2");
            System.out.println("Triangle: 3");
            System.out.println("Circle: 4");
            int type = scan.nextInt();
            ShapeCreation(scan,type,list);
        } 
        DisplayMenu(scan,list);
    }
    public static void ShapeCreation(Scanner scan,int type,ArrayList<Shape> list){
        double length;
        switch (type) {
            case 1:
                System.out.println("Enter the length of square :");
                list.add(new Square(scan.nextDouble()));
                break;
            case 2:
                System.out.println("Enter the length of rectangle :");
                length = scan.nextDouble();
                System.out.println("Enter the height of rectangle :");
                list.add (new Rectangle(length,scan.nextDouble()));
                break;
            case 3:
                System.out.println("Enter the height of triangle :");
                length = scan.nextDouble();
                System.out.println("Enter the base of triangle :");
                list. add(new Triangle(length,scan.nextDouble()));
                break;
            case 4:
                System.out.println("Enter the radius of circle :");
                list.add(new Circle(scan.nextDouble()));
                break;
            default:
                break;
        }
    }
    public static void DisplayMenu(Scanner scan,ArrayList<Shape> list){
        System.out.println("Option Available :");
        System.out.println("Create Objects: 1");
        System.out.println("Calculate Total Area Of All Objects: 2");
        System.out.println("Exit Program: 3");
        int sel = scan.nextInt();
        switch (sel){
            case 1:
                DisplayShapeOption(scan,list);
                break;
            case 2:
                double TotalAreaOfFigures = 0;
                if(list.size() == 0){
                    System.out.println("No Shapes to Calculate, Please Create at least 1 shape");
                    DisplayMenu(scan, list);
                    break;
                }
                for (Shape i : list)
                    TotalAreaOfFigures += i.CalculateArea();
                    System.out.println("Total area is : " + TotalAreaOfFigures);
                    System.out.println("");
                    DisplayMenu(scan,list);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                DisplayMenu(scan,list);
            }
    }
}