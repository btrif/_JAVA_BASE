package RECURSION_examples;

/**
 * Created by Bogdan Trif on 27-04-2017 , 9:58 AM.
 */
public class Maze_Recursion_Backtracking {
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
        System.out.println("Initial Maze :") ;
        printMaze();
        System.out.println("\nSolved Maze :") ;

        if (findPathFrom(1, 0)) {
            printMaze();
        } else {
            System.out.println("no solution found");
        }
    }

    private static boolean findPathFrom(int row, int col) {

        // when we reach the goal we have solved the problem
        if (maze[row][col] == 3) {
            return true;
        }

        // add the position to our path changing its value to '2'
        maze[row][col] = 2;

        //try all available neighbours
        //North (row-1, col), South (row+1, col), East (row, col+1) and West (row, col-1)
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
        //temporary state. This reversal or backtrack is what gives name to the algorithm: backtracking
        maze[row][col] = 1;

        return false;
    }

    // A position is available if: (1) it is inside the bounds of the maze
    // (2) if it is an open space or (3) it is the goal
    private static boolean isAvailablePosition(int row, int col) {
        boolean result =  row >= 0 && row < maze.length
                && col >= 0 && col < maze[row].length
                && (maze[row][col] == 1 || maze[row][col] == 3);
        return result;
    }

    //print the output using MAZE_SYMBOLS
    private static void printMaze(){
        for(int row = 0; row < maze.length; ++row) {
            for(int col = 0; col < maze[row].length; ++col) {
                System.out.print(MAZE_SYMBOLS[maze[row][col]]);
            }
            System.out.println();
        }
    }
}
