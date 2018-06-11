package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 01-05-2017 , 2:35 PM.
 */
public class Employee {
    public void speak() {
        System.out.println("No statements allowed");
    }
}

class MarketingEmployee extends Employee {
    // this method Overrides the same method from it's superclass Employee !!!!!!!!
    public void speak() {
        System.out.println("You should buy our products!");
    }
}

class PublicRelationsEmployee extends Employee {
    // this method Overrides the same method from it's superclass Employee  !!!!!!!!!!!

    // Constructor here inherits the method speak() before the speak method is override
    public PublicRelationsEmployee() {
        super.speak();
    }
    public void speak() {
        System.out.println("Our company is the best!");
    }

    public  static void main(String[] args ){
        Employee e = new Employee();
        e.speak();
        MarketingEmployee me = new MarketingEmployee();
        me.speak();
        System.out.println();
        PublicRelationsEmployee pre = new PublicRelationsEmployee();
        pre.speak();


    }
}

//In Java, a child class can override a method of its parent class
//(i.e. implement a method with the same name, parameters and return type).
//On running time, Java will execute the code of the method belonging to the class that
//was actually instantiated to create the object
//(i.e. the class which constructor was called in order to create the object).