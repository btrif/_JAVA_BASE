package OOP_Concepts.Abstract_Methods_and_Classes.Abstract_Figure_Circle;

import static java.lang.Math.*;

/**
 * Created by Bogdan Trif on 10-05-2017 , 2:47 PM.
 */
public class Test {

    public static void main(String[] args){

        Circle circle = new Circle (3, "myCircle");

        System.out.println(circle.toString());

        System.out.println("My perimeter is: "+ circle.calculatePerimeter());

        System.out.println("My area is: " + circle.calculateArea());



    }

}
