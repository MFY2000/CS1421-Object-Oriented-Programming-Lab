/******************************************************************************
Practice Tasks

Task 1:

Write a class AreaClass that has three overloaded static methods for calculating the
areas of the following geometric shapes:

circles
rectangles
Cylinders

Here are the formulas for calculating the area of the shapes.

Area of a circle: Area= πr2
where π is Math.PI and r is the circle’s radius
Area of a rectangle: Area = Width x Length
Area of a cylinder: Area = πr2h

where π is Math.PI, r is the radius of the cylinder’s base, and h is the cylinder’s height
Because the three methods are to be overloaded, they should each have the same
name, but different parameter lists. Demonstrate the class in a complete program.

*******************************************************************************/
import java.util.Scanner; 

class AreaClass{
  
  public static double Area(double radius){
    
    double areaOfCircle = Math.PI * radius;
    return areaOfCircle;
  }
  
  public static int Area(int width, int height){
    int areaOfRectangle =  width * height;
    return areaOfRectangle;
  }
 
  public static double Area(double radius, int height){
    double areaOfCylinder =  Math.PI * (radius*radius) * height;
    return areaOfCylinder;
  } 
}


public class Practice_Tasks1
{
	public static void main(String[] args) {
	
		double radiusCircle;
		int lengthRectangle;
		int widthRectangle;
		int heightCylinder;
		double raidusCylinder;
		
    Scanner Scan = new Scanner(System.in);
    
    //Circle
    System.out.printf("Enter radius of the circle for the area of circle: ");
    radiusCircle = Scan.nextDouble();    
    
		System.out.println("\nThe area of a circle with radius " + radiusCircle + " is " + AreaClass.Area(radiusCircle));
    
    // areaOfRectangle
    System.out.printf("Enter lenght of the rectangle for the area of rectangle:   ");
    lengthRectangle = Scan.nextInt();    
    
    System.out.printf("Enter width of the rectangle for the area of rectangle:   ");
    widthRectangle = Scan.nextInt();    
    
		System.out.println("The area of a rectangle with a lenght of " + lengthRectangle + " and a width of " + widthRectangle + " is " + AreaClass.Area(widthRectangle, lengthRectangle));
    
    //areaOfCylinder
    System.out.println("Enter radius of the Cylinder for the area of Cylinder:   ");
    raidusCylinder = Scan.nextDouble();    
    
    System.out.println("Enter height of the Cylinder for the area of Cylinder:   ");
    heightCylinder = Scan.nextInt();    
    
		System.out.println("The area of a cylinder with a radius " + raidusCylinder + " and a height of " + heightCylinder + " is " + AreaClass.Area(raidusCylinder, heightCylinder));
    		
	  
	}
}
