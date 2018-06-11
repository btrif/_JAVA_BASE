package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 28-04-2017 , 6:51 PM.
 */
public class TestSensor {

    // Execution of the Main Loop
    public static void main(String[] args){
        BasicSensor a = new BasicSensor(0.0);
        BasicSensor b = new BasicSensor(10.0);

        System.out.print("("+a.getValue()+", "+b.getValue()+")");
        a.clearValue();
        b.clearValue();
        a.setValue(100.0);
        System.out.println(" ("+a.getValue()+", "+b.getValue()+")");
    }
}

