package WEEK_09.Class_Diagram_II;

//  Created by Bogdan Trif on 29-05-2017 , 11:05 AM.



public class Truck extends Vehicle{
    private TruckGoods tG;

    public Truck(String c)
    {
        super(12,c,5000,80);
        tG = new TruckGoods(1000);
    }

    public void accelerate()
    {
        System.out.println("The truck is accelerating.");
    }
    public void brk()
    {
        System.out.println("The truck is braking.");
    }

    public void setTruckGoodsMass(int m)
    {
        tG.setMass(m);
    }
    public void setTruckGoodsValue(int f)
    {
        tG.setValue(f);
    }
    public int getTruckGoodsMass()
    {
        return tG.getMass();
    }
    public double getTruckGoodsValue()
    {
        return tG.getValue();
    }
}
