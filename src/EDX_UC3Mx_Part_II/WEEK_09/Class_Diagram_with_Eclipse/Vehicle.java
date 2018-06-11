package EDX_UC3Mx_Part_II.WEEK_09.Class_Diagram_with_Eclipse;

public abstract class Vehicle implements Movable {

    private String color;
    private Engine engine;
	
    public abstract void moveForward();
    public abstract void moveBackward();
    public abstract String toString();
	
    public String getColor(){
        return color;
    }
	
    public void setColor(String color){
        this.color = color;
    }
	
    public Engine getEngine(){
        return engine;
    }
	
    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
