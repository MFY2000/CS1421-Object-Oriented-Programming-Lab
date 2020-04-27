/* 
Task 3:
Design a Student class.
It holds data common to all students, (id, name, yearOfAdmisison) and methods to
calculateCGPA() and toString() Display information, but does not hold all the data needed
for students of specific majors. For example it can not calculate remaining credit hours for
students. As the requirements might differ from major to major.
For example in CsStudent class we have required hours as follows.
MATH_HOURS = 20; // Math hours
CS_HOURS = 40; // Comp sci hours
GEN_ED_HOURS = 60; //General hours
And hours earned information for every student.
mathHours, csHours, genEdHours;
Hours can not be negative or greater than the requirement.
Design a method to calculateRemainingHours(). Override toString() method to display
information.
Design a test class to create an ArrayList of Cs Students and calculate remaining credit hours of
those students
*/
import java.util.ArrayList;
import java.util.Scanner;

abstract class Student{
    Scanner obj = new Scanner(System.in);
    String Id;
    String Name;
    String AdmissionDate;
    public int genEdHours = 60;

    abstract void CalaculateGpa();
    abstract String ToString();
    abstract void calculate_remaining_gpa();
    abstract void check();
}


class testcase extends Student{


    void check(){
        System.out.println("Cs Student");
        System.out.println("Enter Id");
        Id = obj.next();
        System.out.println("Enter Name");
        Name = obj.next();
        System.out.println("Enter AdmissionDate(DD-MM-YYYY)");
        AdmissionDate = obj.next();

        System.out.println(ToString());
    }

    String ToString(){
        return ("Student Details \n "+Id+"\n  "+Name+"\n   "+AdmissionDate);
    }

    void CalaculateGpa() {
        System.out.print("Enter the GPA of Subject 1: ");
        float sub1 = obj.nextFloat();


        System.out.print("Enter the GPA of Subject 2: ");
        float sub2 = obj.nextFloat();


        System.out.print("Enter the GPA of Subject 3: ");
        float sub3 = obj.nextFloat();

        float GPA = sub1*3 + sub2*3 + sub3*3/(9);

        System.out.println(GPA);
    }

    @Override
    public void calculate_remaining_gpa() {
        System.out.println("Remaining Gpa ");
        int remaining = genEdHours - (9);

        System.out.println(remaining);
    }
}


class testcase2 extends Student{

    void check(){
        System.out.println("BBA Student");
        System.out.println("Enter Id");
        Id = obj.next();
        System.out.println("Enter Name");
        Name = obj.next();
        System.out.println("Enter AdmissionDate");
        AdmissionDate = obj.next();

        System.out.println(ToString());
    }
    String ToString(){
        return Id+"\n"+Name+"\n"+AdmissionDate;
    }

    void CalaculateGpa() {
        System.out.print("Enter the GPA of Subject 1: ");
        float sub1 = obj.nextFloat();


        System.out.print("Enter the GPA of Subject 2: ");
        float sub2 = obj.nextFloat();


        System.out.print("Enter the GPA of Subject 3: ");
        float sub3 = obj.nextFloat();

        float GPA = sub1*3 + sub2*3 + sub3*3/(9);

        System.out.println(GPA);
    }

    public void calculate_remaining_gpa() {
        System.out.println("Remaining Gpa ");
        int remaining = genEdHours - (9);

        System.out.println(remaining);
    }

    void result(){
        check();
        CalaculateGpa();
        calculate_remaining_gpa();
    }
}

public class Practice_Tasks3a {
    public static void main(String[] args) {
        
        ArrayList <Student> StudentList;
        StudentList = new ArrayList<Student>(3);
        StudentList.add(new testcase());
        StudentList.add(new testcase2());
        for (Student member:StudentList) {
            member.check();
            member.CalaculateGpa();
            member.calculate_remaining_gpa();
        }
    }
}