package EDX_UC3Mx_Part_II.WEEK_07.Preconditions_and_Postconditions;

/**
 * Created by Bogdan Trif on 19-05-2017 , 12:06 PM.
 */
/**
 * FuelTank is the class which represents the fuel tank of a car.
 * A FuelTank object encapsulates the state information needed for describing the state of the tank:
 * <ul>
 *   <li> tankMax   capacity of the tank
 *   <li> tankLevel	fuel level of the tank
 * </ul>
 *
 * class invariant 		0.0 &lt;= tankLevel &lt;= tankMax
 *
 * @author UC3M MOOC Team
 *
 */
public class FuelTank {

    private double tankMax;
    private double tankLevel;

    /**
     * FuelTank is a constructor of the class.
     *
     * <hr>
     * <br> precondition  tankMax &gt; 0.0 and 0.0 &lt;= tankLevel &lt;= getTankMax()
     * <br> postcondition tankMax &gt; 0.0 and 0.0 &lt;= tankLevel &lt;= getTankMax()
     * <hr>
     *
     * @param tankMax  is the amount of fuel  (measured in liters) that the tank can hold
     * @param tankLevel is the amount of fuel (measured in liters) that the tank will have initially
     *
     */
    FuelTank(double tankMax, double tankLevel) {
        this.tankMax   = tankMax;
        this.tankLevel = tankLevel;
    }

    /**
     * getTankLevel is an accessor method
     *
     * @return	the amount of fuel in the tank
     */
    public double getTankLevel(){
        return tankLevel;
    }

    /**
     * getTankMax is an accessor method
     *
     * @return	the capacity (in liters) of the tank
     */
    public double getTankMax(){
        return tankMax;
    }

    /**
     * isEmpty gives a status report
     *
     * @return 	<code>true</code> if the tank is empty
     *          <code>false</code> otherwise.
     */
    public boolean isEmpty(){
        return tankLevel == 0;
    }

    /**
     * isFull gives a status report
     *
     * @return 	<code>true</code> if the tank is full
     *          <code>false</code> otherwise.
     */
    public boolean isFull(){
        return tankLevel == tankMax;
    }

    /**
     * fill is a mutator method that adds fuel to the tank
     *
     * <hr>
     * <br> precondition 	0.0 &lt; amount &lt;= getTankMax() - getTankLevel()
     * <br> postcondition 	not empty
     * <br> postcondition  	tankLevel &gt; tankLevel_initial
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
     * @param amount the amount of fuel to consume
     *
     */
    public void consume(double amount){
        tankLevel = tankLevel - amount;
    }
}