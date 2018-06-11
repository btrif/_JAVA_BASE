package RECURSION_examples;

/**
 * Created by Bogdan Trif on 26-04-2017 , 9:21 PM.
 */
public class Maze_02 {
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

    //Testing available positions
    public static void main(String[] args) {
        System.out.println("Checking available positions...");
        System.out.println("Is (0,0) available?: " + isAvailablePosition(0,0));
        System.out.println("Is (0,1) available?: " + isAvailablePosition(0,1));
        System.out.println("Is (0,2) available?: " + isAvailablePosition(0,2));
        System.out.println("Is (10,0) available?: " + isAvailablePosition(10,0));
        System.out.println("Is (1,0) available?: " + isAvailablePosition(1,0));
        System.out.println("Is (4,5) available?: " + isAvailablePosition(4,5));
    }



    // A position is available if: (1) it is inside the bounds of the maze
    // (2) if it is an open space or (3) it is the goal
    private static boolean isAvailablePosition(int row, int col) {
        boolean result =  row >= 0 && row < maze.length &&
                col >= 0 && col < maze[row].length &&
                (maze[row][col] == 1 || maze[row][col] == 3);
        return result;
    }



}
