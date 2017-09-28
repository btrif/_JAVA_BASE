package WEEK_09.Refactoring;

//  Created by Bogdan Trif on 30-05-2017 , 11:34 AM.

/**
Refactoring is a CHANGE made to the INTERNAL STRUCTURE of software to make it EASIER
    to UNDERSTAND and CHEAPER to MODIFY without changing its observable BEHAVIOUR. - "Fowler"
 Some Refactoring Principles
 1. Extract
 2. Rename
 3. Move
 4. Pull-up


 */

import static java.lang.Math.PI;

public class Refactoring_Techniques {

// Here we present some of the code segments we have seen in the video,
// indicating the refactoring principles we have applied.



    double paintNeeded(double spreadRate, int nCoats, double radius, int nCircles, double length, int nSquares){
        return nCoats*(nCircles*radius*radius*PI + nSquares*length*length)/spreadRate;
    }

// We extract methods area and area getting:

    double areaCircle(double radius){

        return radius*radius*PI;
    }
    double areaSquare(double length){
        return length*length;
    }

    double paintNeeded_2(double spreadRate, int nCoats, double radius, int nCircles, double length, int nSquares){
        double a = areaCircle(radius);
        double b = areaSquare(length);
        return nCoats*(nCircles*a+nSquares*b)/spreadRate;
    }

//Now, we rename variables a and b:

    double areaCircle_2(double radius){
        return radius*radius*PI;
    }
    double areaSquare_2(double length){
        return length*length;
    }
    double paintNeeded_3(double spreadRate, int nCoats, double radius, int nCircles, double length, int nSquares){
        double areaC = areaCircle(radius);
        double areaS = areaSquare(length);
        return nCoats*(nCircles*areaC+nSquares*areaS)/spreadRate;
    }

//We now move methods to the newly created classes Circle and Square

    public class Circle{
        private double radius;
        public double area(){
            return radius*radius*PI;
        }
    }
    public class Square{
        private double length;
        public double area(){
            return length*length;
        }
    }

    double paintNeeded_4(double spreadRate, int nCoats, Circle c, int nCircles, Square s, int nSquares){
        return nCoats*(nCircles*c.area()+nSquares*s.area())/spreadRate;
    }
//We also mentioned principles pull-up method and push-down method,
// for moving methods up and down the inheritance hierarchy.


}
