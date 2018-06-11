package OOP_Concepts.Classes_basics; /**
 * Created by Bogdan Trif on 27-04-2017 , 7:27 PM.
 */
/**
 * Main class of the Java program.
 */

public class Car {


    /**
     * The car color
     */
    String color;

    /**
     * If lights are turned on is true, false otherwise
     */
    boolean lights;

    /**
     * Creates a new car
     *
     * @param c  the car color
     * @param l  the state of the car lights
     */
    public Car(String c, boolean l){
        //Complete the missing code here
        color = c ;
        lights = l ;

    }

    public void printCarInformation(){
        String state = "";
        if(lights){
            state = "on";
        }else{
            state = "off";
        }
        System.out.println("This car is "+color+" and lights are "+state);
    }

    // Main loop Execution
    public static void main(String[] args) {
        System.out.println("-------- Car 1 -----------");
        Car c = new Car("green",true);
        System.out.println("We have created a car!");
        c.printCarInformation();

        System.out.println("-------- Car 2 -----------");
        Car car2 = new Car("blue",true);
        System.out.println("We have created the second car!");
        car2.printCarInformation();
    }
}
