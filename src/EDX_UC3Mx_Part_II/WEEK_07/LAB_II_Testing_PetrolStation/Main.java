package EDX_UC3Mx_Part_II.WEEK_07.LAB_II_Testing_PetrolStation;

//  Created by Bogdan Trif on 23-05-2017 , 4:53 PM.


/**
 * Main class allows to run manual tests through standard output
 *
 * @author UC3M MOOC Team
 * @since 04-2016
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("************Testing question 2***************");
        PetrolStationTest pst = new PetrolStationTest();
        pst.EnterOnceForIfFillEuros();
        pst.EnterOnceForElseFillEuros();


        System.out.println("************Testing question 4***************");
        IntegrationTest intest = new IntegrationTest();
        intest.testNotEnoughFuelForTravel();
    }
}
