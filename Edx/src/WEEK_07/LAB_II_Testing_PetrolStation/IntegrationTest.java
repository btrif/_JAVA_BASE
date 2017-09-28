package WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 6:40 PM.


public class IntegrationTest {

    public void testNotEnoughFuelForTravel(){
        FuelTank tank = new FuelTank(60, 15) ;
        Car car = new Car(tank, 0.09) ;
        double kms = 250 ;
        PetrolStation ps = new PetrolStation(0.9, 1.1, 0.1 ) ;
        double amountEuros = 100 ;
        double notSpendEuros = amountEuros ;

        double missing_kms = car.travel(kms) ;
        if (missing_kms > 0 ) {
            notSpendEuros = ps.fillEuros(car, amountEuros) ;
        }

        System.out.println("The client spends " + (amountEuros - notSpendEuros) + " euros.");

    }

}
