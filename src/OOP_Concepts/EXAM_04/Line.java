package OOP_Concepts.EXAM_04;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:58 AM.
 */
public class Line {
    private Point p1;
    private Point p2;

    public Line (Point firstPoint, Point secondPoint) {
        p1 = firstPoint;
        p2 = secondPoint;
    }

    public double length() {
//        return Math.sqrt( Math.pow(p2.getX()-p1.getX(),2)  + Math.pow(p2.getY()-p1.getY(),2));
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2) + Math.pow(p2.getY()-p1.getY(),2));

    }

    public static void main(String[] args) {
        Point P1 = new Point( 4, 0 );
        System.out.println("The first point P1 is :  " + P1.getX() +" " + P1.getY());
        Point P2 = new Point( 0, 3 );
        System.out.println("The second point P2 is :  " + P2.getX() +" " + P2.getY());
        Line line = new Line(P1, P2) ;
        System.out.println("Distance between them is : " + line.length() );


    }

}
