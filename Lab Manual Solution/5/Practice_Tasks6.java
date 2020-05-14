/******************************************************************************
Task 6:
Write static methods

  public static double sphereVolume(double r)
  public static double sphereSurface(double r)
  public static double cylinderVolume(double r,double h)
  public static double cylinderSurface(double r,double h)
  Public static double coneVolume(double r,double h)
  public static double coneSurface(double r,double h)

that compute the volume and surface area of a sphere with a radius r, a cylinder with a
circular base with radius r and height h, and a cone with a circular base with radius r
and height h. Place them into a class Geometry. Then write a program that prompts the
user for the values of r and h, calls the six methods, and prints the results.

 *******************************************************************************/
import java.util.Scanner;

class Geometry{
  
  public static double sphereVolume(double r){
    return ((4/3)*Math.PI*(r*r*r));
   }
   public static double sphereSurface(double r){
    return (4*Math.PI*(r*r));
   }
   public static double cylinderVolume(double r, double h){
    return (Math.PI*(r*r)*h);
   }
   public static double cylinderSurface(double r, double h){
    return ((2*Math.PI*r*h)+(2*Math.PI*r*r));
   }
   public static double coneVolume(double r, double h){
       return  (Math.PI*r*r*h/3);
   }
   public static double coneSurface(double r, double h){
       return (Math.PI*r*r*(r+(Math.sqrt(r * r + h * h))));
       
   }



}

public class Practice_Tasks6{
    public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Enter the radius for hole the task: ");
      double radius = scan.nextDouble();
      
      System.out.printf("Enter the height for hole the task: ");
      double height = scan.nextDouble();
      
      //Task Start
        System.out.println("The value of sphere Volume on the radius "+radius+" is: "+Geometry.sphereVolume(radius));
        System.out.println("The value of sphere Surface on the radius "+radius+" is: "+Geometry.sphereSurface(radius));
        System.out.println("The value of cylinder Volume on the radius "+radius+" and height "+height+" is: "+Geometry.cylinderVolume(radius,height));
        System.out.println("The value of cylinder Surface on the radius "+radius+" and height "+height+" is: "+Geometry.cylinderSurface(radius,height));
        System.out.println("The value of cone Volume on the radius "+radius+" and height "+height+" is: "+Geometry.coneVolume(radius,height));
        System.out.println("The value of cone Surface on the radius "+radius+" and height "+height+" is: "+Geometry.coneSurface(radius,height));
            
      
    }
}