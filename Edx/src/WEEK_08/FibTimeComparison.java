package WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 3:22 PM.


/**
 * Fibonacci series, three implementations: cascade non-linear recursion,
 * tail linear recursion (faster) and direct (fastest).
 */

/**
 Fibonacci: Calculating the Execution Time (non graded activity)

 In the previous video, we have seen that it is not a good idea to rely on the execution time
 to calculate the complexity of an algorithm (as we cannot execute it for all the possible input values).
 But... why not?

 In this exercise we will follow maybe a very naive approximation for computing the execution time
 of Fibonacci. As you can see below, we get the time before the execution and after the execution
 and we establish that the difference is the execution time...

 Try executing the program several times. What happens? Does the execution time for each algorithm
 remain always the same? Or are there differences?

 Notes:

 For low values of n, the direct solution could take longer to execute,
 as it performs many more mathematical operations.
 As n increases, the number of iterations and sentences executed of the other algorithms increases,
 while the execution time of the direct one remains more or less the same.

 The method System.out.format() was used to format the output,
 forcing to print the first string within 25 characters, and the numbers (and strings of the header)
 within 20 characters.
 */




public class FibTimeComparison {
    /**
     * Cascade recursion implementation: fib(n) = fib(n-1)+fib(n-2)
     */
    public static long recursive(int n) {
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

        double goldenRatio = (1 + Math.sqrt(5)) / 2;

        double f1 = Math.pow(goldenRatio, n);
        double f2 = Math.pow(-goldenRatio, -n);
        return (long) ((f1-f2)/Math.sqrt(5));
    }


    /**
     * Calls the three implementations and compares the average time
     */
    public static void test(int n) {
        long startTime = 0;
        long endTime;
        long result;

        System.out.println("TEST CASE: n="+n);

        System.out.format("%-25s %20s %20s\n","Used Algorithm", "Result", "Execution Time");

        startTime = System.nanoTime();
        result = recursive(n);
        endTime = System.nanoTime();

        System.out.format("%-25s %20d %20d\n","Cascade recursion", result, (endTime-startTime));

        startTime = System.nanoTime();
        result = recursive2(n);
        endTime = System.nanoTime();


//        DIRECT
        System.out.format("%-25s %20d %20d\n","Linear Tail recursion", result, (endTime-startTime));

        startTime = System.nanoTime();
        result = direct(n);
        endTime = System.nanoTime();


        System.out.format("%-25s %20d %20d\n","Direct", result, (endTime-startTime));


        System.out.println("========");
    }

    public static void main(String[] args) {
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