package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:39 AM.
 */
/**
 * This code allows you to represent a generic witch to be used in a simple game.
 */

public class Witch extends Enemy{
    public Witch(String name, String description){
        super(name, description, Character.SPELL);
    }
}
