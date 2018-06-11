package OOP_Concepts.Abstract_Methods_and_Classes;

/**
 * Created by Bogdan Trif on 02-05-2017 , 2:50 PM.
 */
/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        Car c = new Car("blue",true);
        Motorbike m = new Motorbike("black",false);
        m.setLights(true);
        Truck t = new Truck("white",false);
        c.printDescription();
        m.printDescription();
        t.trailers = 3 ;
        t.printDescription();
    }
}

