import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {

    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Scanner scan = new Scanner(System.in);
        DisplayMenu(scan, list);
    }

    public static void DisplayShapeOption(Scanner scan, ArrayList<Shape> list) {
        list.clear();
        System.out.println("Enter number of shapes : ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Option Available :");
            System.out.println("Cubiod: 1");
            System.out.println("Pyramid: 2");
            System.out.println("Sphere: 3");
            System.out.println("Cylinder: 4");
            System.out.println("Cone: 5");
            int type = scan.nextInt();
            ShapeCreation(scan, type, list);
        }
        DisplayMenu(scan, list);
    }

    public static void ShapeCreation(Scanner scan, int type, ArrayList<Shape> list) {
        double length, height;
        switch (type) {
            case 1:
                System.out.println("Enter the length of Cubiod :");
                length = scan.nextDouble();
                System.out.println("Enter the breadth of Cubiod :");
                height = scan.nextDouble();
                System.out.println("Enter the height of Cubiod :");
                list.add(new Cuboid(length, height, scan.nextDouble()));
                break;
            case 2:
                System.out.println("Enter the length of Pyramid :");
                length = scan.nextDouble();
                System.out.println("Enter the height of Pyramid :");
                list.add(new Pyramid(length, scan.nextDouble()));
                break;
            case 3:
                System.out.println("Enter the radius of sphere :");
                list.add(new Sphere(scan.nextDouble()));
                break;
            case 4:
                System.out.println("Enter the height of Cylinder :");
                height = scan.nextDouble();
                System.out.println("Enter the radius of Cylinder :");
                list.add(new Cylinder(scan.nextDouble(), height));
                break;
            case 5:
                System.out.println("Enter the height of Cone :");
                height = scan.nextDouble();
                System.out.println("Enter the radius of Cone :");
                list.add(new Cone(scan.nextDouble(), height));
                break;
            default:
                break;
        }
    }

    public static void DisplayMenu(Scanner scan, ArrayList<Shape> list) {
        System.out.println("Option Available :");
        System.out.println("Create Objects: 1");
        System.out.println("Calculate Total Area Of All Objects: 2");
        System.out.println("Exit Program: 3");
        int sel = scan.nextInt();
        switch (sel) {
            case 1:
                DisplayShapeOption(scan, list);
                break;
            case 2:
                double TotalAreaOfFigures = 0;
                if (list.size() == 0) {
                    System.out.println("No Shapes to Calculate, Please Create at least 1 shape");
                    DisplayMenu(scan, list);
                    break;
                }
                for (Shape i : list)
                    TotalAreaOfFigures += i.CalculateArea();
                System.out.println("Total area is : " + TotalAreaOfFigures);
                System.out.println("");
                DisplayMenu(scan, list);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                DisplayMenu(scan, list);
        }
    }
}