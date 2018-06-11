package EDX_UC3Mx_Part_II.WEEK_11.LAB01_Maze_Modelling;

//  Created by Bogdan Trif on 21-06-2017 , 1:13 PM.


/**
 * Class PathStep represents each step in a Path through a Maze,
 * with links to the previous and following steps.
 *
 * @author Raquel M. Crespo-Garcia <rcrespo@it.uc3m.es>
 */
public class PathStep {

    private int row;
    private int col;

    private PathStep next, prev;

    public PathStep(int row, int col) {
        this(row, col, null, null);
    }

    public PathStep(int row, int col, PathStep next, PathStep prev) {
        this.row = row;
        this.col = col;
        this.next = next;
        this.prev = prev;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public PathStep getNext() { return next; }
    public PathStep getPrev() { return prev; }

    public void setRow(int row) { this.row = row; }
    public void setCol(int col) { this.col = col; }
    public void setNext(PathStep next) { this.next = next; }
    public void setPrev(PathStep prev) { this.prev = prev; }

    public String toString() {
        return "(" + this.row + ", " + this.col + ")";
    }

}

