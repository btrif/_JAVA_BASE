package EDX_UC3Mx_Part_II.WEEK_07.Integration_Testing;

/**
 * Created by Bogdan Trif on 23-05-2017 , 10:58 AM.
 */
public class TravelTest {


    public static void testNotEnoughFuelForTravel(){
//        FuelTank tank = new FuelTank(40, 15);
        FuelTank tank = new FuelTank(40, 10);
        System.out.println("Tank LEvel  = " + tank.getTankLevel() + "     Tank MAx LEvel = " + tank.getTankMax() );
//        Car car = new Car(tank, 0.09 );
        Car car = new Car(tank, 0.1 );
        System.out.println("Car consumption = " + car.consumption +"  current level =  " + car.tank.getTankLevel());
//        double kms = 250.0 ;
        double kms = 550 ;
        GasStation gs = new GasStation(0.8, 1);


        double missingkms= car.travel(kms);
        System.out.println("\nMissing kms = "  + missingkms );

        double payment = gs.refuel(car,missingkms);
        System.out.println("Gasstation costs :  " + payment );


        System.out.print("\nTravelTest.testNotEnoughFuelForTravel() -> missing kilometers are: "+ missingkms);
        System.out.println(" and the amount to pay is US$" + payment);


    }

    public static void main(String[] args) {
        TravelTest.testNotEnoughFuelForTravel();
    }

}
