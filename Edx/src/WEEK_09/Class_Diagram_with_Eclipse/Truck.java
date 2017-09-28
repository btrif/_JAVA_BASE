package WEEK_09.Class_Diagram_with_Eclipse;

public class Truck extends Vehicle{

    private int load;
	
    public void load(int n){
        load += n;
    }
	
    public void exit(int n){
        load -= n;
    }
	
    public void moveForward(){
   	    // Code goes here
    }
	
    public void moveBackward(){
        // Code goes here
    }

    public String toString() {
        return "I am a Truck with " + load + " kilos of load";
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
