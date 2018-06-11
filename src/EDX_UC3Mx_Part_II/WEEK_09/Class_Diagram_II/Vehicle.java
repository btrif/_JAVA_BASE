package EDX_UC3Mx_Part_II.WEEK_09.Class_Diagram_II;

//  Created by Bogdan Trif on 29-05-2017 , 11:04 AM.



public abstract class Vehicle {

    private int wheels;
    private String colour;
    private int mass;
    private int velocity;
    private boolean key = false;

    public Vehicle(int w, String c, int m, int v)
    {
        wheels = w;
        colour = c;
        mass = m;
        velocity = v;
    }

    public abstract void accelerate();
    public abstract void brk();
    public void stopEngine(){
        key = false;
        System.out.println("The engine has been stopped.");
    }
    public void startEngine(){
        key = true;
        System.out.println("The engine has been started.");
    }

    public int getWheels()
    {
        return wheels;
    }
    public String getColour()
    {
        return colour;
    }
    public int getMass()
    {
        return mass;
    }
    public int getVelocity()
    {
        return velocity;
    }

    public void setColour(String c)
    {
        colour = c;
    }
}

