package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:38 AM.
 */
/**
 * This code allows you to represent a character to be used in a simple game.
 */
public class Character{
    /* Constant to define the maximum health value */
    public static final int MAX_HEALTH = 10;

    /* constants to describe possible values of secret Weapon */
    public static final int CLEVERNESS = 5; // cleverness-5 mainly used by heros
    public static final int SPELL = 4; // spell-4 mainly used by wizards and witches
    public static final int SWORD = 3; // sword-3 mainly used by warriors
    public static final int TEETH = 2;  // teeth-2 mainly used by vampires
    public static final int CHAINS = 1; // chains-1 mainly used by ghosts
    public static final int UNDEFINED = -1; // default value for weapon

    /* variables to describe the character */
    private String name;
    private String description;
    private int secretWeapon;
    private int health = MAX_HEALTH;

    /*Constructor methods*/
    public Character(String otherName, String otherDescription,
                     int otherHealth, int otherSecretWeapon){
        name = otherName;
        description = otherDescription;
        health = otherHealth;
        setSecretWeapon(otherSecretWeapon);
    }

    public Character(String otherName, String otherDescription,
                     int otherSecretWeapon){
        this(otherName, otherDescription, MAX_HEALTH, otherSecretWeapon);
    }

    public Character(String otherName){
        this(otherName, "Undefined description", MAX_HEALTH, UNDEFINED);
    }

    public Character(){
        this("Undefined name", "Undefined description", MAX_HEALTH, UNDEFINED);
    }


    /*Accessors and mutators*/
    public void setName(String n) {name = n;}
    public String getName(){return name;}
    public void setDescription(String d){description = d;}
    public String getDescription(){return description;}
    public int getSecretWeapon(){return secretWeapon;}
    public void setSecretWeapon(int sw){
        if(sw == CLEVERNESS || sw == SPELL || sw == SWORD ||
                sw == TEETH || sw == CHAINS){
            secretWeapon = sw;
        }else{
            secretWeapon = UNDEFINED;
        }
    }
    //todo: add method set and get for the attribute health
    public void setHealth(int h){health = h;}
    public int getHealth(){return health;}

    /*Other methods*/
    public void resetHealth(){health=MAX_HEALTH;}


    public void printInfo(){
        String result =
                "*************************************"+ "\n" +
                        "Name: " + name + "\n" +
                        "Description: " + description + "\n" +
                        "Secret weapon: " + secretWeapon + "\n" +
                        "Health: " + health + "\n" +
                        "Is Alive?: " + isAlive() + "\n" +
                        "*************************************";
        System.out.println(result);
    }

    public void fight (Character enemy){
        int result = secretWeapon - enemy.getSecretWeapon();
        System.out.println("result:"+result);
        health = health + result;
        enemy.setHealth(enemy.getHealth() - result);
    }

    public void fight (Character character1, Character character2){
        int result = character1.getSecretWeapon() - character2.getSecretWeapon();
        character1.setHealth(character1.getHealth() + result);
        character2.setHealth(character2.getHealth() - result);
    }

    public boolean isAlive(){
        return health > 0;
    }

}
