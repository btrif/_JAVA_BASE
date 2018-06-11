package EDX_UC3Mx_Part_II.WEEK_11.LAB01_Maze_Modelling;

//  Created by Bogdan Trif on 21-06-2017 , 1:12 PM.


/**
 * Possible states for each position of a maze
 *
 * @author Raquel M. Crespo-Garcia <rcrespo@it.uc3m.es>
 *
 */
public enum MazeStatus {

    OPEN(' '), OBSTACLE('#'), GOAL('x'), VISITED('.');

    private char text;

    MazeStatus(char s) {
        this.text = s;
    }

    public char text() {
        return this.text;
    }

}

