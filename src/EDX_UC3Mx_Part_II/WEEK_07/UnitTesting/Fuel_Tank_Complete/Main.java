package EDX_UC3Mx_Part_II.WEEK_07.UnitTesting.Fuel_Tank_Complete;

/**
 * Created by Bogdan Trif on 22-05-2017 , 12:44 PM.
 */


/**
 * Main class of the Java program.
 *
 * @auhtor UC3M MOOC Testing
 * @since 2016-04
 *
 */
public class Main {

    public static void main(String[] args) {

        // create the tank
        FuelTank tank = new FuelTank(40.0,0.0);

        System.out.print("The tank with capacity " + tank.getTankMax() + " liters has been created. ");
        System.out.println(" Its initial fuel level is  " + tank.getTankLevel() + " liters.");
    }
}


