package RECURSION_examples;

/**
 * Created by Bogdan Trif on 26-04-2017 , 8:51 PM.
 */
public class Maze_01 {
    // 0 - obstacle
    // 1 - open space
    // 2 - path taken
    // 3 - goal
    private static int[][] maze =
                    {{0, 0, 1, 1, 1, 1, 1, 1},
                    {2, 0, 1, 0, 0, 0, 1, 1},
                    {1, 0, 1, 0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 1, 3, 1, 1},
                    {0, 0, 1, 0, 1, 0, 0, 1},
                    {1, 0, 1, 1, 1, 0, 0, 0},
                    {1, 1, 1, 0, 1, 1, 0, 0}};
    // use symbols to make reading the output easier...
    // 0 - obstacle - '#'
    // 1 - open space - '.'
    // 2 - path taken - '+'
    // 3 - goal - '*'
    private static final char[] MAZE_SYMBOLS = {'#', '.', '+', '*' };


    //Try to findPathFrom initial position if the maze is solved print the solution
    public static void main(String[] args) {
        print();
    }

    //print the output using MAZE_SYMBOLS
    private static void print(){
        for(int row = 0; row < maze.length; ++row) {
            for(int col = 0; col < maze[row].length; ++col) {
                System.out.print(MAZE_SYMBOLS[maze[row][col]]);
            }
            System.out.println();
        }
    }
}
