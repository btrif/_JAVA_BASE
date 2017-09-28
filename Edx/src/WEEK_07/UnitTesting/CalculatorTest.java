package WEEK_07.UnitTesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Bogdan Trif on 22-05-2017 , 11:28 AM.
 */
public class CalculatorTest {

    Calculator calc = null;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator() ;
    }

    @Test
    public void testAdd()  {
        calc.add(2) ;
        assertEquals(2, calc.getResult(), 0 );
//        fail("Not yet implemented !");
    }

    @Test
    public void test_Subtract()  {
        calc.subtract(1);
        assertTrue(calc.getResult() == 1) ;
//        assertEquals(1, calc.getResult(), 2);
//        fail("Not yet implemented !");
    }

}