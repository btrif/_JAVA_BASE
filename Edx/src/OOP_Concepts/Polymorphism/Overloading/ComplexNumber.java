package OOP_Concepts.Polymorphism.Overloading;

/**
 * Created by Bogdan Trif on 29-04-2017 , 3:03 PM.
 */
//Java has a very elegant way to use overloading in constructors.
//The overloading of constructors is useful when there are attributes that have a value by default.
//For example, if we want to represent complex numbers we can define a class like this:

public class ComplexNumber{
    private double real;
    private double imag;

    // First Constructor :
    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
//    If we want that when we call the constructor with only one parameter,
//    the imaginary part will be set to zero, we will overload the constructor.
//
//    One possible way to deal with this could be adding this constructor to the class:

//    It could seem that we cannot call the other constructor (because constructors have no name). Or can we? YES !
//
//    In fact, we can use the method this() within the class to "name" the constructor.
//    Thus, the previous definition will be changed like this:

    // Second Constructor :
    public ComplexNumber(double real){
        this(real, 0) ;

//        But, why to do that? The difference, in this case, is only one line.
//        Leaving the checking of the parameters to the most complex constructor will save us time
//        and will make our code less error-prone.
    }


    public double getReal(){
        return real;
    }

    public double getImag(){
        return imag;
    }

    public void print(){
        System.out.println(real+ " + " + imag + "i");
    }


    public static void main(String[] args){
        ComplexNumber nr = new ComplexNumber(3,7);
        System.out.print("First complex number is : ");
        nr.print();
        System.out.println("Real part : " + nr.getReal() + "\nImag part : " + nr.getImag() );
        System.out.print("\nSecond complex number is : ");
        ComplexNumber nr2 = new ComplexNumber(8) ;
        nr2.print();
        System.out.println("Real part : " + nr2.getReal() + "\nImag part : " + nr2.getImag() );


    }
}
