package OOP_Concepts.Inheritance;

/**
 * Created by Bogdan Trif on 28-04-2017 , 6:44 PM.
 */
public class Class_inheritance_example_01 {
/** In order to avoi the message Error:non-static variable this cannot be referenced from a static context
  we need to transform the class A into static */

    public static class A {
//    public class A {
        // Constructor
        public A() {System.out.print("A, ");}
    }

    // Class B is inherited from class A
    public static class B extends A {
        public B() { super() ; System.out.print("B, ");}
    }

    // Class C is inherited from class B
    public static class C extends A {
        public C() { super() ; System.out.print("C.");}
    }

    public static void main(String[] args){
        A a = new A() ;
        B b = new B() ;
        C c = new C() ;

/** As we see it prints A, A, B, A, C. because as the A class is inherited by the B & C classes then
 automatically what the class A does the classes B & C will repeat ! this happens because we did not apply
 Polyporphism with Method overriding                     */


    }
}
