package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 9:29 PM.
 */
public class Character_05 {
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
    public Character_05(String otherName, String otherDescription,
                     int otherHealth, int otherSecretWeapon){
        name = otherName;
        description = otherDescription;
        health = otherHealth;
        setSecretWeapon(otherSecretWeapon);
    }

    public Character_05(String otherName){
	    /* all this sentences are equivalent to make a call to the previous constructor
	    (with all parameters) using this, and providing a default value for
	    all these variables for which we don't know its values.
	    name = otherName;
	    description = "Undefined description";
	    resetHealth();
	    setSecretWeapon(UNDEFINED);
	    */
        this(otherName, "Undefined description", MAX_HEALTH, UNDEFINED);
    }

    //todo create the constructor public Character_05();

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

    // to do: change this method using only one param (int enemyWeapon)
    public  void  fight (int enemyWeapon){
        int result= getSecretWeapon() - enemyWeapon;
        health = health + result;
    }

    public void fight (Character_05 enemy){
        int result = secretWeapon - enemy.getSecretWeapon();
        health = health + result;
        enemy.setHealth(enemy.getHealth() - result);
    }

    // to do: create new method public void fight with two params
    //public void fight (Character character1, Character character2)
    public void fight (Character_05 character1, Character_05 character2){
        int result = character1.getSecretWeapon() - character2.getSecretWeapon() ;
        character1.setHealth( character2.getHealth() - result );
        character2.setHealth( character1.getHealth() - result );

    }

    public boolean isAlive(){
        return health > 0;
    }
}
