package OOP_Concepts.LAB_04.Hero_Allies_and_Enemies;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:40 AM.
 */

import java.lang.*;

/**
 * Main class of the Java program.
 * This code allows you to create different characters to be used in a simple
 * game.
 */

public class Main {

    public static void main(String[] args){
        Character heroJohn = new Character("John",
                "A clever boy of 16 years. " +
                        "\n" +
                        "The hero of this story",
                Character.CLEVERNESS);
        Witch witchMary = new Witch("Mary the witch",
                "An old and ugly woman.\n" +
                        "A malevolent witch");
        Ghost ghostGeorge = new Ghost("George the ghost",
                "A white and silly ghost.");
        Vampire vampireFred = new Vampire("Fred the vampire",
                "The most elegant enemy.");
        WitchHunter witchHunterEve = new WitchHunter("Eve the witch hunter",
                "Fight against witches");
        GhostBuster ghostBusterPeter = new GhostBuster("Peter the ghostbuster",
                "Fight against ghosts.");
        /*VampireHunter vampireHunterEddy = new VampireHunter("Eddy the vampire hunter",
                                       "Fight against vampires.");  */

        heroJohn.printInfo();
        ghostBusterPeter.secretSkillAgainstGhosts(); // here we access a public method
//        witchHunterEve.    // here we have private method and cannot use the method secretSkillAgainstWitches
        witchMary.printInfo();
        ghostGeorge.printInfo();
        vampireFred.printInfo();

        witchHunterEve.printInfo();
        ghostBusterPeter.printInfo();
        //vampireHunterEddy.printInfo();


    }
}

