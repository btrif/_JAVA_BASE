package WEEK_09.Class_Diagram_with_Eclipse;

public class Car extends Vehicle{

    private int nPass;
	
    public void enter(int n){
        nPass += n;
    }

    public void exit(int n){
        nPass -= n;
    }
	
    public void moveForward(){
        // Code goes here
    }
	
    public void moveBackward(){
        // Code goes here
    }

    public String toString() {
        return "I am a Car with " + nPass + " passengers";
    }

    public int getnPass() {
        return nPass;
    }

    public void setnPass(int nPass) {
        this.nPass = nPass;
    }
}