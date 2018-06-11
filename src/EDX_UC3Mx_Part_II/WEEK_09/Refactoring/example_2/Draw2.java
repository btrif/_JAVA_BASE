package EDX_UC3Mx_Part_II.WEEK_09.Refactoring.example_2;

//  Created by Bogdan Trif on 30-05-2017 , 1:39 PM.

// ENDING CODE

public class Draw2 {
    double paintNeeded(double spreadRate, int nCoats, Circle circle, int nCircles, Square square, int nSquares){
        double areaC = circle.area();
        double areaS = square.area();
        return nCoats * (nCircles*areaC + (nSquares*areaS)) / spreadRate;
    }

}
