import java.util.Scanner;

class Task2
{
public static void main(String args[])
{
Scanner TakeScan = new Scanner(System.in);

System.out.println("Entered Letter: ");
char Letter1 = TakeScan.next().charAt(0);
char Letter2 = 'A';
System.out.println("You Entered Letter 1: "+Letter1);
System.out.println("Your Fixed Letter 2: " +Letter2);
}
}