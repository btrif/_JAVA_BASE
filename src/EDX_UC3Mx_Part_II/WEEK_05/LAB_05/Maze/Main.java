package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Maze;

/**
 * Created by Bogdan Trif on 04-05-2017 , 2:34 PM.
 */
public class Main {
    public static void main(String[] args) {
        Maze mazeToExplore = new Maze();
        Maze aux = mazeToExplore.clone();
        if (aux.findPathFrom(1, 0)) {
            System.out.println("maze solved");
            aux.print();
            System.out.println("original maze");
            mazeToExplore.print();

        } else {
            System.out.println("no solution found");
        }
    }
}
