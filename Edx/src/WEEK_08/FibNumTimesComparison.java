package WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 5:04 PM.


/**
 * Fibonacci series, three implementations: cascade non-linear recursion,
 * tail linear recursion (faster) and direct (fastest).
 */

/**
 Fibonacci: Counting Operations (non graded activity)

 In this exercise we will see how the different implementations of the Fibonacci algorithm behave
 in terms of number of times that they are invoked.
 Try to understand the code and how the test was performed.

 Try changing the values of n. What happens?

 Each time we execute the program, the number of operations is the same, that is,
 the number of operations does not depend on the accuracy of our clock neither on the number
 of times we execute the algorithm in order to obtain the average time.

 Notice that the method System.out.format() was used to format the output,
 forcing to print the first string within 25 characters, and the numbers (and strings of the header)
 within 20 characters.
 */

public class FibNumTimesComparison {


    private static int invoked = 0;

    public static void clearInvoked(){
        invoked = 0;
    }

    public static int getInvoked(){
        return(invoked);
    }

    /**
     * Cascade recursion implementation: fib(n) = fib(n-1)+fib(n-2)
     */
    public static long recursive(int n) {
        invoked++;

        if (n<=1) {
            return n;
        } else {
            return recursive(n-1)+recursive(n-2);
        }
    }


    /**
     * Linear Tail recursion implementation
     */
    private static long fibAux(int n, int x, int y) {

        invoked++;
        if (n==0) return x;
        if (n==1) return y;
        return fibAux(n-1, y, x+y);

    }
    public static long recursive2(int n) {
        return fibAux(n, 0, 1);
    }

    /**
     * Direct implementation
     */
    public static long direct(int n) {
        invoked++;
        double goldenRatio = (1 + Math.sqrt(5)) / 2;

        double f1 = Math.pow(goldenRatio, n);
        double f2 = Math.pow(-goldenRatio, -n);
        return (long) ((f1-f2)/Math.sqrt(5));
    }

    /**
     * Calls the three implementations and compares the average time
     */
    public static void test(int n) {

        long result;

        System.out.println("TEST CASE: n="+n);

        System.out.format("%-25s %20s %20s\n","Used Algorithm", "Result", "Times Invoked");

        clearInvoked();
        result = recursive(n);
        System.out.format("%-25s %20d %20d\n","Cascade recursion", result, getInvoked());

        clearInvoked();
        result = recursive2(n);
        System.out.format("%-25s %20d %20d\n","Linear Tail recursion", result, getInvoked());

        clearInvoked();
        result = direct(n);
        System.out.format("%-25s %20d %20d\n","Direct", result, getInvoked());


        System.out.println("========");
    }

    public static void main(String[] args) {
        // test set
        // test set
        test(1);
        test(2);
        test(3);
        test(4);
        test(10);
        test(20);
        test(30);
        test(40);
    }
}


