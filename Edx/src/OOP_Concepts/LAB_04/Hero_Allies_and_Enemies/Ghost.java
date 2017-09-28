package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:38 AM.
 */

import java.lang.*;

/**
 * This code allows you to represent a generic ghost to be used in a simple game.
 */

public class Ghost extends Enemy {
    public Ghost(String name, String description){
        super(name, description, Character.CHAINS);
    }
}
