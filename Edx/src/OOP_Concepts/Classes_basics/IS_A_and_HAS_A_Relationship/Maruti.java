package OOP_Concepts.Classes_basics.IS_A_and_HAS_A_Relationship;

/**
 * Created by Bogdan Trif on 03-05-2017 , 3:05 PM.
 */
class Maruti extends Car{
    //Maruti extends Car and thus inherits all methods from Car (except final and static)
    //Maruti can also define all its specific functionality
    public void MarutiStartDemo(){
        Engine MarutiEngine = new Engine();
        MarutiEngine.start();
    }
}