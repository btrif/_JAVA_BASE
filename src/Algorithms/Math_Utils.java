package Algorithms;

//  Created by Bogdan Trif on 05-09-2017 , 11:03 AM.


import java.math.BigInteger;

public class Math_Utils {

    public static long factorial(long n) {
        if (n == 0) {
            return 1;        }
        long fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

//    Big Numbers version by HoldOffHunger:

    public static BigInteger factorial2(BigInteger n) {
        BigInteger factorial2 = BigInteger.valueOf(1);
        if (n.equals(BigInteger.valueOf(0))) {
            return factorial2;
        }

        for (int i = 1; i <= n.intValue(); i++) {
            factorial2 = factorial2.multiply(BigInteger.valueOf(i));
        }

        return factorial2;
    }

    public static void main(String[] args) {

        Math_Utils fac = new Math_Utils() ;
        long a = (int) Math.pow(2,31) ;

        System.out.println("Small numbers until 20! < 2^63  : \t" + fac.factorial( 20 ) );
        BigInteger x =  BigInteger.valueOf(50) ;
        System.out.println("\nBig Integers numbers until 2^500000000 : \t" + fac.factorial2( x ) );

    }

}
