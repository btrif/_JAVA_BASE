package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 6:16 PM.
 */

//import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character;

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character ;


/**
 * This code allows you to represent a generic vampire to be used in a simple game.
 */

public class Vampire extends Enemy {
    public Vampire(String name, String description){
        super(name, description, Character.TEETH);
        footprint = 'v';
    }
}
