package EDX_UC3Mx_Part_II.WEEK_07.EXAM_07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


//  Created by Bogdan Trif on 24-05-2017 , 8:37 AM.


public class AccountTest {
    Account depozit ;
    int balanta ;
    String detinator ;

    @Before
    public void setUp() throws Exception {
    balanta = 4300 ;
    detinator = "Bogdan" ;
    depozit = new Account(detinator, balanta) ;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getBalance() throws Exception {
    }

    @Test
    public void getHolder() throws Exception {
//        assertEquals(depozit.getHolder(), "Bogdan");
        assertNotNull(depozit.getHolder()); ;
    }

    @Test
    public void deposit() throws Exception {
    }

    @Test
    public void withdraw() throws Exception {
        depozit.withdraw(1350);
        assertEquals(2950,depozit.getBalance(),0);
        System.out.println(depozit.getBalance());
    }

}