//  Created by Bogdan Trif on 24-05-2017 , 4:27 PM.


/**
 * Fibonacci series, three implementations: cascade non-linear recursion,
 * tail linear recursion (faster) and direct (fastest).
 */

/**
 Fibonacci: Calculating the Execution Time (II) (non graded activity)

 In the previous exercise, we realised that with only one sample, i.e. only one execution,
 we cannot establish the execution time of an algorithm,
 as each time we invoke it the conditions on the machine may be different (CPU load, memory conditions, etc).
 So, we must always carry out the execution of a sufficient number of times and then
 calculate an average execution time.

 So, we changed the previous code in order to be more accurate regarding the calculation
 of the execution time. Have a look at the new code and run it. What happens?
 Is this new implementation good enough?

 Change the code in order to correct the mistake calculating the execution time (if you find any).

 The solution to this exercise is published at the end of the week (in the RECAP section).

 Notes:

 For low values of n, the direct solution could take longer to execute,
 as it performs many more mathematical operations.
 As n increases, the number of iterations and sentences executed in the other algorithms increases,
 while the execution time in the direct one remains more or less the same.

 The method System.out.format() was used to format the output,
 forcing to print the first string within 25 characters,
 and the numbers (and strings of the header) within 20 characters.

*/


public class FibTimeComparison2 {


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
        long result=0;
        long sum;
        int times=500;

        System.out.println("TEST CASE: n="+n);

        System.out.format("%-25s %20s %20s\n","Used Algorithm", "Result", "Execution Time");

        sum = 0;

        for (int i=0; i< times; i++){
            startTime = System.nanoTime();
            result = recursive(n);
            endTime = System.nanoTime();
            sum += (endTime-startTime);
        }
        System.out.format("%-25s %20d %20d\n","Cascade recursion", result, sum/times);

        sum = 0;
        for (int i=0; i< times; i++){
            startTime = System.nanoTime();
            result = recursive2(n);
            endTime = System.nanoTime();
            sum += (endTime-startTime);
        }

        System.out.format("%-25s %20d %20d\n","Linear Tail recursion", result, sum/times);

        sum = 0;
        for (int i=0; i< times; i++){
            startTime = System.nanoTime();
            result = direct(n);
            endTime = System.nanoTime();
            sum += (endTime-startTime);
        }

        System.out.format("%-25s %20d %20d\n","Direct", result, sum/times);


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
    }
}

