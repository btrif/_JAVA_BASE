package WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 4:54 PM.


/**
 * PetrolStation has an infinity capacity of fuel
 * when it is created fix the price of fuel
 *
 * @author UC3M MOOC Team
 * @since 04-2016
 *
 */
public class PetrolStation {

    double price;
    double fuelQuantum;

    /**
     * PetrolStation is a constructor
     *
     * <hr>
     * <br> precondition  min > 0.0 and max > 0.0 and min < max and fuelQuantum > 0.0
     * <br> postcondition min < price < max
     * <br> postcondition price > 0.0
     * <hr>
     */
    PetrolStation(double min, double max, double fuelQuantum){
        price = min + (max - min)/2;
        this.fuelQuantum = fuelQuantum;
    }

    /**
     * getPrice is an accessor method
     *
     * @return the price of fuel in this petrol station
     */
    public double getPrice(){
        return price;
    }

    /**
     * getFuelQuantum is an accessor method
     *
     * @return the smaller amount of fuel that can be provided
     */
    private double getFuelQuantum(){
        return fuelQuantum;
    }

    /**
     * amountFuelCustomerCanBuy returns the amount of fuel the Customer can buy with "euros" euros
     *
     * <hr>
     * <br> precondition  amountEuros > 0
     * <br> postcondition returnValue >= 0
     * <hr>
     *
     * @param amountEuros: the amount of euros the customer can spend
     * @return the amount of fuel the customer can buy
     *
     */
    private double amountFuelCustomerCanBuy(double amountEuros){
        return amountEuros / price;
    }

    /**
     * cost returns the cost of "liters" euros of petrol
     *
     * <hr>
     * <br> precondition  liters &gt; 0
     * <br> postcondition returnValue &gt;= 0
     * <hr>
     *
     * @param liters: the amount of liters to compute its cost
     * @return the cost of "liters" liters of petrol in this petrol station
     *
     */
    public double cost(double liters){
        return liters * price;
    }

    /**
     * canAddMoreFuel verifies if the fill's FuelTank method is satisfied
     *
     * <hr>
     * <br> precondition  tank &#33;= NULL
     * <br> postcondition returnValue == (fuelQuantum <= tank.getCapacity() - getTankLevel())
     * <hr>
     *
     * @param tank: the reference to the Fuel Tank
     * @return <code>true</code> if it is possible to add fuelQuantum quantity of fuel to the tank
     *         <code>false</code> otherwise.
     *
     */
    private boolean canAddMoreFuel(FuelTank tank){
        return (tank.getTankLevel() + fuelQuantum) <= tank.getCapacity();
    }

    /**
     * howMuchCostFillTank
     *
     * @param car: the reference to the Car
     * @return the amount of money necessary to fill the tank
     */
    public double howMuchCostFillTank(Car car){
        FuelTank tank           = car.getTank();
        double litersNeeded     = tank.getCapacity() - tank.getTankLevel();
        return cost(litersNeeded);
    }

    /**
     * fillEuros the customer can buy "amountEuros" euros of fuel
     * the car's tank is filled to its maximum capacity
     *
     * <hr>
     * <br> precondition 	car &#33;= NULL
     * <br> precondition 	amountEuros &gt; 0.0
     * <br> postcondition 	car.getTank().getTankLevel() &gt;= car.getTank().getTankLevel()_initial
     * <hr>
     *
     * @param car: reference to the customer's car's tank
     * @param amountEuros: amount of money the customer is willing to spend
     * @return the amount of euros that the customer did not spend
     *
     */
    public double fillEuros(Car car, double amountEuros){
        FuelTank tank           = car.getTank();
        double maxAmountFuel    = amountFuelCustomerCanBuy(amountEuros);      // maximum amount of fuel the customer can buy
        double amountFiled	    = 0.0;

        for(int i = 0; i < (int) maxAmountFuel; i++){
            if (canAddMoreFuel(tank)){
                tank.fill(fuelQuantum);
                amountFiled = amountFiled + fuelQuantum;
            } else {
                break;
            }
        };

        return amountEuros - cost(amountFiled) ;
    }

}
