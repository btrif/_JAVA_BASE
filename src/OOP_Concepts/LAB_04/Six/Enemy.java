package OOP_Concepts.LAB_04.Six;

/**
 * Created by Bogdan Trif on 02-05-2017 , 8:18 AM.
 */
public class Enemy extends Character{
    public static final String DEFAULT_SCARY_MSG = "Do you want to know what the fear is?";

    public Enemy(String name, String description, int secretWeapon){
        super(name, description,secretWeapon);
    }
    public void scare(){
        System.out.println(DEFAULT_SCARY_MSG);
    }

    // HERE WE OVERLOAD THE METHOD public void scare by creating a method with a string parameter
    //todo: create a new scare method:  public void scare(String message)
    public void scare(String message){
        System.out.println(message);
    }

}
