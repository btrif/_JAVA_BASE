package EDX_UC3Mx_Part_II.WEEK_07.Integration_Testing;

/**
 * Created by Bogdan Trif on 22-05-2017 , 5:21 PM.
 */
public class Car {

    FuelTank tank;
    double consumption;

    //Constructor
    Car(FuelTank tank, double consumption)  {
        this.tank = tank ;
        this.consumption = consumption ;
    }

    public double amountKilometers (double amountFuel)  {
        return amountFuel / consumption;
    }

    public FuelTank getTank() {
        return tank ;
    }

    public double amountFuel (double km) {
        return km * consumption;
    }

    public double travel (double km){
        double amountFuelNeeded=amountFuel(km);
        double amountFuelAvailable=tank.getTankLevel();
        if (amountFuelNeeded > amountFuelAvailable){
            tank.consume(amountFuelAvailable);
            return amountKilometers(amountFuelNeeded - amountFuelAvailable);
        } else {
            tank.consume(amountFuelNeeded);
            return 0.0;
        }
    }
}
