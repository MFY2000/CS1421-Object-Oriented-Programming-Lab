/******************************************************************************
Task 4:

Create a class Android whose objects have unique data. The class has the following
attributes:
tag—a static integer that begins at 1 and changes each time an instance is created
name—a string that is unique for each instance of this class
Android has the following methods:

Android—a default constructor that sets the name to "Bob" concatenated with the value
of tag. After setting the name, this constructor changes the value of tag by calling the
private method changeTag.

getName—returns the name portion of the invoking object.

isPrime(n)—a private static method that returns true if n is prime—that is, if it is not
divisible by any number from 2 to n − 1.

changeTag—a private static method that replaces tag with the next prime number
larger than the current value of tag.

*******************************************************************************/


class Android{
  private static int tag;
  public String name;
  
  Android(int tag){
    this.name = "Bob";
    changeTag(tag);
  }
  
  public String getName(){
    return name;
  }
  
  private static void changeTag(int tag_){
    boolean check = isPrime(tag_); 
    if(check){
      tag = tag_;
      System.out.println("Succesfully change tag");
    }
    else  
      System.out.println("Error in change tag not prime");
  }
  
  private static boolean isPrime(int n){
    if (n <= 1) 
      return false; 
      
      // Check from 2 to n-1 
    for (int i=2; i < n; i++) 
        if (n % i == 0) 
            return false; 

    return true;   
  }
}

public class Practice_Tasks4
{
	public static void main(String[] args) {
		
		Android number1 = new Android(11);
		number1.name = "Rebot";
	  System.out.println("The change name is "+number1.getName());
	  
		Android number2 = new Android(7);
		number1.name = "Human";
	  System.out.println("The change name is "+number1.getName());
	}
}
