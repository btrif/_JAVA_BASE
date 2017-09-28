package WEEK_07.EXAM_07;

//  Created by Bogdan Trif on 24-05-2017 , 9:14 AM.


public class Bank {
    private Account[] accounts;

    public Bank(int numAccounts) {
        accounts = new Account[numAccounts];
    }

    public int getNumberAccounts() {
        int i = 0;
        while (accounts[i]!=null)
            i++;
        return i;
    }

    public void createAccount(Account account) {
        accounts[getNumberAccounts()] = account;
    }

    public void displayAccounts() {
        for (int i = 0; i < getNumberAccounts(); i++) {
            System.out.print("Account [" + i + "]: holder name is " + accounts[i].getHolder());
            System.out.println(" and balance is " + accounts[i].getBalance());
        }
    }

}
