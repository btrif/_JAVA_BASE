package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 9:30 PM.
 */
public class Main_05 {
    public static void main(String[] args){
        System.out.println("Setting up the character");
        Character_05 heroJohn = new Character_05("John", "A clever boy of 16 years",
                10, Character_05.CLEVERNESS);
        heroJohn.printInfo();
        Character_05 enemyMary = new Character_05("Mary");
        enemyMary.printInfo();
	    /* 1st combat:
	       notes that cleverness beats spells and fight with his intelligence
		   strengthens the character's health*/
        System.out.println("1st combat");
        heroJohn.fight(heroJohn, enemyMary );
        System.out.println("Info after the 1st combat");
        heroJohn.printInfo();
		/* 2nd combat:
	       notes that the chains are less effective than cleverness and fight
		   with them weakens the character's health */
        System.out.println("2nd combat");
        heroJohn.fight(heroJohn, enemyMary);
        System.out.println("Info after the 2nd combat");
        heroJohn.printInfo();

		/* 3rd combat: */
        System.out.println("3rd combat");
        heroJohn.fight(enemyMary);
        System.out.println("Info after the 3rd combat");
        heroJohn.printInfo();
        enemyMary.printInfo();

    }
}
