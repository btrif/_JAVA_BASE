package OOP_Concepts.Casting_Upcasting_Downcasting;

/**
 * Created by Bogdan Trif on 28-04-2017 , 9:54 PM.
 */
class Learner extends Person{
    boolean enrolled;

    // Constructor
    Learner(String name){
        super(name);
        enrolled = false;
    }

    // Method
    void enroll(){
        enrolled = true;
    }



}
