package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism;


/**
 * Created by Bogdan Trif on 04-05-2017 , 6:03 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Explorer;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies.GhostBuster;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies.SkeletonHunter;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies.VampireHunter;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.allies.WitchHunter;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies.Ghost;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies.Skeleton;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies.Vampire;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies.Witch;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.terrains.Maze;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.vehicles.Car;

/**
 * Main class of the Java program.
 * This code allows you to create different characters to be used in a simple
 * game.
 */

public class Main {

    public static void main(String[] args){
        Character heroJohn = new Character("John",
                "A clever boy of 16 years. " +
                        "\n" + "The hero of this story",   Character.CLEVERNESS);
        Witch witchMary = new Witch("Mary the witch",
                "An old and ugly woman.\n" +
                        "A malevolent witch");
        Ghost ghostGeorge = new Ghost("George the ghost",
                "A white and silly ghost.");
        Vampire vampireFred = new Vampire("Fred the vampire",
                "The most elegant enemy.");
        Skeleton skeletonRick = new Skeleton("Rick the vampire",
                "The most dead enemy.");

        WitchHunter witchHunterEve = new WitchHunter("Eve the witch hunter",
                "Fight against witches");
        GhostBuster ghostBusterPeter = new GhostBuster("Peter the ghostbuster",
                "Fight against ghosts.");
        VampireHunter vampireHunterEddy = new VampireHunter("Eddy the vampire hunter",
                "Fight against vampires.");
        SkeletonHunter skeletonHunterBogdan = new SkeletonHunter("Bogdan the skeleton hunter",
                "Fight against skeletons.");


        int[][] maze =
                {{0, 0, 1, 1, 1, 1, 1, 1},
                        {2, 0, 1, 0, 0, 0, 1, 1},
                        {1, 0, 1, 0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 1, 3, 1, 1},
                        {0, 0, 1, 0, 1, 0, 0, 1},
                        {1, 0, 1, 1, 1, 0, 0, 0},
                        {1, 1, 1, 0, 1, 1, 0, 0}};

        Maze sampleMaze = new Maze(maze);

        //polymorphism using superclasses
        Character [] characters = {heroJohn, witchMary, ghostGeorge, vampireFred, skeletonRick,
                witchHunterEve,ghostBusterPeter, vampireHunterEddy, skeletonHunterBogdan};
        for(int i=0; i<characters.length;i++){
            characters[i].printInfo();
        }


        //polymorphism using interfaces
        Car myFerrari = new Car("Ferrari");

        System.out.println("All exploring: hero +, witch w, ghost g, vampire v, witchHunter W, ghostbuster G, vampireHunter V, skeleton s, ferrari c");

        Explorer[] explorers = {heroJohn, witchMary, ghostGeorge, vampireFred, skeletonRick,
                witchHunterEve,ghostBusterPeter, vampireHunterEddy, skeletonHunterBogdan, myFerrari};
        for(int i=0; i < explorers.length; i++){
            explorers[i].explore(sampleMaze);

        }

    }
}

