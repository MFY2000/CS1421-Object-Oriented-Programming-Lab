/******************************************************************************
Practice Tasks

Task 3:

Create a class that will bundle together several static methods for tax computations.
This class should not have a constructor. Its attributes are
 basicRate—the basic tax rate as a static double variable that starts at 4 percent
 luxuryRate—the luxury tax rate as a static double variable that starts at 10 percent
Its methods are
computeCostBasic(price)—a static method that returns the given price plus the basic
tax, rounded to the nearest value.
computeCostLuxury(price)—a static method that returns the given price plus the
luxury tax, rounded to the nearest value.
changeBasicRateTo(newRate)—a static method that changes the basic tax rate.
changeLuxuryRateTo(newRate)—a static method that changes the luxury tax rate.
roundToNearestvalue(price)—a private static method that returns the given price
rounded to the nearest Rupee value.

*******************************************************************************/
import java.util.Scanner;

class tax_computations{

public static double basicRate= 0.04;
public static double luxuryRate=0.10;


//-a static method that returns the given price plus the basic tax, rounded to the nearest penny.
  public static double computeCostBasic(double price){
    double value = price*(1+ basicRate);
    return roundToNearestvalue(value);
  }

//-a static method that returns the given price plus the luxury tax, rounded to the nearest penny.
  public static double computeCostLuxury(double price){
    double value = price*(1+ luxuryRate);
    return roundToNearestvalue(value);    
  }

//- a static method that changes the basic tax rate.
  public static void changeBasicRateTo(double newRate){
    basicRate = newRate;
  }

//- a static method that changes the luxury tax rate.
  public static void changeLuxuryRateTo(double newRate){
    luxuryRate = newRate;
  }

//- a private static method that returns the given price rounded to the nearest penny. 
//For example, if the price is 12.567, the method will return 12.57.
  
  private static double roundToNearestvalue(double price){
    double value = Math.round(price * 100.0) / 100.0;
    return value;
  }

  public static double getLuxuryRate(){
    return luxuryRate;
  }
  
  public static double getBasicRate(){
    return basicRate;
  }

  public static double checkPassword(int key,double value){
    if(key == 32423){
      return roundToNearestvalue(value);
    }
    else{
      System.out.println("Error key is not correct!!!!!!!!!!!!!!!!!!!!!!!!");
      return 0;
    }
  }

}
public class Practice_Tasks3
{
    public static void main(String[] args)
    {
      int price = 120;
      System.out.println("compute Cost Basic "+price+" returns value is "+ tax_computations.computeCostBasic(price));
      
      System.out.println("compute Cost Luxury "+price+" returns value is "+ tax_computations.computeCostLuxury(price));
      
      double rate = .8;
      
      System.out.println("Change Basic Rate To "+tax_computations.getBasicRate()+" from "+rate);
      tax_computations.changeBasicRateTo(rate);
      
      System.out.println("Change Luxury Rate To "+tax_computations.getLuxuryRate()+" from "+rate);
      tax_computations.changeLuxuryRateTo(rate);
      
      double point = 12.567;
      System.out.println("round To Nearest value of "+point+" is "+tax_computations.checkPassword(32423,point));
      
    }
}