/******************************************************************************
Practice Tasks

Task 2:

 Create a SavingAccount class
· Use a static data member annualInterestRate of type double to store interest rate.
· Use a double data member savingBalance.
· Provide a method calculateMonthlyInterest that calculates interest by:
 savingBalance = balance+ (balance*annualInterestRate)/12
· Provide a method printBalance that will display the saving balance.
· Provide a static method modifyInterestRate that sets the static
annualInterestRate to a new value.
Write a driver/client program TestSavingAccount to test class SavingAccount
· Create two objects saver1 and saver2 with the balance of 2000 and 3000
respectively.
· Set the annualInterestRate to 3 percent i.e. 3/100 = 0.03 and calculate
monthlyInterest and display the balance of both savers.
· Now, set the annualInterestRate to 4 percent i.e. 4/100 = 0.04 and calculate
monthlyInterest and display the balance of both savers

*******************************************************************************/
import java.util.Scanner;

class SavingAccount{

    private double savingsBalance;
    private static double annualInterestRate;

    public SavingAccount(double balance){
        savingsBalance = balance;
    }

    public String calculateMonthlyInterest(){
        String Toreturn = "Current savings balance: " + savingsBalance + "\nOn this the monthly Interest is "+annualInterestRate+" and the rate is ";
        
        double monthlyInterest = (getBalance() * annualInterestRate)/12;
        Toreturn += monthlyInterest + "\nSo now your Current Savings is ";
  
        setBalance(monthlyInterest + getBalance());
        Toreturn += getBalance() + "\n";
        
        return Toreturn;
    }

    public double getBalance(){
        return savingsBalance;
    }
    
    public void setBalance(double balance){
         savingsBalance = balance;
    }
    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
}

public class Practice_Tasks2
{
    public static void main(String[] args)
    {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        
        saver1.modifyInterestRate(.03);
        System.out.println(saver1.calculateMonthlyInterest());
        
        saver2.modifyInterestRate(.03);
        System.out.println(saver2.calculateMonthlyInterest());
        
        saver1.modifyInterestRate(.04);
        System.out.println(saver1.calculateMonthlyInterest());
        
        saver2.modifyInterestRate(.04);
        System.out.println(saver2.calculateMonthlyInterest());
    }
}