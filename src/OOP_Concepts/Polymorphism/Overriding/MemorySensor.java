package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 28-04-2017 , 7:03 PM.
 */

class MemorySensor extends BasicSensor {
    private int memoryPositions;
    private double memory[];

    // The Constructor
//    public Polymorphism.MemorySensor(double value, int memoryPositions){
    public MemorySensor(double value, int memoryPositions){
        super(value);
//        this.value = value ;
        this.memoryPositions = memoryPositions;
        memory = new double[memoryPositions];
        memory[0] = value;
    }
    // The other Methods
    public double[] getOldValues(){
        return memory;
    }

    public static void main(String[] args){
        MemorySensor A = new MemorySensor(30, 20) ;
        System.out.print(  A.getValue() );
        A.setValue(65);
        System.out.print( "\n A value :  " + A.getValue() + "    Memory length : " + A.memory.length );



    }

}
