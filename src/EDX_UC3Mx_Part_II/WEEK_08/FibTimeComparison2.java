package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 4:27 PM.


/**
 * Fibonacci series, three implementations: cascade non-linear recursion,
 * tail linear recursion (faster) and direct (fastest).
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

