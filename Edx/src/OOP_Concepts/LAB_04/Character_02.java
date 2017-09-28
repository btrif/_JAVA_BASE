package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 7:51 PM.
 */
public class Character_02 {
    /* variables to describe the character */
    String name;
    String description ;
    int health;
    int secretWeapon;

    /*Constructor method*/
    public Character_02(String otherName, int otherHealth, int otherSecretWeapon, String otherDescription){
        name = otherName;
        description = otherDescription ;
        health = otherHealth;
        secretWeapon = otherSecretWeapon;

    }

    /*Other methods*/
    public void printInfo(){
        String result =
                "*************************************"+ "\n" +
                        "Name: " + name + "\n" +
                        "Description : " +  description + "\n" +
                        "Secret weapon: " + secretWeapon + "\n" +
                        "Health: " + health + "\n" +
                        "*************************************";
        System.out.println(result);
    }


}
