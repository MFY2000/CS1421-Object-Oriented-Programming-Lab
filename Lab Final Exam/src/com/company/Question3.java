package com.company;

/*

a.	Write a java program that creates a file and name it OOPFinal.txt if it does not exist already. In that file, write 20 integers created randomly using appropriate methods/classes.
b.	Now read the numbers and display on the screen in ascending order.

*/

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class FilingClass{


    public void writeFile(String FileName) throws IOException {
        File data = new File(FileName);
        if(!data.exists()){
            PrintWriter print = new PrintWriter(data);
            print.println("Serial | Random");
            for (int i = 1; i <= 20; i++) {
                int randomNum = ThreadLocalRandom.current().nextInt(-128, 127 + 1);
                print.println((i)+"     |   "+randomNum);
            }
            print.close();
        }
    }

    public void readtheFile(String FileName) throws FileNotFoundException {
        File file = new File(FileName);
        Scanner Output = new Scanner(new FileReader(file));

        System.out.println(Output.nextLine());
        System.out.println("____________________________________________");
        while (Output.hasNextLine())
            System.out.println(Output.nextLine());
    }
}



class testing{
    public void todowork() throws IOException {
        FilingClass obj1 = new FilingClass();
        obj1.writeFile("C:\\Users\\MFY\\Desktop\\Maju 2nd semsester\\4) CS1421-Object Oriented Programming Lab\\Lab Final Exam\\src\\com\\company\\OOPFinal.txt");
        obj1.readtheFile("C:\\Users\\MFY\\Desktop\\Maju 2nd semsester\\4) CS1421-Object Oriented Programming Lab\\Lab Final Exam\\src\\com\\company\\OOPFinal.txt");
    }
}



public class Question3 {
    public static void main(String[] args) {
        try {
            testing obj = new testing();
            obj.todowork();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
