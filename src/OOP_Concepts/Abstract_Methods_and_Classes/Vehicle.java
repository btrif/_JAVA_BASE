package OOP_Concepts.Abstract_Methods_and_Classes;

/**
 * Created by Bogdan Trif on 02-05-2017 , 2:49 PM.
 */
/**
 * Vehicle class of the Java program.
 */

public abstract class Vehicle {

    /**
     * The vehicle color
     */
    String color;

    /**
     * If lights are turned on is true, false otherwise
     */
    boolean lights;

    /**
     * Creates a new vehicle
     *
     * @param c  the vehicle color
     * @param l  the state of the vehicle lights
     */
    public Vehicle(String c, boolean l){
        color = c;
        lights = l;
    }

    /**
     * Returns a String representation of a vehicle
     *
     * @return the String representation of the vehicle
     */
    public String toString(){
        return "I am a vehicle"    ;
    }


    /**
     * Prints a description of the vehicle to the console
     *
     */
    public abstract void printDescription();

    /**
     * Gets the vehicle color
     *
     * @return  the vehicle color
     */
    public String getColor(){
        return color;
    }

    /**
     * Gets the vehicle lights
     *
     * @return  the state of the vehicle lights
     */
    public boolean getLights(){
        return lights;
    }

    /**
     * Sets the vehicle color
     *
     * @param c  the vehicle color
     */
    public void setColor(String c){
        this.color = c;
    }

    /**
     * Sets the lights value
     *
     * @param l  the state of the vehicle lights
     */
    public void setLights(boolean l){
        this.lights = l;
    }
}
