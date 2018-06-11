/**
 * Created by Bogdan Trif on 03-05-2017 , 10:00 AM.
 */

/**
 However, as Java is an object oriented designed programming language,
 sometimes it is useful to have numbers represented as objects.
 This is the reason why the standard Java library provides two useful classes, Integer and Double,
 which are included in the package java.lang and extend the class Number.
 These classes respectively wrap the value of integer and double values into objects,
 and provide several attributes and methods that are useful to manage these values.
 Thus, when creating a new object of type Integer or Double,
 the variable does not point directly to the value in memory,
 but to the object which contains the actual value of the number.
 Specifically, to get the value of the represented numbers of Integer or Double variables,
 you must use the provided methods intValue() and doubleValue().
 These methods return the actual primitive data type of the number represented in the objects.

 One of the benefits of these classes is that they facilitate the casting between decimal and integer numbers.
 In fact, if you call the method doubleValue() of class Integer,
 you will get the decimal version of the integer number.
 For example, the decimal version of 2 is 2.0. Similarly, if you call the method intValue() of class Double,
 you will get the integer part of the decimal number. For example, the integer part of the number 2.5 is 2.
 Note that this is like a rounding down of the decimal number to its integer part.
 */

public class Integer_and_Double_Classes {


    public static void main(String[] args){

        // A simple variable
        int a = 71 ;
        System.out.println( a );
        // A Class variable : --> We have many methods as shown bellow :
        Integer myInt = new Integer(1979) ;
        System.out.println( myInt.doubleValue() );
        System.out.println( myInt.byteValue() );
        System.out.println( myInt.floatValue() + "\n");

        Double myDouble = new Double(45.4832) ;
        System.out.println( myDouble.intValue() );
        System.out.println( myDouble.isInfinite() );
        System.out.println( myDouble.floatValue() );
        System.out.println( myDouble.hashCode() +"\n" );

        Integer myNumber = new Integer ("3");
        System.out.println( myNumber.floatValue() + '\n');

        Integer i1 = new Integer(2);
        System.out.println(i1.intValue() + ", " + i1.longValue() + ", " + i1.doubleValue());
        System.out.println(Integer.SIZE + ", " + Float.SIZE + ", " + Long.SIZE + ", " + Double.SIZE);
        System.out.println( "MAX_VALUE : " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);

        // TRANSFORMING A DOUBLE INTO AN INT ===========
        System.out.println("\nTransforming a Double into an Int : ") ;
        Double d = 5.25;
        Integer i = d.intValue(); // i becomes 5
        System.out.println( d + "   " + i );
        double e = 9.33;
        int j = (int) e ;
        System.out.println( e + "   " + j );

    }

}
