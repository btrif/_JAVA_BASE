package EDX_UC3Mx_Part_II.WEEK_09.Class_Diagram_II;

//  Created by Bogdan Trif on 29-05-2017 , 11:05 AM.



public class TruckGoods{
    private int mass;
    private double value;

    public TruckGoods(int m)
    {
        mass = m;
        value = m*1.5;
    }

    public int getMass()
    {
        return mass;
    }

    public double getValue()
    {
        return value;
    }

    public void setMass(int m)
    {
        mass = m;
    }

    public void setValue(double f)
    {
        value = mass*f;
    }

}
