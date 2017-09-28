package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:39 AM.
 */
/**
 * This code allows you to represent an ally that fights against ghosts.
 */
public class GhostBuster extends Ally{
    public GhostBuster(String name, String description){
        super(name, description,Character.CHAINS);
    }
    // If secretSkillAgainstGhosts method would be private this could not be used outside
    // the class GhostBuster and therefore can't be inherited
    public void secretSkillAgainstGhosts(){
        System.out.println("This is my secret skill against Ghosts");

    }
}
