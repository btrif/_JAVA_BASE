/**
 *  Manage a bank account whose balance must be always positive
 *
 *  @author UC3M Java MOOC team
 *  @version 1.0
 */
public class BankAccount {

    /*
     * Bank account owner name
     */
    private String holder;

    /*
     * Bank account balance
     */
    private double balance;

    /**
     * Deposit money in the account
     *
     *  @param money: positive number that is deposited.
     *  For example: balance = 10 (called prior_balance)
     *    		   deposit(5) returns balance = 15
     *
     * with money <= 0, does nothing.
     *
     */
    public void deposit(double money) {
        balance += money;
    }
}
/**

prior_balance < balance <= prior_balance + money    --> POSTCONDITION
money > 0                                           --> PRECONDITION
balance = prior_balance + money                     --> STATEMENT
holder !=0 && balance >=0                           --> INVARIANT

The money to deposit must be greater than 0 (precondition).
The balance after deposit is equal to the previous balance plus deposited money (postcondition).
The operation that sums money and balance is a program's statement.
Finally, the holder name must not be null and the balance must not be negative (class invariant).

*/