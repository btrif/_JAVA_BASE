package EDX_UC3Mx_Part_II.WEEK_09.Refactoring;

//  Created by Bogdan Trif on 30-05-2017 , 1:23 PM.

// STARTING CODE

public class A1 {
    public static final double PI = 3.14;
    double paintNeeded(double spreadRate, int nCoats, double radius, int nCircles, double length, int nSquares){
        return nCoats * (nCircles*(radius*radius*PI) + (nSquares*(length*length))) / spreadRate;
    }
}
