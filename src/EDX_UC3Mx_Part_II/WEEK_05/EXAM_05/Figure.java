package EDX_UC3Mx_Part_II.WEEK_05.EXAM_05;

/**
 * Created by Bogdan Trif on 05-05-2017 , 12:32 PM.
 */
public abstract class Figure {
    public String name;

    // Constructor
    public Figure (String n){
        name=n;
    }

    // Method
    public String toString(){
        return name;
    }

    // Abstract Methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}
