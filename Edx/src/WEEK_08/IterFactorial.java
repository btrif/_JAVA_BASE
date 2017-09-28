package WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 5:36 PM.


/**     ITERATION FACTORIAL
 * This program displays as stars the execution time of
 * factorial(n) computed in an iterative way
 * The resulting graph shows how the growth is exponential with n
 *
 */

/**
 Linear Growth (non graded activity)

 In this exercise we will see graphically the execution time of an iterative algorithm,
 more specifically, the execution time of an iterative algorithm that computes the factorial of a number.

 For this, first of all, the program will compute the average execution time of the algorithm
 for a given value of n. It will execute the algorithm 10000 times.
 Then, it will print for each value of n, a line of stars of length proportional to this execution time.

 Try changing the values of n and the number of times the program computes a given factorial.

 We already know that it is important to execute the same algorithm enough times to compute its average time. Is 10 times enough? Why?

 Be aware that in Codeboard we will find that if we greatly increase the number of times,
 our program may be stopped by the platform, as it is consuming too much CPU time
 (in this platform each execution of a program has a limit in the CPU time that can be used).
 */

public class IterFactorial {

    /**
     * Iterative factorial
     */
    public static long factorial(long n) {

        long result = 1;

        if (n > 1) {
            for (int i = 1; i <= n; i++){
                result = result * i;
            }
        }
        return result;
    }

    /**
     * Displays a line of stars.
     * The length of the line is proportional to the average execution time
     * of the algorithm
     *
     */
    private static void displayStars(long n, long averageTime, int stars, char c) {

        System.out.print(n+"\t"+averageTime+"\t");

        for(long i=0; i<stars; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    /**
     * Test method: calls factorial(n) the number of
     * given by times
     */
    public static void test(long n, long times) {
        long startTime = System.nanoTime();
        for(long i=0; i<times; i++) {
            factorial(n);
        }
        long averageTime = (System.nanoTime()-startTime)/times;
        displayStars(n, averageTime, (int)averageTime/100, '*');
    }

    public static void main(String[] args) {

        System.out.println("n"+"\t"+"time");
        for(int i=0; i<5000; i+=100) {
            test(i, 20000);
        }

    }
}

