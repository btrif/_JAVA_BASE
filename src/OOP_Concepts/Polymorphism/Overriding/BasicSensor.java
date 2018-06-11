package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 28-04-2017 , 6:51 PM.
 */
public class BasicSensor {
    private double value;
//    public double value;

    // CONSTRUCTOR : Initialization --> Instantiation
    public BasicSensor(double value){
        this.value = value;
    }

    // Getters and Setters :
    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public void clearValue(){
        this.value = 0;
    }

}
