package EDX_UC3Mx_Part_II.WEEK_07.EXAM_07;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


//  Created by Bogdan Trif on 24-05-2017 , 10:47 AM.


public class BankTest {

    int bank ;
    Account account ;

    @Before
    public void setUp() throws Exception {
        Bank bank = new Bank(50);
        Account account = new Account("John", 500);
        bank.createAccount(account);
        bank.displayAccounts();
    }

    @Test
    public void getNumberAccounts() throws Exception {
    }

    @Test
    public void createAccount() throws Exception {
    }

    @Test
    public void displayAccounts() throws Exception {
    }

}