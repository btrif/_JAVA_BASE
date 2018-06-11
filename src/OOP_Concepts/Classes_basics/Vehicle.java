package OOP_Concepts.Classes_basics;

/**
 * Created by Bogdan Trif on 27-04-2017 , 8:37 PM.
 */
public class Vehicle {
    private int speed; // vehicle speed in kilometers per hour

    // If no value is specified in the Constructor (at instantiation ) => speed is considered =0
    public Vehicle() {
        speed = 0;
    }

    // If a value is specified in the Constructor (at instantiation ) => speed is taken from here
    public Vehicle(int initialSpeed) {
        speed =  initialSpeed ;
    }

    // Accelerate method :
    public void accelerate() {
        speed += 10;
        if(speed>150) {
            speed = 150;
        }
    }

    // Brake method
    public void brake() {
        speed -= 10 ;
        if(speed< 0 ) {
            speed = 0 ;
        }
    }

    // Main execution of the class Vehicle:
    public static void main(String[] args) {
        System.out.println("-------- Car 1 -----------");
        // Here we instantiate the Vehicle called "a" of type Vehicle, the type is the first word Vehicle,
        // and we instantiate it with the value = 30
        Vehicle a = new Vehicle(30 );
        System.out.println("Initial speed :" +  a.speed  );
        for( int i =0 ; i<=10 ; i++) {
            a.accelerate();
        }

        System.out.println("Final speed :" +  a.speed  );

    }

}
