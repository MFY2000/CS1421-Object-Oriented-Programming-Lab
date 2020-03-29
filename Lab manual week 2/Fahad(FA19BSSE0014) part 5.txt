import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int number = obj.nextInt();

        for (int i=1;i<=number ;i++ ){
            System.out.println("Number is: "+i+" and cube is: "+(i*i*i));
        }
}
}
