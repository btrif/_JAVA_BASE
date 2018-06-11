package OOP_Concepts.Polymorphism.Overloading;

/**
 * Created by Bogdan Trif on 29-04-2017 , 3:12 PM.
 */

//Overloading Constructors (non graded activity)
//Defining a method in a class with the same name, return type but different list of parameters
//than another one in the same class is called overloading.

//Now, we want to represent vectors of 3 dimensional Cartesian coordinates.
//We have defined this class:

public class MyVector3D {

    private double[] v;

    // FIRST Constructor
    MyVector3D(double x, double y, double z){
        v = new double[3];
        v[0] = x;
        v[1] = y;
        v[2] = z;
    }

    // The following constructors are Overloading Constructors because they have a different list of
    // parameters, but have the same name and return type.


    // SECOND Constructor
    MyVector3D(double x, double y){
        this(x,y,0);
    }

    // THIRD Constructor
    MyVector3D(double x){
        this(x,0,0);
    }

    // FOURTH Constructor
    MyVector3D(){
        this(0,0,0);
    }

    void print(){
        System.out.println("("+v[0]+", "+v[1]+", "+v[2]+")");
    }

    public static void main(String[] args){

        MyVector3D v1 = new MyVector3D(1,2,3);
        MyVector3D v2 = new MyVector3D(1,2);
        MyVector3D v3 = new MyVector3D(1);
        MyVector3D v4 = new MyVector3D();
        v1.print();
        v2.print();
        v3.print();
        v4.print();
    }

}
