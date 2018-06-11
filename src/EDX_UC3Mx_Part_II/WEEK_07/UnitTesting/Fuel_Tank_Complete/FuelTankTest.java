package EDX_UC3Mx_Part_II.WEEK_07.UnitTesting.Fuel_Tank_Complete;

/**
 * Created by Bogdan Trif on 22-05-2017 , 12:44 PM.
 */
/**
 * Tests for class FuelTank.
 *
 * All tests in the folder "test" are executed
 * when the "Test" action is invoked.
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class FuelTankTest {

    FuelTank tank ;

    @Before
    public void setUp() throws Exception {
        tank = new FuelTank(40, 0);
    }

    @Test
    public void testGetTankLevel() {
        // TODO
        assertEquals(0, tank.getTankLevel(), 0 );
    }

    @Test
    public void testGetTankMax() {
//        FuelTank tank = new FuelTank(40, 40);
        tank.fill(40);
        assertEquals(40, tank.getTankMax(), 0);
    }

    @Test
    public void testIsEmpty() {
        assertTrue( tank.isEmpty()  );
    }

    @Test
    public void testHalfFullTank() {
        tank.fill(tank.getTankMax()/2);
        assertEquals(tank.getTankMax()/2 , tank.getTankLevel(), 0);
    }

}
