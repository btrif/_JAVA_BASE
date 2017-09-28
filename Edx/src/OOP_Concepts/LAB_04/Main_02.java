package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 7:51 PM.
 */
/**
 * Main class of the Java program.
 * This code allows you to create different characters to be used in a simple
 * game.
 */

public class Main_02 {

    public static void main(String[] args){
        System.out.println("Setting up the character");
        //Example of constructor invocation
        Character_02 heroJohn = new Character_02("John", 10, 5, "blond haired man");
        //We can call a method of a particular Character using:
        //the name of the object followed by a point and the name of the method
        heroJohn.printInfo();
    }
}
