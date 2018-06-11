package EDX_UC3Mx_Part_II.WEEK_07.EXAM_07;

//  Created by Bogdan Trif on 24-05-2017 , 9:18 AM.


public class BankTest2 {

    public static void main(String[] args) {
        Bank bank = new Bank(50);
        Account account = new Account("John",500);
        bank.createAccount(account);
        bank.displayAccounts();
    }
}

//        Bank BancaTransilvania = new Bank(5) ;
//        System.out.println("There are "+ BancaTransilvania.getNumberAccounts() + " accounts at" + BancaTransilvania );
//
//
//        Account account = new Account("John", 500);
//
//        String holder = "John" ;
//        double balance = 500 ;
//        Account cont = new Account(holder, balance) ;



//        BancaTransilvania.createAccount(cont);
//        System.out.println("There are "+ BancaTransilvania.getNumberAccounts() + " at BT");
