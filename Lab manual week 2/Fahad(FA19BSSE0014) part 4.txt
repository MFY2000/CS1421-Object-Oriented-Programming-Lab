import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = obj.nextInt();

        if(number > 0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
}
}