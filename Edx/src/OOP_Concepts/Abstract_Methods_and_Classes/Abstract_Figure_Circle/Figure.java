package OOP_Concepts.Abstract_Methods_and_Classes.Abstract_Figure_Circle;

/**
 * Created by Bogdan Trif on 10-05-2017 , 2:45 PM.
 */
public abstract class Figure {

    public String name;

    public Figure (String n){

        name=n;

    }

    public String toString(){

        return name;

    }


    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}


