package WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 6:03 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character;

/**
 * This code allows you to represent an ally that fights against ghosts.
 */
public class GhostBuster extends Ally{
    public GhostBuster(String name, String description){
        super(name, description, Character.CHAINS);
        footprint = 'G';
    }
    private void secretSkillAgainstGhosts(){
        System.out.println("This is my secret skill against Ghosts");

    }

}
