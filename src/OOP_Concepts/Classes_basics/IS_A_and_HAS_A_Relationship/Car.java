package OOP_Concepts.Classes_basics.IS_A_and_HAS_A_Relationship;

/**
 * Created by Bogdan Trif on 03-05-2017 , 3:04 PM.
 */

//As shown above, Car class has a couple of instance variable and few methods.
//Maruti is a specific type of Car which extends Car class means Maruti IS-A Car.

class Car {
    // Methods implementation and class/Instance members
    private String color;
    private int maxSpeed;


    public void carInfo(){
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
