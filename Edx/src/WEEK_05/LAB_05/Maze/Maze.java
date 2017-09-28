package WEEK_05.LAB_05.Maze;

/**
 * Created by Bogdan Trif on 04-05-2017 , 2:34 PM.
 */
/**
 * Main class of the Java program.
 * This code allows you to solve a maze recursively using backtracking algorithm.
 *
 */
import java.util.Arrays;

public class Maze implements Cloneable{
    // 0 - obstacle
    // 1 - open space
    // 2 - path taken
    // 3 - goal
    private static int[][] DEFAULT_MAZE =
            {{0, 0, 1, 1, 1, 1, 1, 1},
                    {2, 0, 1, 0, 0, 0, 1, 1},
                    {1, 0, 1, 0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 1, 3, 1, 1},
                    {0, 0, 1, 0, 1, 0, 0, 1},
                    {1, 0, 1, 1, 1, 0, 0, 0},
                    {1, 1, 1, 0, 1, 1, 0, 0}};

    private int[][] maze;

    // use symbols to make reading the output easier...
    // 0 - obstacle - '#'
    // 1 - open space - '.'
    // 2 - path taken - '+'
    // 3 - goal - '*'
    private char[] mazeSymbols = {'#', '.', '+', '*' };

    public Maze(int[][] maze){
        this.maze = maze;
    }

    public Maze(){
        this(DEFAULT_MAZE);
    }

    /*Todo: change this method using only one loop
    * and Arrays.copyOf(maze[i], maze[i].length)
    */
    public Maze clone(){
        int[][] clonedMaze = new int[maze.length][maze[0].length];
        for(int i=0; i<maze.length; i++){
//            for (int j= 0; j< maze[i].length; j++){
//                clonedMaze[i][j] = maze[i][j];
             int[] j = Arrays.copyOf( maze[i] , maze[i].length );
             clonedMaze[i] = j ;
            }

        return new Maze(clonedMaze);
    }

    public boolean findPathFrom(int row, int col) {

        // when we reach the goal we have solved the problem
        if (maze[row][col] == 3) {
            return true;
        }

        // add the position to our path changing its value to '2'
        maze[row][col] = 2;

        //try all available neighbours
        //North (row, col-1), South (row, col+1), East (row+1, col) and West (row-1, col)
        // if any of these return true then we have solved the problem
        if (isAvailablePosition(row - 1, col) && findPathFrom(row - 1, col)) {
            return true;
        }
        if (isAvailablePosition(row + 1, col) && findPathFrom(row + 1, col)) {
            return true;
        }
        if (isAvailablePosition(row, col - 1) && findPathFrom(row, col - 1)) {
            return true;
        }
        if (isAvailablePosition(row, col + 1) && findPathFrom(row, col + 1)) {
            return true;
        }

        //If none of previous positions is valid or matches the goal, it is necessary to revert the
        //temporary state. This reversal or backtrack is what give name to the algorithm: backtracking
        maze[row][col] = 1;

        return false;
    }

    // A position is available if: (1) it is inside the bounds of the maze
    // (2) if it is an open space or (3) it is the goal
    private boolean isAvailablePosition(int row, int col) {
        boolean result =  row >= 0 && row < maze.length
                && col >= 0 && col < maze[row].length
                && (maze[row][col] == 1 || maze[row][col] == 3);
        return result;
    }

    //print the output using MAZE_SYMBOLS
    public void print(){
        for(int row = 0; row < maze.length; ++row) {
            for(int col = 0; col < maze[row].length; ++col) {
                System.out.print(mazeSymbols[maze[row][col]]);
            }
            System.out.println();
        }
    }


    public void print(char footprint){
        setFootprint(footprint);
        print();

    }
    private void setFootprint(char footprint){
        mazeSymbols[2] = footprint;
    }

}
