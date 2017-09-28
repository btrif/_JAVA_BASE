package OOP_Concepts.Abstract_Methods_and_Classes.Interfaces;


/**
 * Created by Bogdan Trif on 02-05-2017 , 4:31 PM.
 */

//We want to implement the ToyCar class, which represents a Toy that is Movable and Playable
//        (and is not abstract).

    // !!! VERY IMPORTANT !! in order to ToyCar class to work it must override (USE ALL )
//    of the abstract methods previously used in all interfaces that inherites   !!!!

public class ToyCar extends Toy implements Movable{

    public void stop(){
        System.out.println("This is how we stop");
    }
    public void play(){
        System.out.println("This is how we play");
    }
    public void turn(){
        System.out.println("This is how we turn");
    }
    public void moveForward(){
        System.out.println("This is how we move Forward");
    }

    public static void main(String[] args){
        ToyCar toy = new ToyCar();
        toy.play();

    }
}