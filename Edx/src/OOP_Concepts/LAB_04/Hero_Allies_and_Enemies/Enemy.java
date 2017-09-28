package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:38 AM.
 */

import java.lang.*;

/**
 * This code allows you to represent a generic enemy to be used in a simple game.
 */

public class Enemy extends Character {
    public static final String DEFAULT_SCARY_MSG = "Do you want to know what the fear is?";

    public Enemy(String name, String description, int secretWeapon){
        super(name, description,secretWeapon);
    }
    public void scare(){
        System.out.println(DEFAULT_SCARY_MSG);
    }

    //todo: create a new scare method:  public void scare(String message)

}
