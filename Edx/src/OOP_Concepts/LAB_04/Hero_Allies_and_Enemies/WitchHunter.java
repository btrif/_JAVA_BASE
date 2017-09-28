package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:39 AM.
 */
/**
 * This code allows you to represent an ally that fights against witches.
 */
public class WitchHunter extends Ally{
    public WitchHunter(String name, String description){
        super(name, description,Character.SPELL);
    }
    private void secretSkillAgainstWitches(){
        System.out.println("This is my secret skill against Witches");

    }
}
