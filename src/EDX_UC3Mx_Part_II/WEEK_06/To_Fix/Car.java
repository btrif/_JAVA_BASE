package EDX_UC3Mx_Part_II.WEEK_06.To_Fix;

/**
 * Created by Bogdan Trif on 11-05-2017 , 5:32 PM.
 */

/**
 * Class that models objects of type "car"
 *
 * @Java MOOC team, UC3M
 * @2.0
 */


import java.util.Arrays;
import java.awt.Color;

public class Car extends Garage {
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels

    Garage theGarage=null;


    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
        theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        Garage g = new Garage();
        Car car = new Car(g);
        accelerate();
        slowDown();
        moveDown();
        accelerate();
        car.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }

    /**
     * Accelerate the car
     * @throws InterruptedException
     */
    static public void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
        for(int i=0; i<5; i++)        {
            System.out.print(c);
            c = space.concat(c);
            Thread.sleep(1000);
        }
    }

    /**
     * Slow down the car
     * @throws InterruptedException
     */
    static public void slowDown() throws InterruptedException{
        String c = new String("     *");
        for(int i=0; i<5; i++)
        {
            System.out.print(c);
            c = c.substring(1);
            Thread.sleep(1000);
        }
        System.out.println();
    }

    /**
     * Move the car downwards
     * @throws InterruptedException
     */
    static public void moveDown() throws InterruptedException{
        String c = new String("\t\t\t\t  *");
        for(int i=0; i<5; i++)
        {
            if(i!=4)
                System.out.println(c);
            else
                System.out.print(c);
            Thread.sleep(1000);
        }
    }

}

