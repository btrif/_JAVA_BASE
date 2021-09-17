package Project_Euler;

//  Created by Bogdan Trif on 04-01-2019 , 8:15 PM.


import java.math.BigDecimal;
import java.math.BigInteger;

public class pb390_Triangles_with_non_rational_sides_and_integral_area {

    public  BigInteger sqrtB(BigInteger n)
    {
        Double d=Math.sqrt(n.doubleValue());
        n=BigInteger.valueOf(d.longValue());
        return n;
    }


    public static BigInteger sqrtC(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }


    public static int triangles(long limit){

        long N = limit*2  ;
        long suma = 0 ;
        long b = 2 ;
        int count = 0 ;

        while (b*b+1 <= N ) {
            long upper_bound = N / (b * b + 1) ;
//            System.out.println(  "    upper_bound =   "   + upper_bound );
            for (long t = 2 ; t <= upper_bound ; t+=2 )  {

                    BigInteger s = BigInteger.valueOf( b * b * t * t - b * b + t * t) ;
                    BigInteger v = sqrtC(s) ;

                    // @ 2019-01-04 - Here there is a BIGINTEGER problem :
//                Square roots  bigger than 1.900.000.000  will yield errors, bevause of the
//                        long upper limit of 10^63

                    if (t % 1e8 == 0) {
                        System.out.println("t = " + t +"   s= "+ s +  "    upper_bound =   "   + upper_bound ); }


                    if ( v == (long) v  ) {
//                    if ( v % 1 == 0  ) {
//                        System.out.println("v = " + (long)v);
                        long c =  b * t + (long) v ;
                        long n =  b * c + t ;

                        if (n > N) {break ;}
                        suma += n / 2 ;
                        count += 1 ;
                        System.out.println(count+ ".     b = "  +  b + "      c= " + c   + "    n = " +  n + "    t= "  + t + "   v= "+ (long) v ) ;


                    }
            }

            b += 2 ;

        }

    System.out.println( "\n Answer =  " +  suma) ;
    return  0 ;

    }

    public static void main(String[] args) {

        double t1 = System.nanoTime() ;

        long T = triangles( (long) 1e10 ) ;

        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );

    }




}
