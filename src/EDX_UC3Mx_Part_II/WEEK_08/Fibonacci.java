package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 11:33 AM.


public class Fibonacci {

    long fib (int n){ /* n>=0 */

        if (n<=1) return n;
        else return fib(n-1)+fib(n-2);
    }

    long fib2(int n, int x, int y){/* n>=0 */
        if (n==0) return x;
        if (n==1) return y;
        else return fib2(n-1,y,x+y);
    }

    public static void main(String[] args) {
//        Simplest FIBONACCI


        Fibonacci F = new Fibonacci() ;

        long tStart = System.currentTimeMillis();   // Start time count

        System.out.println("fib =   " + F.fib(40));

        System.out.println("Completed in " + (System.currentTimeMillis() - tStart) + " ms\n" );


//     IMPROVED FIBONACCI
        double tStart2 = System.nanoTime();  // Start time count

        System.out.println("fib2 =   " +  F.fib2(40, 0, 1));

        System.out.println("Completed in " + (System.nanoTime() - tStart2)*1000 + " μs\n" );
    }
}
