package WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 6:16 PM.

/**
 * Tests for class PetrolStation
 * Class created for Testing PetrolStation (Lab2),
 * -> question 2 solution.
 *
 */


public class PetrolStationTest {

    PetrolStation ps = null ;
    double amountEuros ;

    public PetrolStationTest(){

        ps = new PetrolStation(1, 1.0, 1.5) ;
        amountEuros = 20 ;
    }

    public void EnterOnceForIfFillEuros() {
        FuelTank tank1 = new FuelTank(40, 39) ;
        Car car1 = new Car(tank1, 0.9) ;
        double notSpendEuros = ps.fillEuros(car1 , amountEuros) ;
        System.out.println("The client spends " + (amountEuros - notSpendEuros) + " euros.");

    }

    public void EnterOnceForElseFillEuros() {
        FuelTank tank2 = new FuelTank(60, 60) ;
        Car car2 = new Car(tank2, 0.9) ;
        double notSpendEuros = ps.fillEuros(car2 , amountEuros) ;
        System.out.println("The client spends " + (amountEuros - notSpendEuros) + " euros.");

    }

}
