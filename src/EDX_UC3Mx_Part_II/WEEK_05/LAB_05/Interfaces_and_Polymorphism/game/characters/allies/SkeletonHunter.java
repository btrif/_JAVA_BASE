package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 10:04 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character;

public class SkeletonHunter extends Ally{


    public SkeletonHunter(String name, String description){
        super(name, description, Character.SPELL);
        footprint = 'H';
    }

    private void secretSkillAgainstSkeletons(){
        System.out.println("This is my secret skill against Skeletons");

    }
}
