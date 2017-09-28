package WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 4:53 PM.


/**
 * FuelTank is the class which represents the fuel tank of a car.
 * A FuelTank object encapsulates the state information needed for describing the state of the tank:
 * <ul>
 *   <li> capacity  capacity of the tank
 *   <li> tankLevel	fuel level of the tank
 * </ul>
 *
 * class invariant 		0.0 &lt;= tankLevel &lt;= capacity
 *
 * @author UC3M MOOC Team
 *
 */
public class FuelTank {
    double capacity;
    double tankLevel;

    /**
     * FuelTank is a constructor of the class.
     *
     * <hr>
     * <br> precondition  capacity &gt; 0.0 and 0.0 &lt;= tankLevel &lt;= getCapacity()
     * <br> postcondition capacity &gt; 0.0 and 0.0 &lt;= tankLevel &lt;= getCapacity()
     * <hr>
     *
     * @param capacity  is the amount of fuel  (measured in liters) that the tank can hold
     * @param tankLevel is the amount of fuel (measured in liters) that the tank will have initially
     *
     */
    FuelTank(double capacity, double tankLevel) {
        this.capacity      = capacity;
        this.tankLevel     = tankLevel;
    }

    /**
     * isEmpty gives a status report
     *
     * @return 	<code>true</code> if the tank is empty
     *          <code>false</code> otherwise.
     */
    public boolean isEmpty() {
        return tankLevel == 0;
    }

    /**
     * isFull gives a status report
     *
     * @return 	<code>true</code> if the tank is full
     *          <code>false</code> otherwise.
     */
    public boolean isFull() {
        return tankLevel == capacity;
    }

    /**
     * getTankLevel is an accessor method
     *
     * @return	the amount of fuel in the tank
     */
    public double getTankLevel() {
        return tankLevel;
    }

    /**
     * getCapacity is an accessor method
     *
     * @return	the capacity (in liters) of the tank
     */
    public double getCapacity(){
        return capacity;
    }

    /**
     * fill is a mutator method that adds fuel to the tank
     *
     * <hr>
     * <br> precondition 	0.0 &lt; amount &lt;= getCapacity() - getTankLevel()
     * <br> postcondition 	not empty
     * <br> postcondition   tankLevel &gt; tankLevel_initial
     * <hr>
     *
     * @param amount 	the quantity of fuel to add
     *
     */
    public void fill(double amount){
        tankLevel = tankLevel + amount;
    }

    /**
     * consume is a mutator that consumes amount of fuel
     *
     * <hr>
     * <br> precondition  0.0 &lt; amount &lt;= getTankLevel()
     * <br> postcondition not full
     * <br> postcondition tankLevel &lt; tankLevel_initial
     * <hr>
     *
     * @param amount the amount of fuel to consume
     *
     */
    public void consume (double amount){
        tankLevel = tankLevel - amount;
    }

}

