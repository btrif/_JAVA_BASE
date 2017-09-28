package WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 6:17 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character;

/**
 * This code allows you to represent an ally that fights against witches.
 */
public class WitchHunter extends Ally{
    public WitchHunter(String name, String description){
        super(name, description, Character.SPELL);
        footprint = 'W';
    }
    private void secretSkillAgainstWitches(){
        System.out.println("This is my secret skill against Witches");

    }
}