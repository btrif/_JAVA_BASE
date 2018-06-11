package EDX_UC3Mx_Part_II.WEEK_11.LAB01_Maze_Modelling;

//  Created by Bogdan Trif on 21-06-2017 , 1:13 PM.


/**
 * Class MazePath represents a path through a maze
 * composed of a doubly-linked list of MazeSteps (positions)
 *
 * @author Raquel M. Crespo-Garcia <rcrespo@it.uc3m.es>
 */
public class Path {

    /** First position in the path */
    private PathStep first;

    /** Last position in the path */
    private PathStep last;

    /**
     * Initializes empty path
     */
    public Path() {
        this.first = null;
        this.last = null;
    }


    /**
     * Insert the given coordinates as a new step in the first position of the path
     */
    public void insertFirst(int row, int col) {
        PathStep n = new PathStep(row, col);
        if (this.first == null) {  // empty list
            this.first = n;
            this.last = n;
        } else {  // non-empty list
            n.setNext(first);
            first.setPrev(n);
            first = n;
        }
    }

    /**
     * Insert the given coordinates as a new step in the last position of the path
     */
    public void insertLast(int row, int col) {
        PathStep n = new PathStep(row, col);
        if (this.last == null) {  // empty list
            this.first = n;
            this.last = n;
        } else {  // non-empty list
            last.setNext(n);
            n.setPrev(last);
            last = n;
        }
    }

    /**
     * Returns the coordinates of the first step in the path and removes it from the path.
     * If the Path is empty, returns null.
     */
    public int[] extractFirst() {
        int[] coords = null;
        if (first != null) {
            coords = new int[] { first.getRow(), first.getCol() };
            first = first.getNext();
            if (first != null) {
                first.setPrev(null);
            } else {
                last = null;
            }
        }
        return coords;
    }

    /**
     * Returns the coordinates of the last step in the path and removes it from the path.
     * If the Path is empty, returns null.
     */
    public int[] extractLast() {
        int[] coords = null;
        if (last != null) {
            coords = new int[] { last.getRow(), last.getCol() };
            last = last.getPrev();
            if (last != null) {
                last.setNext(null);
            } else {
                first = null;
            }
        }
        return coords;
    }

    /**
     * Returns a String based representation of the Path.
     * If the Path is empty, returns an empty String ("")
     * If the Path is not empty, returns an String with the format:
     * (row1, col1), (row2, col2), ..., (rowN, colN)
     */
    public String toString() {

        String sPath = "";
        PathStep s = null;

        if (first != null) {
            sPath = "(" + first.getRow() + ", " + first.getCol() + ")";
            s = first.getNext();
        }
        while (s != null) {
            sPath = sPath + ", " + "(" + s.getRow() + ", " + s.getCol() + ")";
            s = s.getNext();
        }

        return sPath;
    }


}

