package WEEK_07.UnitTesting;

/**
 * Created by Bogdan Trif on 21-05-2017 , 10:18 AM.
 */
public class FuelTankTest {

    public void testRightTankLevel(){
        FuelTank tank = new FuelTank(50, 10);
        System.out.println("Tank Level expected is 10 liters and it was obtained: " + tank.getTankLevel());
    }

    public static void testRightMaxTank()  {
        // TODO
        FuelTank tank = new FuelTank(50, 50);
        System.out.println("Maximum Tank Level expected is 50 liters and it was obtained: " + tank.getTankMax());
    }

    public void testFullTank(){
        FuelTank tank = new FuelTank(50, 50);
        System.out.print("The tank must be full, the test says that this is:  " );
        System.out.println(tank.isFull());
    }

    public static void testEmptyTank() {
        FuelTank tank = new FuelTank(50, 0);
        System.out.println("Tank must be empty, the test says that the empty tank is : " + tank.isEmpty());
    }

    public static void main(String[] args) {
        testRightMaxTank();
        testEmptyTank();
    }
}
