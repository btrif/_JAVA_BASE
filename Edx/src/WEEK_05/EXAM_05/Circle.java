package WEEK_05.EXAM_05;

/**
 * Created by Bogdan Trif on 05-05-2017 , 12:32 PM.
 */
public class Circle extends Figure{
    private double radius;
    private final double PI=3.1415;

    public Circle (double r, String name){
        super(name);
        radius=r;
    }

    public String toString(){
        return "I'm a circle of radius "+radius;
    }

    public double calculateArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }


/**  VERY IMPORTANT !!! If We do not OVERRIDE all the methods inherited from the abstract class
    then we'll get an error !  We MUST INHERIT all abstract methods from the ABSTRACT CLASS !!!! */

    public double calculatePerimeter(){
        return 2*PI*radius;
    }

    public static void main(String[] args){
        Circle ccc = new Circle(10, "R") ;
        System.out.println(ccc);
        ccc.toString();


    }
}
