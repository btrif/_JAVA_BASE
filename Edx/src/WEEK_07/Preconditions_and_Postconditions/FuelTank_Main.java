package WEEK_07.Preconditions_and_Postconditions;

/**
 * Created by Bogdan Trif on 19-05-2017 , 12:07 PM.
 */
public class FuelTank_Main {

    public static void main(String[] args) {
        FuelTank fuelTank = new FuelTank(40, 20);
        fuelTank.fill(10);
        fuelTank.consume(15);
        System.out.println("The amount of fuel in the tank is " + fuelTank.getTankLevel());
    }

}

/**
FuelTank: invariant
What statements show that the previous method consume(double amount) preserves the invariant 0 <= tankLevel <= tankMax:

1.  consume method precondition: 0.0 < amount <= getTankLevel() correct
2.  Constructor postcondition: tankMax > 0.0 and 0.0 <= tankLevel <= getTankMax() correct

Explanation
The consume method precondition: 0.0 < amount <= getTankLevel() guarantees that tankLevel is greater than or equal to 0.
The constructor postcondition: tankMax > 0.0 && 0.0 <= tankLevel <= tankMax guarantees
that the tank capacity must be greater than 0 and limits the maximum tank level to the tank capacity.
*/