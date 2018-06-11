package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 10:04 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character ;

public class Skeleton extends Enemy {
    public Skeleton(String name, String description) {
        super(name, description, Character.SWORD);
        footprint = 's';
    }
}
