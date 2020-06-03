
/*
* Define a interface EMPInterface (void displayEMP(), void giveBonus (double
amount)). Define an abstract class Employee(empID, fName, lName, salary). Define
a concrete class Manager (noOfOtockOptions), subclass of Employee and define
interface methods.
Perform the following
1. Define appropriate constructors in a class hierarchy.
2. Ensure the bonus amount should not be negative and zero using exception
handling mechanism (use throws and throw clauses of exception handling).
3. Create array of interface reference variables and populate with manager
objects.
4. Write a test program to implement the above said requirements of interface
implementation and exception handling.*/

import java.util.ArrayList;
import java.util.Scanner;


// //interface class
interface Employee_Interface{

    //interface method
    void Display_Employee();
    void GiveBounsToEmployee(double Ammount);
}


// abstract class
abstract class Employee{
    //instance variable 
    String Employee_Id;
    String firstName;
    String lastName;
    double Salary;

    //constructer
    public Employee(String id,String fname,String lname,double salary){
        this.Employee_Id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.Salary = salary;
    }
}
class Manager extends Employee implements Employee_Interface {

    Manager(String id,String fname,String lname,double salary){
        super(id,fname,lname,salary);
    }

    @Override
    public void Display_Employee() {
        System.out.println("Id : "+this.Employee_Id+"\nName : "+this.firstName+" "+this.lastName+"\nSalary : "+this.Salary);
    }

    @Override
    public void GiveBounsToEmployee(double Amount) throws IllegalArgumentException {
        try {
            if(Amount <= 0){
                throw new IllegalArgumentException();
            }
            else{
                this.Salary += Amount;
                System.out.println("Your Bonus is : "+Amount+"\n\nYour new Salry is + "+Salary);
            }
        }
        catch (Exception e){
            System.out.println("Error : "+e);
        }
    }
}

//main class
class test{
    public static void main(String[] args) {
        //there are one interface one abstract class containing Array of objects
        Scanner scan = new Scanner(System.in);

        ArrayList<Employee_Interface> ListOf = new ArrayList<Employee_Interface>();
        Manager manager;
        String temp1,temp2,temp3;
        double temp4;
        
        for (int i= 0;i<5;i++){
            System.out.print("Enter the id of Employee: ");
            temp1 = scan.nextLine();
            System.out.print("Enter the First Name of Employee: ");
            temp2 = scan.nextLine();
            System.out.print("Enter the Last Name of Employee: ");
            temp3 = scan.nextLine();
            System.out.print("Enter the Salary of Employee: ");
            temp4 = scan.nextInt();
            
            manager = new Manager(temp1,temp2,temp3,temp4);
            manager.Display_Employee();

            System.out.print("Enter the amount of Bounus: ");
            double amount = scan.nextDouble();
            manager.GiveBounsToEmployee(amount);
            
            ListOf.add(manager); 
        }
    }
}


public class Question_2{
    public static void main(String[] args) {
        test.main(args);
    }
}