package EDX_UC3Mx_Part_II.WEEK_11.LAB01_Maze_Modelling;

//  Created by Bogdan Trif on 21-06-2017 , 1:12 PM.


import java.util.Vector;

/**
 * Class Maze represents a bidimensional maze
 * to traverse and find a path through
 * @author Raquel M. Crespo-Garcia <rcrespo@it.uc3m.es>
 */
public class Maze {

    private MazeStatus[][] maze;

    /**
     * Creates an square Maze of given size
     */
    public Maze(int size) {
        this(size, size);
    }

    /**
     * Creates a bidimensional Maze of given height and size,
     * with all positions initially open
     */
    public Maze(int width, int height) {
        maze = new MazeStatus[height][width];
        for (int row=0; row<height; row++) {
            for (int col=0; col<width; col++) {
                maze[row][col] = MazeStatus.OPEN;
            }
        }
    }

    /**
     * Initializes a Maze from the given textual representation
     */
    public Maze(String sMaze) {
        this.maze = stringToMaze(sMaze);
    }


    /**
     * Returns the MazeStatus value corresponding to the given cell,
     * specified by its row and column
     */
    public MazeStatus getPosStatus(int row, int col) {
        return maze[row][col];
    }

    /**
     * Sets the cell corresponding to the specified row and column to
     * the given status value
     */
    public void setPosStatus(int row, int col, MazeStatus newStatus) {
        maze[row][col] = newStatus;
    }


    /**
     * Creates and returns an String with
     * the text-based representation of the given Maze
     */
    public String toString() {
        String s = null;
        if (maze != null && maze[0] != null) {
            s = "";
            for (int r=0; r < maze.length; r++) {
                for (int c=0; c < maze[0].length; c++) {
                    s=s.concat(String.valueOf(maze[r][c].text()));
                }
                s=s.concat(System.lineSeparator());
            }
        }
        return s;
    }

    /**
     * Transforms a text-based Maze into a bidimensional array
     * of positions with the corresponding status.
     * It creates the array maze and assign to each of its cells
     * the corresponding status value based on the given text representation.
     */
    private MazeStatus[][] stringToMaze(String sMaze) {
        MazeStatus[][] maze = null;

        if (sMaze != null) {
            String sMazeRows[] = sMaze.split("\n");
            char cMazeCols[];

            maze = new MazeStatus[sMazeRows.length][];

            for (int row =0; row<sMazeRows.length; row++) {
                if (sMazeRows[row] == null) {
                    maze[row] = null;
                } else {
                    maze[row] = new MazeStatus[sMazeRows[row].length()];
                    cMazeCols = sMazeRows[row].toCharArray();

                    for (int col =0; col<cMazeCols.length; col++) {
                        if (cMazeCols[col] == MazeStatus.GOAL.text() ) {
                            maze[row][col] = MazeStatus.GOAL;
                        } else if (cMazeCols[col] == MazeStatus.OPEN.text() ) {
                            maze[row][col] = MazeStatus.OPEN;
                        } else if (cMazeCols[col] == MazeStatus.OBSTACLE.text() ) {
                            maze[row][col] = MazeStatus.OBSTACLE;
                        } else if (cMazeCols[col] == MazeStatus.VISITED.text() ) {
                            maze[row][col] = MazeStatus.VISITED;
                        }
                    }
                }

            }
        }

        return maze;
    }


    /**
     * Calculates the destination position in the Maze
     * given an starting position (row, col) and  a Movement (mov)
     *
     * @returns the coordinates of the next position, if its is a valid position.
     * Returns null if the destination position is outside the limits of the array.
     */
    public int[] getNeighbourCoords(int row, int col, Movement mov) {
        int[] currentCoords = new int[] { row, col };

        int[] newCoords = new int[] {
                currentCoords[0] + mov.vShift(),
                currentCoords[1] + mov.hShift()
        };
        if (newCoords[0] < 0 || newCoords[0] >= maze.length ||
                newCoords[1] < 0 || newCoords[1] >= maze[0].length)
        {
            // invalid position
            newCoords = null;
        }
        return newCoords;
    }


    /**
     * Changes the state of the maze positions following the given path.
     * If the initial status of the position to visit is OPEN or VISITED
     * (can step into the position), change it to VISITED.
     * If the initial status of the position to visit is GOAL, does not
     * change it so that the goal keeps displaying in the maze.
     * If the initial status of the position to visit is OBSTACLE or
     * the position is outside the limits of the Maze, it is an invalid move,
     * stop and finish.
     * Empties the received path as it traverses it.
     *
     */
    public void followPath(Path path) {

        if (path != null) {

            int[] coords = path.extractFirst();

            while (coords != null) {
                switch (this.getPosStatus(coords[0], coords[1])) {
                    case OPEN:
                    case VISITED:
                        this.setPosStatus(coords[0], coords[1], MazeStatus.VISITED);
                        coords  = path.extractFirst();
                        break;
                    case OBSTACLE:
                        // invalid move: stop here
                        return;
                    case GOAL:
                        // does not change status to keep showing GOAL
                        coords  = path.extractFirst();
                        break;
                }
            }
        }

    }

}

