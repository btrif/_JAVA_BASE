package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 9:13 PM.
 */
public class Main_04 {
    public static void main(String[] args){
        System.out.println("Setting up the character");
        Character_04 heroJohn = new Character_04("John", "A clever boy of 16 years",
                10, Character_04.CLEVERNESS);
        heroJohn.printInfo();

	    /* 1st combat:
	       notes that cleverness beats spells and fight with his intelligence
		   strengthens the character's health*/
        System.out.println("1st combat");
        heroJohn.fight(Character_04.CLEVERNESS, Character_04.SPELL);
        System.out.println("Info after the 1st combat");
        heroJohn.printInfo();
        System.out.println(heroJohn.getName() + " is Alive = " + heroJohn.isAlive());
		/* 2nd combat:
	       notes that the chains are less effective than cleverness and fight
		   with them weakens the character's health */
        System.out.println("2nd combat");
        heroJohn.fight(Character_04.CHAINS, Character_04.CLEVERNESS);
        System.out.println("Info after the 2nd combat");
        heroJohn.printInfo();
        System.out.println(heroJohn.getName() + " is Alive = " + heroJohn.isAlive());
    }
}
