package EDX_UC3Mx_Part_II.WEEK_07.UnitTesting;

/**
 * Created by Bogdan Trif on 22-05-2017 , 9:25 AM.
 */

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;


public class FuelTankTest_2 {

    FuelTank tank;

    @Before
    public void setUp() {
        tank = new FuelTank(40, 0);
    }

    @Test
    public void testGetTankLevel() {
//        fail("Not yet implemented");
        assertEquals(0 , tank.getTankLevel(), 0 );
    }

    @Test
    public void testGetTankMax() {
//        fail("Not yet implemented");

        assertEquals(40 , tank.getTankMax(), 0 );

    }

    @Test
    public void testIsEmpty() {
//        fail("Not yet implemented");
        assertTrue(tank.isEmpty());

    }

    @Test
    public void testHalfFullTank() {
//        fail("Not yet implemented");
        tank.fill(20);

        assertEquals(tank.getTankMax()/2 , tank.getTankLevel() , 20);
//        assertEquals(20 , tank.getTankLevel() , 20);
    }

}
