package WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters;

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.terrains.* ;

/**
 * Created by Bogdan Trif on 04-05-2017 , 5:05 PM.
 */
public interface Explorer{
    public void explore(Maze mazeToExplore);
    public char getFootprint();
}