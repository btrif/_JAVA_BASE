package OOP_Concepts.Abstract_Methods_and_Classes;

/**
 * Created by Bogdan Trif on 02-05-2017 , 2:49 PM.
 */
/**
 * Truck class of the Java program.
 */

public class Truck extends Vehicle {

    /**
     * Number of trailers
     It is not declared as private, therefore we can access it from outside !
     */
    int trailers;

    /**
     * Creates a new truck
     *
     * @param c  the truck color
     * @param l  the state of the truck lights
     */
    public Truck(String c, boolean l){
        super(c,l);
        trailers = 0;
    }

    /**
     * Creates a new truck
     *
     * @param c  the truck color
     * @param l  the state of the car lights
     * @param t  the number of trailers
     */
    public Truck(String c, boolean l, int t){
        super(c,l);
        trailers= t;
    }

    /**
     * Returns a String representation of the truck
     *
     * @return the String representation of the truck
     */
    public String toString(){
        String state = "";
        if(lights){
            state = "on";
        }else{
            state = "off";
        }
        String result1 = "This truck is "+color+", lights are "+state;
        String result2 = " and carries "+trailers+" trailers.";
        return result1+result2;
    }

    /**
     * Prints a description of the truck to the console
     *
     */


    /**
     * Gets the number of trailers
     *
     * @return  the number of trailers of the truck
     */
    public int getTrailers(){
        return trailers;
    }

    /**
     * Sets the number of trailers color
     *
     * @param t  the number of trailers
     */
    public void setTrailers(int t){
        trailers = t;
    }

    public void printDescription(){
        System.out.println(toString());
    }

}
