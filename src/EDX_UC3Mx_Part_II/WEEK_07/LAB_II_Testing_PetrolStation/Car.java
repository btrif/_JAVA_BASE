package EDX_UC3Mx_Part_II.WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 4:51 PM.


/**
 * Car is a simple simulation of a car,
 * it can travel using the amount of fuel in its fuel tank.
 *
 * @author UC3M MOOC Team
 */
public class Car {

    FuelTank tank;
    double   consumption;

    /**
     * Car is a constructor method
     *
     * <hr>
     * <br> precondition   tank &#33;= null
     * <br> precondition   consumption &gt; 0.0
     * <hr>
     *
     * @param tank the FuelTank of this Car object
     * @param consumption the amount of fuel consumed by kilometer
     *
     */
    Car(FuelTank tank, double consumption){
        this.tank 		 = tank;
        this.consumption = consumption;
    }

    /**
     * getTank access to the car's fuel tank
     *
     * @return the tank of the Car instance
     */
    public FuelTank getTank(){
        return tank;
    }

    /**
     * amountKilometers indicates the amount of kilometers that the car can travel
     * with "amountFuel" fuel
     *
     * <hr>
     * <br> precondition  amountFuel &gt;= 0
     * <br> postcondition return_value &gt;= 0
     * <hr>
     *
     * @param amountFuel a quantity of fuel
     * @return the amount of kilometers that car traveled with the amount of fuel given
     *
     */
    public double amountKilometers(double amountFuel){
        return amountFuel / consumption;
    }

    /**
     * amountFuel indicates the amount of fuel that the car needs to travel "kilometers" kilometers
     *
     * <hr>
     * <br> precondition  amountKilometers &gt;= 0
     * <br> postcondition return_value &gt;= 0
     * <hr>
     *
     * @param kilometers a measure of distance
     * @return the amount of fuel necessary to travel the distance indicated by kilometers
     *
     */
    public double amountFuel(double kilometers){
        return kilometers * consumption;
    }


    /**
     * travel receives the number of kilometers that the customer intends to travel
     * returns the number of kilometers that could not be traveled
     *
     * <hr>
     * <br> precondition  kilometers &gt; 0.0
     * <br> postcondition kilometers_final &lt; kilometers_initial
     * <hr>
     *
     * @param kilometers distance to travel
     * @return return_value = 0 if there were enough fuel to travel "kilometers" kilometers, otherwise, return_value &gt; 0.0
     *
     */

    public double travel(double kilometers){
        double amountFuelNecessary 	= amountFuel(kilometers);
        double amountFuelAvailable 	= tank.getTankLevel();

        if (amountFuelNecessary > amountFuelAvailable){
            tank.consume(amountFuelAvailable);
            return amountKilometers(amountFuelNecessary - amountFuelAvailable);
        } else{
            tank.consume(amountFuelNecessary);
            return 0.0;
        }
    }
}
