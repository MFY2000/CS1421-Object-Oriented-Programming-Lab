/*

Task 2:

Suppose the National Bank decides that every account type must have some monthly fees.
Therefore, a deductFees() method should be added to the Account class:
public class Account {public void deductFees() { . . . } . . . }
But what should this method do? Of course, we could have the method do nothing. But then a
programmer implementing a new subclass might simply forget to implement the deductFees
method, and the new account would inherit the do-nothing method of the superclass. Also Bank
does not open any generalize Account. So, class Account should not be instantiated. Implement
a better way to do so: That forces the implementers of subclasses to specify concrete
implementations of this method. (Of course, some subclasses might decide to implement a donothing method, but then that is their choice—not a silently inherited default.)
Design a class Account with Account number, Account title and status (Active/
Closed) and methods closeAccount() and Display().
Design it’s subclasses Current Account and Saving Account with balance and methods
deductfee(), Saving Account also has profit. For Current Account 500 Rs. are deducted from
user account if the balance is greater than 15000. For Saving Account 1% of Profit is deducted
from balance of the user. If the profit is greater than 3000.
Design a Test class that tests both types of account
*/
public class Practice_Tasks2 {

}