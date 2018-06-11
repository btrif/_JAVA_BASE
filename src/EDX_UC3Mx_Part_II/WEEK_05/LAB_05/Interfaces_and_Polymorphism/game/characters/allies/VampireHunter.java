package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 6:17 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character;

/**
 * This code allows you to represent an ally that fights against Vampires.
 */
public class VampireHunter extends Ally{
    public VampireHunter(String name, String description){
        super(name, description, Character.TEETH);
        footprint = 'V';
    }
    private void secretSkillAgainstVampire(){
        System.out.println("This is my secret skill against Vampires");

    }
}