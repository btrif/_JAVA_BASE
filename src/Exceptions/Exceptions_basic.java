package Exceptions;

/**
 * Created by Bogdan Trif on 29-04-2017 , 7:54 PM.
 */

/**  We have seen three exceptions: ArithmeticException, ArrayIndexOutOfBoundsException, and NumberFormatException.
 * Let's see two more, which are related to classes and objects: NullPointerException and ClassCastException.
 */
public class Exceptions_basic {



    // ============= ILLEGAL ARGUMENT EXCEPTION ===============
    public void division (int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("The divisor cannot be 0.");
        }
    }
    // Main Execution of the program :
    public static void main(String[] args){
    // ======== NULL POINTER EXCEPTION ===========
        // This works well
        String s = new String("Hello Bogdan!") ;
        System.out.println("the string is  :" + s + "  and has length = " + s.length() );
        /**        However, if However, if we try to do the same but without having created
         the instance of the string "s" first, then the program will throw a NullPointerException.
         This exception will be thrown when trying to call the method "length" of the string "t",
         that is when trying to use a variable that has not been initialized yet.*/

        // String t = null ;
        // System.out.println("the string is  :" + t + "  and has length = " + t.length() );

        /** Actually, if we try to access position 0 in an array that has not
         been initialized, the program will throw a NullPointerException, and not
         an ArrayIndexOutOfBoundsException.

         */

        /** The second exception related to objects and classes that we're going to see
         is ClassCastException.
         */

    }




}
