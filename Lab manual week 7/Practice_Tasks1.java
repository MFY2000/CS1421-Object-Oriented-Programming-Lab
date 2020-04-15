/*

Task 1:

Create a SavingAccount class
•Use a static data member annualInterestRate of type double to store interest rate.
•Use a double data member of the class savingBalance.
•Provide a method calculateMonthlyInterest that calculates interest by:
savingBalance = savingBalance + (savingBalance*annualInterestRate)/12
•Provide a method printBalance that will display the saving balance.
•Provide a static method modifyInterestRate that sets the static annualInterestRate to a new
value.
Write a driver/client program TestSavingAccount to test class SavingAccount
•Create two objects saver1 and saver2 with the balance of 2000 and 3000 respectively.
•Set the annualInterestRate to 3 percent i.e. 3/100 = 0.03 and calculate monthlyInterest and
display the balance of both savers.
•Now, set the annualInterestRate to 4 percent i.e. 4/100 = 0.04 and calculate monthlyInterest
and display the balance of both savers.

*/
class SavingsAccount{

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount()
    {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest()
    {
        System.out.println("Current savings balance: " + savingsBalance);
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance += monthlyInterest;
        System.out.println("New savings balance: " + savingsBalance);
    }

    public double getBalance(){
        return savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    public String toString(){
        return ("Your Balance is:"+getBalance()+" and annual Interest Rate: "+annualInterestRate);
    }
}

public class Practice_Tasks1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Create = 1;
        double rate;
        SavingsAccount saver1 = null;
        int key;
        do{
            System.out.println("Enter  1 -> Create Saving Account, 2 -> Calculate Monthly Interest 0 -> Exit");
            key = scan.nextInt();

            switch (key) {
                case 1: //Create SavingAccount
                    if(Create != 0){
                        System.out.print("Your Saving Account is Create with Balance: ");
                        double value = scan.nextDouble();
                        saver1 = new SavingsAccount(value);
                        System.out.println();
                        Create--;
                    }
                    else
                        System.out.println("Your Account is already Created.");

                    break;
                case 2:
                    System.out.print("Enter the modify Interest Rate: ");
                    rate = scan.nextDouble();
                    saver1.modifyInterestRate(rate);
                    saver1.calculateMonthlyInterest();
                default:
                    break;
            }

            if(key == 0){
                return;
            }

        }while(key == 0);

    }
}



