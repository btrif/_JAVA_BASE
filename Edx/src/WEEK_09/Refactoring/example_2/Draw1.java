package WEEK_09.Refactoring.example_2;

//  Created by Bogdan Trif on 30-05-2017 , 1:37 PM.

// STARTING CODE

public class Draw1 {
    public static final double PI = 3.14;
    double paintNeeded(double spreadRate, int nCoats, double radius, int nCircles, double length, int nSquares){
        double areaC = areaCircle(radius);
        double areaS = areaSquare(length);
        return nCoats * (nCircles*areaC + (nSquares*areaS)) / spreadRate;
    }

    public double areaSquare(double length) {
        return length*length;
    }

    public double areaCircle(double radius) {
        return radius*radius*PI;
    }
}
