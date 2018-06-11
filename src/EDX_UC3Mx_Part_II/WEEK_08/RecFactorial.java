package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 25-05-2017 , 10:17 AM.


/**     RECURSION FACTORIAL
 * This program displays as stars the execution time of
 * factorial(n) computed with the non-tail linear recursion
 * The resulting graph shows how the growth with n
 *
 */

/**
 Linear Growth II (non graded activity)

 Now, we will see graphically the execution time of a different implementation of the factorial of a number.

 Try changing the values of n and the times the algorithm is executed. What happens?

 As before, in Codeboard we will find that if we greatly increase the number of times,
 our program may be stopped by the platform, as it is consuming too much memory.

 Additionally, if the number which factorial we want to compute is really high,
 the program will throw an exception. Which exception?
 With which number your program throws the exception? Why?

 What difference do you observe between the execution time of the first implementation of the algorithm
 and this one? Why do we say that the execution time of both implementations grows linearly with n?
 */

public class RecFactorial {

    /**
     * Non-tail linear recursion
     */
    public static long factorial(long n) {
        if (n<=1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
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
            test(i, 10000);
        }

    }
}