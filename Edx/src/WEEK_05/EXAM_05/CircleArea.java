package WEEK_05.EXAM_05;

/**
 * Created by Bogdan Trif on 08-05-2017 , 11:57 AM.
 */
public class CircleArea {
    public double radius ;


    // Constructor
    public double GetArea (){
        double first = Math.PI ;
        double second= Math.abs(radius) ;
        double third = Math.pow(second,2);
        return first*third;
         }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public static void main(String[] args) {
        CircleArea CA = new CircleArea() ;
        CA.setRadius(-10);
        System.out.println(CA.getRadius());
        System.out.println(CA.GetArea());


    }


}
