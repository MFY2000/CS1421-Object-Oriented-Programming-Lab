import java.util.ArrayList;
import java.util.Scanner;
/*
Write a program that randomly fills in 0s and 1s into an n-by-n matrix, prints the matrix, and finds
the rows and columns with the most 1s. (Hint: Use two ArrayLists to store the row and column
indices with the most 1s.) Here is a sample run of the program:
*/
public class Practice_Tasks2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Columns: ");
        int Columns = scan.nextInt();

        System.out.print("Enter the Row: ");
        int Row = scan.nextInt();

        int[][] matrix = new int[Row][Columns];

        // adding the value to the matrix
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Columns; j++) {
                matrix[i][j] =  (int) (Math.random() * 2);
            }
        }

        // print the 2D array;
        for (int i = 0; i < Row; i++){
            System.out.print("|");
            for(int j = 0; j < Columns; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.print(" |\n");
        }

        // Largest row index
        int highest = 0,runTotal = 0,occurrence = 0;

        for (int i = 0; i < Row; i++){
            for(int j = 0; j < Columns; j++)
                runTotal += matrix[i][j];

            if(runTotal > highest){
                highest = runTotal;
                occurrence = i;
            }

            runTotal = 0;
        }

        System.out.println("The highest row: "+(occurrence+1));

        int secondHighest = 0,occurrenceSecond=0;
        highest = 0;
        runTotal = 0;
        occurrence = 0;

        for (int i = 0; i < Row; i++){
            for(int j = 0; j < Columns; j++)
                runTotal += matrix[j][i];

            if(runTotal > highest){
                secondHighest = highest;
                highest = runTotal;
                occurrenceSecond = occurrence;
                occurrence = i;
            }
            else if(runTotal > secondHighest){
                secondHighest = runTotal;
                occurrenceSecond = i;
            }

            runTotal = 0;
        }

        System.out.println("The highest columns: "+(occurrence+1)+","+(occurrenceSecond+1));


    }
}