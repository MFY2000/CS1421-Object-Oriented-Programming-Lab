//this is Qusetion 1

/*

A bank maintains two kinds of accounts – Savings account and Current account. The
savings account provides simple interest, deposit and withdrawal facilities. The
current account only provides deposit and withdrawal facilities. Current account
holders should also maintain minimum balance. If balance falls below minimum
level a service charge is imposed. Create an abstract class Account that stores
customer name, account number type of account and abstract methods. From this
derive the classes Curr_Account (double balance, double min_bal, double
serviceCharge / penalty) and and Sav_Account (double balance). Include the
necessary methods in order to achieve the following:
1. Define parameterized constructor in a class hierarchy. at line 54,67,147
2. Allow deposit and update the balance.
3. Display the balance.
4. Compute interest and add to balance.
5. Permit withdrawal and update the balance (check for minimum balance).
6. Apply polymorphism if required for methods in class hierarchy.
7. Create an array of super class / object and populate with subclass objects and
call the overridden / object methods.
8. Write a test program to demonstrate the above said implementations.

*/
/*  ============================================Start Coding======================================================================== */

/* An abstract name as Account which is define in the question. The main/first and abstract class throught which we extends the two class */

abstract class Account{
    
    // instance object
    
    Random random_Number = new Random();//Here we create the instance of random class name as random_Number 
    Scanner scan_input = new Scanner(System.in);//scanner for class is instance and used for getting information

    // Here we create the class variables and used it  
    private String customerName;
    private Long accountNumber = ; 
    private String typeOfAccount;

    // an abstract methods to get the information of Account 
    public abstract String toString();
}

class Savings_account{

}

class Current_account{

}


public class Question_1 {
    public static void main(String[] args) {
        
    }
}