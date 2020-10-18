package Part2;

import java.util.ArrayList;
import java.text.BreakIterator;
import java.util.Scanner;

public class Shape3DApp
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

    
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        DisplayMenu(userInput, shapeList);
    }

    //User input
    public static void DisplayMenu(Scanner userInput, ArrayList<Shape> shapeList)
    {
        int choice;

        System.out.println("Enter the number: ");
        System.out.println("(1) Create 3D Shape");
        System.out.println("(2) Calculate Surface Area");
        System.out.println("(3) Exit");
        
        choice = userInput.nextInt();

        switch(choice)
        {
            case 1:
                //CreateShape
                MakeShape(userInput, shapeList);
                break;
            case 2:
                //store
                double totalArea = 0;

                
                for(Shape currentShape : shapeList)
                {
                	//add shapes
                    totalArea += currentShape.calculateArea();
                }
                System.out.println("Total surface area is: " + totalArea + "\n");
        
                DisplayMenu(userInput, shapeList);
                break;
            case 3:
            	System.out.println("Program terminated.");
                System.exit(0);
                break;
            default:
      
                DisplayMenu(userInput, shapeList);
        }
    }

   
    public static void MakeShape(Scanner userInput, ArrayList<Shape> shapeList)
    {
        int i, noShapes, shapeType;

       //clear shapes incase
        shapeList.clear();

        System.out.println("Enter the number of 3D shapes: ");
        noShapes = userInput.nextInt();

        //For the number of shapes.
        for(i = 0; i < noShapes; i++)
        {
            System.out.println("Select type of 3D shape: ");
            System.out.println("1 Cuboid");
            System.out.println("2 Pyramid");
            System.out.println("3 Cylinder");
            System.out.println("4 Sphere");
            System.out.println("5 Cone");

            shapeType = userInput.nextInt();

            //Create shape.
            createShape(userInput, shapeType, shapeList);
        }
       
        DisplayMenu(userInput, shapeList);
    }

   
    public static void createShape(Scanner userInput, int shapeType, ArrayList<Shape> shapeList)
    {
        double length, breadth, height, radius;

        switch(shapeType)
        {
            case 1:
                System.out.println("Enter the length of the cuboid: ");
                length = userInput.nextDouble();
                System.out.println("Enter the breadth of the cuboid: ");
                breadth = userInput.nextDouble();
                System.out.println("Enter the height of the cuboid: ");
                height = userInput.nextDouble();

               
                shapeList.add(new Cuboid(length, breadth, height));
                break;
            case 2:
                System.out.println("Enter the base length of the pyramid: ");
                length = userInput.nextDouble();
                System.out.println("Enter the height of the pyramid: ");
                height = userInput.nextDouble();

                shapeList.add(new Pyramid(length, height));
                break;
            case 3:
                System.out.println("Enter the radius of the cylinder: ");
                radius = userInput.nextDouble();
                System.out.println("Enter the height of the cylinder: ");
                height = userInput.nextDouble();

                shapeList.add(new Cylinder(radius, height));
                break;
            case 4:
                System.out.println("Enter the radius of the sphere: ");
                radius = userInput.nextDouble();
                shapeList.add(new Sphere(radius));
                break;
            case 5:
                System.out.println("Enter the radius of the cone: ");
                radius = userInput.nextDouble();
                System.out.println("Enter the height of the cone: ");
                height = userInput.nextDouble();
                shapeList.add(new Cone(radius, height));
                break;
            default:
                System.out.println("Wrong/Invalid choice.");
                break;
        }
    }
}

