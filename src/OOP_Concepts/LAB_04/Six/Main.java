package OOP_Concepts.LAB_04.Six;

/**
 * Created by Bogdan Trif on 02-05-2017 , 8:18 AM.
 */
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

        heroJohn.printInfo();
        witchMary.printInfo();
        witchMary.scare("I will be your worst nightmare");
        witchMary.scare();
        ghostGeorge.printInfo();
        ghostGeorge.scare("you can't beat me !");

	     /* 1st combat*/
        System.out.println("1st combat");
        heroJohn.fight(witchMary);

        System.out.println("Info after the 1st combat");
        heroJohn.printInfo();
        witchMary.printInfo();

		/* 2nd combat*/
        System.out.println("2nd combat");
        heroJohn.fight(witchMary, ghostGeorge);
        System.out.println("Info after the 2nd combat");
        heroJohn.printInfo();
        witchMary.printInfo();
        ghostGeorge.printInfo();

    }
}
