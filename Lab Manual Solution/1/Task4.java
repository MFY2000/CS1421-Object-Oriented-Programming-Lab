import java.util.Scanner;

class Task4
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
       System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();
	
	float discount = (num *0.2f);
	
	System.out.println("Your Prize is: "+num+"\nYour discout of 20% is"+discount+"\nYour Total Prize is"+(num-discount));




}
}
