package EDX_UC3Mx_Part_II.WEEK_11.LAB01_Maze_Modelling;

//  Created by Bogdan Trif on 21-06-2017 , 1:12 PM.


/**
 * Possible movements (in bidimensional space)
 * @author Raquel M. Crespo-Garcia <rcrespo@it.uc3m.es>
 *
 */
public enum Movement {

    /**
     * Each possible movement has as associated data its:
     * text representation, vertical shift, horizontal shift
     */
    LEFT('<', 0, -1), UP('^', -1, 0), RIGHT('>', 0, 1), DOWN('v', 1, 0);

    private char text;
    private int vShift;
    private int hShift;

    Movement(char s, int vShift, int hShift) {
        this.text = s;
        this.vShift = vShift;
        this.hShift = hShift;
    }

    public char text() {
        return this.text;
    }

    public int vShift() {
        return this.vShift;
    }

    public int hShift() {
        return this.hShift;
    }

    public Movement opposite(Movement mov) {
        Movement undo = null;
        switch (mov){
            case UP:
                undo = DOWN;
                break;
            case DOWN:
                undo = UP;
                break;
            case LEFT:
                undo = RIGHT;
                break;
            case RIGHT:
                undo = LEFT;
                break;
        }
        return undo;
    }
}

