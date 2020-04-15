/*

Task 3

Write a program using ArrayList that prompts the user to enter a sequence of numbers and
displays the distinct numbers in the sequence. Assume that the input ends with 0 and 0 is not
counted as a number in the sequence.

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice_Tasks3 {
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

		ArrayList<Integer> sequence = new ArrayList<Integer>();

		System.out.print("Enter a sequence of numbers ending wih 0: ");
        
        int value2input = scan.nextInt();
        
        do{
			value2input = scan.nextInt();
			sequence.add(value2input);
		}while (value2input != 0);

        distinctNumber(sequence);

    }

	public static void distinctNumber(ArrayList<Integer> list) {
		if (list.size() == 0){
			return;
        }

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
    
        System.out.println("Displays the distinct numbers in the sequence "+listWithoutDuplicates);
    }
}