
import java.util.*;
import java.util.Scanner;

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

    // Here we create the class variables and used it.
    public String customerName; // variables used for holding customer Name.
    public Long accountNumber= (Long)(random_Number.nextLong()%100000000)+1000000000000000000L;  // variables used for holding accountNumber which is a random number generated of 14 digit
    public String typeOfAccount;// variables used for holding type Of Account.
    public double Balance;//variables used for holding Balance.

    /* Contructer of abstract Class*/
    Account(String Name,String typeOfAccount,double balance){
        this.customerName = Name;// assigning the value to the varaible
        this.accountNumber;// create the random number for 14 digit account nuber
        this.typeOfAccount = typeOfAccount;// assigning the value to the varaible
        this.Balance = balance;// assigning the value to the varaible
    }

    // an abstract methods to get the information of Account.
    public abstract String toString();
    // an abstract methods to get the amount deposit to the account.
    public abstract void deposit(double amountToPay);
    // an abstract methods to get the amount withdrawal from the account.
    public abstract void withdrawal(double amountToPay);

}


// Class that Derived from abstract class and extends the Account class
class Curr_Account extends Account{

    // Here we create the class variables and used it.
    public double Minimum_balance;//variables
    public double Service_charges;//variables

    // constructor
    Curr_Account(double balance,double minBalance,double Service_charge) {
        super("Muhammad Fahad", "Current",balance);// provide the value to parent class constructor to assign it

        //Assigning the values to the varaible
        Minimum_balance = minBalance;
        Service_charges = Service_charge;
    }

    @Override
    public void deposit(double amountToPay) {
        System.out.println("Your Balance is: "+this.Balance);
        this.Balance += amountToPay;//deposit formula
        System.out.println("After deposit the amount Balance is: "+this.Balance);
    }
    @Override
    public void withdrawal(double amountToPay) {

        if(amountToPay < Balance){
            System.out.println("Your Balance isv"+Balance);
            Balance -= amountToPay;
            System.out.println("Your With Draw amount is:"+amountToPay+"\nAfter withdrawal the Balance is: "+Balance);
        }
        else{

            System.out.println("The account balance is less than the amount to pay: "+amountToPay+"\nand Your Balance is: "+Balance);
            Minimum_Balance(this.Minimum_balance,this.Service_charges);//method for checking minimum balance
        }
    }

    public void Minimum_Balance(double min_bal,double serviceCharge){
        if(Balance < min_bal){
            System.out.println("Your Balance is less then the Appropiate Balance\n\n (Minimum balance = "+min_bal+")\n\n konw You Have to Pay The Service Charge = "+serviceCharge);
            Balance -= serviceCharge;
        }
    }

    // this for the user input calling function
    void CallingMethods(){
        //local varaible for using in the method
        double temp;
        int key,temp1;

        do{
            System.out.println("We are Welcome to"+this.customerName+
                    "\n\n press \n 1 => For With Draw type\n 2 => For Deposit type\n 0 => For Exit");
            System.out.print("Enter here: ");
            key = scan_input.nextInt();

            if(key == 0){
                System.exit(1);
            }

            switch (key){
                case 1:
                    System.out.print("Enter the amount to withdrawal: ");
                    temp = scan_input.nextDouble();
                    withdrawal(temp);
                    break;
                case 2:
                    System.out.print("Enter the amount to Deposit: ");
                    temp = scan_input.nextDouble();
                    deposit(temp);
                    break;

            }
        }while (true);

    }

    @Override
    public String toString() {
        return "User Details \n\n"+customerName+"\n"+accountNumber+"\n"+Balance+"\n"+typeOfAccount;
    }

}

// Class that Derived from abstract class and extends the Account class
class Sav_Account extends Account{

    Sav_Account(double balance) {
        super("Fahad", "Savings", balance);

    }

    // Methods for doing work

    public void InterestTaker(double interest,int time){
        //the formula to found the interest ==> {A = P(1 + rt)}
        // A = InterestCaluclate
        // r = interest
        // t = time

        double InterestCaluclate = this.Balance*(1+interest*time);//interst formula

        System.out.println("Interset Rate of this Account is: "+interest+"\nInterst per year is: "+InterestCaluclate);
    }


    @Override
    public void deposit(double amountToPay) {
        System.out.println("Your Balance is: "+this.Balance);
        this.Balance += amountToPay;//deposit formula
        System.out.println("After deposit the amount Balance is: "+this.Balance);
    }

    @Override
    public void withdrawal(double amountToPay) {

        if(amountToPay < Balance){
            System.out.println("Your Balance isv"+Balance);
            Balance -= amountToPay;
            System.out.println("Your With Draw amount is:"+amountToPay+"\nAfter withdrawal the Balance is: "+Balance);
        }
        else{

            System.out.println("The account balance is less than the amount to pay: "+amountToPay+"\nand Your Balance is: "+Balance);
        }
    }

    // this for the user input calling function
    void CallingMethods(){
        //local varaible for using in the method
        double temp;
        int key,temp1;

        do{
            System.out.println("We are Welcome to"+this.customerName+
                    "\n\n press \n 1 => For Interest Rate \n 2 => For With Draw type\n 3 => For Deposit type\n 0 => For Exit");
            System.out.print("Enter here: ");
            key = scan_input.nextInt();

            if(key == 0){
                System.exit(1);
            }

            switch (key){
                case 1:
                    System.out.print("Enter interest rate: ");
                    temp = scan_input.nextDouble();

                    System.out.print("Enter no of year : ");
                    temp1 = scan_input.nextInt();
                    InterestTaker(temp,temp1);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdrawal: ");
                    temp = scan_input.nextDouble();
                    withdrawal(temp);
                    break;
                case 3:
                    System.out.print("Enter the amount to Deposit: ");
                    temp = scan_input.nextDouble();
                    deposit(temp);
                    break;

            }
        }while (true);

    }

    @Override
    public String toString() {
        return "User Details \n\n"+customerName+"\n"+accountNumber+"\n"+Balance+"\n"+typeOfAccount;
    }

}


class Question_1 {

    public static void main(String[] args) {

        ArrayList<Account> ListOfAccount = new ArrayList<Account>();
        for (int i = 0; i < 5; i++) {
            ListOfAccount.add(new Curr_Account(10000, 200, 500));
            ListOfAccount.add(new Sav_Account(500*i));
        }

// now calling the method from array

        for (Account account : ListOfAccount) {
            System.out.println(account.toString());
        }

    }
}