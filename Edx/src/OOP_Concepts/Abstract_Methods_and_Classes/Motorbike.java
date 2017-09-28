package OOP_Concepts.Abstract_Methods_and_Classes;

/**
 * Created by Bogdan Trif on 02-05-2017 , 2:50 PM.
 */
/**
 * Motorbike class of the Java program.
 */

public class Motorbike extends Vehicle {

    /**
     * Creates a new motorbike
     *
     * @param c  the motorbike color
     * @param l  the state of the motorbike lights
     */
    public Motorbike(String c, boolean l){
        super(c,l);
    }


    /**
     * Returns a String representation of the motorbike
     *
     * @return the String representation of the motorbike
     */
    public String toString(){
        String state = "";
        if(lights){
            state = "on";
        }else{
            state = "off";
        }
        String result = "This motorbike is "+color+", lights are "+state+".";
        return result;
    }

    /**
     * Prints a description of the motorbike to the console
     *
     */
    public void printDescription(){
        System.out.println(toString());
    }

}
