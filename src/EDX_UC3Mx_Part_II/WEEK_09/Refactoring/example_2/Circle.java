package EDX_UC3Mx_Part_II.WEEK_09.Refactoring.example_2;

//  Created by Bogdan Trif on 30-05-2017 , 1:40 PM.


public class Circle extends Figure{
    public static final double PI = 3.14;

    private double radius ;

    @Override
    public double area() {
        return radius*radius* PI;
    }

}
