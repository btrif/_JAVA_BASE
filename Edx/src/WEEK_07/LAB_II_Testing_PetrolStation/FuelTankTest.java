package WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 4:55 PM.


/**
 * Tests for FuelTank class.
 *
 * All tests in the folder "test" are executed
 * when the "Test" action is invoked.
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class FuelTankTest {

    FuelTank tank;
    double tanklevel;
    double capacity;

    @Before
    public void setup() {
        tanklevel = 0.0;
        capacity = 40.0;
        tank = new FuelTank(capacity, tanklevel);
    }

    @Test
    public void testGetTankLevel() {
        assertEquals(tanklevel, tank.getTankLevel(), 0);
    }

    @Test
    public void testGetTankMax() {
        assertEquals(capacity, tank.getCapacity(), 0);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(tank.isEmpty());
    }

    @Test
    public void testHalfFullTank() {
        tank.fill(20);
        assertEquals(tank.getCapacity()/2, tank.getTankLevel(), 0);
    }

    @Test
    public void testFullTank() {
        assertFalse(tank.isFull());
    }

}

