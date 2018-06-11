package OOP_Concepts.Classes_basics.IS_A_and_HAS_A_Relationship;

/**
 * Created by Bogdan Trif on 03-05-2017 , 3:06 PM.
 */

//RelationsDemo class is making object of Maruti class and initialized it.
//Though Maruti class does not have setColor(), setMaxSpeed() and carInfo() methods
//still we can use it due to IS-A relationship (via Inheritance) of Maruti class with Car class.

public class RelationsDemo {
    public static void main(String[] args) {
        Maruti myMaruti = new Maruti();
        myMaruti.setColor("RED");
        myMaruti.setMaxSpeed(180);
        myMaruti.carInfo();
        myMaruti.MarutiStartDemo();
    }
}

