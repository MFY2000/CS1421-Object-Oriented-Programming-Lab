/******************************************************************************
 Task 5:

 In a ABC Bank software, generation of Account number is manual. You have been
 assigned a task to create a module that automatically generate an account number with
 respect to previous generated account number, whenever a new account is
 opened/created.
 For that purpose, create a class Account with instance variables accountTitle and
 AccountNumber. Create a class variable Previous Account Number that holds the
 status of last generated Account number.

 *******************************************************************************/
import java.util.Scanner;
import java.util.Random;


class Bank_software {
    private String accountTitle;
    private long AccountNumber;
    private static long PreviousAccountNumber = 5219954040709444L;

    public void OpenCreateAccount() {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the account title here: ");
        accountTitle = scan.nextLine();

        System.out.println("Previous account number is this " + GetPreviousAccountNumber());
        CreateAccountNumber(GetPreviousAccountNumber());

        System.out.print("Your Account Number is this " + AccountNumber+"\n\n");
        setPreviousAccountNumber(AccountNumber);

    }

    public static void setPreviousAccountNumber(long newAccount) {
        PreviousAccountNumber = newAccount;
    }

    private static long GetPreviousAccountNumber() {
        return PreviousAccountNumber;
    }

    private boolean CreateAccountNumber(Long PreviousAccount) {

        Random rng = new Random();
        long newAccount = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;

        if (newAccount == PreviousAccount)
            return CreateAccountNumber(PreviousAccount);

        else {
            AccountNumber = newAccount;
            return false;
        }
    }

}
    public class Practice_Tasks5
    {
        public static void main(String[] args) {



            Bank_software user1 = new Bank_software();
            user1.OpenCreateAccount();

            Bank_software user2 = new Bank_software();
            user2.OpenCreateAccount();



        }
    }