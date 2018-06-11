package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters;


import EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Maze.Maze;

/**
 * Created by Bogdan Trif on 04-05-2017 , 5:05 PM.
 */
public interface Explorer{
    public void explore(Maze mazeToExplore);
    public char getFootprint();
}