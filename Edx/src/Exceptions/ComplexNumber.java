package Exceptions;

/**
 * Created by Bogdan Trif on 01-05-2017 , 10:43 AM.
 */
class ComplexNumber{
    private double real;
    private double imag;

    // Constructor
    public ComplexNumber(double real, double imag) throws IllegalArgumentException{
        if (real*real + imag*imag > 1){
            throw new IllegalArgumentException(real + " + " + imag + "i is outside the Unit Circle") ;
        }
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return real ;
    }

    public double getImag(){
        return imag ;
    }

    public ComplexNumber(double real) throws IllegalArgumentException{
        this(real,0);
    }

    public static void main(String[] args){
        ComplexNumber c = new ComplexNumber(2.2, 0.5) ;
        System.out.println("Real = " + c.getReal() + "  Imag = " + c.getImag() );

    }
}

