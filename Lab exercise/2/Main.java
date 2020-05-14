import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int valueToCheck = checking(scan.nextInt());
        System.out.println("The value is:" +valueToCheck);

    }

    public static int checking(int value){
        if(value == 0) {
            System.out.println("The program is ending because you enter zero");
            System.exit(1);
        }
        return value;
    }

}
