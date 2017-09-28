package OOP_Concepts.Classes_basics;

/**
 * Created by Bogdan Trif on 27-04-2017 , 8:55 PM.
 */
public class Bank {

    public static void main(String[] args){
        Account a = new Account(100);
        Account b = new Account(45);

        System.out.println("Account a: "+ a.getTotalAccount());
        System.out.println("Account b: "+ b.getTotalAccount());
        System.out.println("Total Account according to a: "+ a.getTotalBank());
        System.out.println("Total Account according to b: "+ b.getTotalBank());

        System.out.println("Account a: "+ a.totalAccount);
        System.out.println("Account b: "+ b.totalAccount);
        System.out.println("Total Account according to a: "+ a.totalBank);
        System.out.println("Total Account according to b: "+ b.totalBank);

        System.out.println("Max Loan according to a: "+ a.MAXLOAN);
        System.out.println("Max Loan according to b: "+ b.MAXLOAN);
        b.MAXLOAN-=120;
        System.out.println("Max Loan according to a: "+ a.MAXLOAN);
        System.out.println("Max Loan according to b: "+ b.MAXLOAN);
    }
}
