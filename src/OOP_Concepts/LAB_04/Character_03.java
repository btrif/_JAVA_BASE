package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 7:59 PM.
 */
public class Character_03 {
    /* variables to describe the character */
    private String name;
    private String description;
    private int secretWeapon;
    private int health =10;

    /*  Constructor method   */
    public Character_03(String otherName, String otherDescription,
                     int otherHealth, int otherSecretWeapon){
        name = otherName;
        description = otherDescription;
        health = otherHealth;
        secretWeapon = otherSecretWeapon;
    }

    /*Accessors and mutators*/
    public void setName(String n) {name = n;}
    public String getName(){return name;}
    // to do method setDescription
    public void setDescription(String d) {description = d;}
    public String getDescription(){return description;}
    public void setSecretWeapon(int sw) {secretWeapon = sw;}
    public int getSecretWeapon() {return secretWeapon ;}
    public void setHealth(int h) {health = h;}
    public int getHealth() {return health ;}



	/*Other methods*/
    // todo: create public void resetHealth(){//your code here;}
    public void resetHealth(){ setHealth(10) ;}


    /*Other methods*/
    public void printInfo(){
        String result =
                "*************************************"+ "\n" +
                        "Name: " + getName() + "\n" +
                        "Description: " + getDescription() + "\n" +
                        "Secret weapon: " + secretWeapon + "\n" +
                        "Health: " + getHealth() + "\n" +
                        "*************************************";
        System.out.println(result);
    }

}
