package Project_Euler;

//  Created by Bogdan Trif on 15-01-2019 , 3:24 PM.


import java.math.BigInteger;

public class pb160_Factorial_trailing_digits {

    public static BigInteger trailing_digits (long lim, long M) {
        BigInteger P = BigInteger.valueOf(1) ;
        BigInteger b = BigInteger.valueOf(10) ;

        for (long n=1; n <=lim; n++) {
            P =   P.multiply(  BigInteger.valueOf(n)) ;     //.multiply(P) ;
            long m = n;
            while ( m % 5 ==0 ){
                P = P.divide( b ) ;
//                System.out.println(" P =" + P);
                m /= 5;
            }

            if ( n % Math.pow(10, 10) == 0 ){
            System.out.println("iter =  " + n +"      "+ P );
            }


        P = P.mod(BigInteger.valueOf(M)) ;

        }

    System.out.println("\n ANSWER = " +  P.mod(BigInteger.valueOf( 100000 )) ) ;
    return P ;
    }

    public static void main(String[] args) {

        double t1 = System.nanoTime() ;
        long N = (long) Math.pow(10, 8) ;
        long M = (long) Math.pow(10, 13) ;

        System.out.println("\nAnswer = "  + trailing_digits( N,  M  ) ) ;


        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );

    }

}
