package OOP_Concepts.Classes_basics.IS_A_and_HAS_A_Relationship;

/**
 * Created by Bogdan Trif on 03-05-2017 , 3:05 PM.
 */

//Maruti class uses Engine object’s start() method via composition.
// We can say that Maruti class HAS-A Engine.

public class Engine {
    public void start(){
        System.out.println("Engine Started:");
    }
    public void stop(){
        System.out.println("Engine Stopped:");
    }
}
