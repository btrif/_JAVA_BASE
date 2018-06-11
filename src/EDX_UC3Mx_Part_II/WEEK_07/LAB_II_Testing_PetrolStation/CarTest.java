package EDX_UC3Mx_Part_II.WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 4:54 PM.


/**
 * Tests for Car class.
 *
 * All tests in the folder "test" are executed
 * when the "Test" action is invoked.
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CarTest {

    FuelTank tank = null ;
    Car car = null ;
    double consumption ;

    @Before
    public void setUp() {
        //To be implemented
        tank = new FuelTank(40, 20);
        consumption = 0.8 ;
        car = new Car(tank, consumption) ;
    }

    @Test
    public void testGetTank() {
//        fail("Not yet implemented"); // TODO
        assertSame(car.getTank() , tank );

    }

    @Test
    public void testAmountKilometers() {
//        fail("Not yet implemented"); // TODO
    assertEquals(100, car.amountKilometers(80), 0);

    }

    @Test
    public void testAmountFuel() {
//        fail("Not yet implemented"); // TODO
    assertEquals(80, car.amountFuel(100), 0);
    }

    @Test
    public void testTravelIf() {
//        fail("Not yet implemented"); // TODO
    assertEquals(45, car.travel(70), 0);
    }

    @Test
    public void testTravelElse() {
//        fail("Not yet implemented"); // TODO
        assertEquals(0, car.travel(0), 0);
    }
}
