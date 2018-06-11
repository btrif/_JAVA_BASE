package EDX_UC3Mx_Part_II.WEEK_09.Class_Diagram_II;

//  Created by Bogdan Trif on 29-05-2017 , 11:05 AM.



public class Motorbike extends Vehicle{

    public Motorbike(String c)
    {
        super(2,c,600,150);
    }

    public void accelerate()
    {
        System.out.println("The motorbike is accelerating.");
    }
    public void brk()
    {
        System.out.println("The motorbike is braking.");
    }
}
