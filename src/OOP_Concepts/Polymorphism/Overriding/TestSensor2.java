package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 29-04-2017 , 8:48 AM.
 */
class TestSensor2{
    public static void main(String[] args){
        MemorySensor2 a = new MemorySensor2(15.0,5);
        MemorySensor2 b = new MemorySensor2(10.0,5);
        a.setValue(234.0);
        b.setValue(235.0);
        System.out.println("Actual value of sensor a: "+a.getValue());
        System.out.println("Actual value of sensor b: "+b.getValue());
        System.out.print("Memory of sensor a: ");
        a.printAllValues();
        System.out.print("Memory of sensor b: ");
        b.printAllValues();
    }
}
