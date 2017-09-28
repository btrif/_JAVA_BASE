package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 29-04-2017 , 8:45 AM.
 */
class MemorySensor2 extends BasicSensor {
    private int memoryPositions;
    private double memory[];

    // The Constructor
    public MemorySensor2(double value, int memoryPositions){
        super(value);
        this.memoryPositions = memoryPositions;
        memory = new double[memoryPositions];
        memory[0] = value;
    }
    // The other Methods
    public double[] getOldValues(){
        return memory;
    }

    // This method overwrites the Method from BasicSensor => Polymorphism
    public void setValue(double value){
        for(int i = memoryPositions -1 ; i >= 1;i--){
            memory[i] = memory[i-1];
        }
        memory[0] = value;
//        super.setValue(value);    // I don't understand why this needed, It works without it
    }

    // this method is NEW
    void printAllValues(){
        System.out.print("(");
        for (int i=0; i < memoryPositions-1; i++){
            System.out.print(memory[i]+ ", ");
        }
        System.out.println(memory[memoryPositions-1]+ ")");
    }
}
