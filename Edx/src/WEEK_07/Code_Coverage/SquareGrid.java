package WEEK_07.Code_Coverage;

/**
 * Created by Bogdan Trif on 23-05-2017 , 12:45 PM.
 */
public class SquareGrid {

    private int size;

    public SquareGrid(int n){
        size = n;
    }

    private boolean inLimits(int x){
        return x >= 0 && x <size;
    }

    public String displayZone(int x, int y){
        StringBuffer zone =new StringBuffer();

        if (!inLimits(x)){
            System.out.println("Illegal value: " + x);
        }
        if (!inLimits(y)){
            System.out.println("Illegal value: " + y);
        }
        if (inLimits(x) && inLimits(y)){
            System.out.print("The point <" + x + "," + y +"> is in the zone ");
            if (y >= size/2){
                System.out.print("N");
                zone.append("N");
            } else {
                System.out.print("S");
                zone.append("S");
            }
            if (x >= size/2){
                System.out.println("E");
                zone.append("E");
            } else {
                System.out.println("W");
                zone.append("W");
            }
        }

        return zone.toString();
    }

    public static void main(String[] args) {
        SquareGrid sq = new SquareGrid(4);
        sq.displayZone(3, 3);
        sq.displayZone(4, 4);
        sq.displayZone(0, 0);
    }

}
