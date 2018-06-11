package OOP_Concepts.Polymorphism.Binding;

/**
 * Created by Bogdan Trif on 01-05-2017 , 2:57 PM.
 */

// BINDING
//            ==== Overloading
//            – Resolved  at  compile time
//            – Static binding
//            ==== Overriding
//            – Resolved at run time
//            – Dynamic binding



//Given the following classes that we saw earlier in this week:

class Employee {
    public void speak() {
        System.out.println("No statements allowed");
    }
}

class MarketingEmployee extends Employee {
    public void speak() {
        System.out.println("You should buy our products!");
    }
}

class PublicRelationsEmployee extends Employee {
    public void speak() {
        System.out.println("Our company is the best!");
    }

    public static void main(String[] args){
//        What do these sentences print?
        Employee e = new Employee();
        e.speak();
        Employee f = new MarketingEmployee();
        f.speak();
        Employee g = new PublicRelationsEmployee();
        g.speak();

    }

}

//Explanation
//A reference of a given class can store objects of that class itself or any class extending it.
//When a class overrides a method of its parent class (i.e. implement a method with the same name,
// parameters and return type),
//on running time, Java will execute the code of the method belonging to the class that was actually instantiated
//to create the object (i.e. the class which constructor was called in order to create the object).
//The class type used for the reference declaration does not matter for the binding.