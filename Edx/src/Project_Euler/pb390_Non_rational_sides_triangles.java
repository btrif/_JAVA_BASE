package Project_Euler;

//  Created by Bogdan Trif on 20-09-2017 , 4:15 PM.


import Algorithms.Math_Utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

public class pb390_Non_rational_sides_triangles {


    public static boolean is_square(double nr){
        double sq = Math.sqrt(nr);
        long x = (long) sq;
        if(Math.pow(sq,2) == Math.pow(x,2)) {
            return true ;
        }
        return false;
    }

    /// VERY VERY WEAK

    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        // Loop until we hit the same value twice in a row, or wind
        // up alternating.
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }


    /**
     * Returns the correctly rounded square root of a positive BigDecimal.


     * The algorithm for taking the square root of a BigDecimal is most
     * critical for the speed of your application. This method performs the fast
     * Square Root by Coupled Newton Iteration algorithm by Timm Ahrendt,
     * from the book "Pi, unleashed" by Jörg Arndt in a neat loop.
     *
     * @param squarD   number to get the root from (called "d" in the book)
     * @param rootMC   precision and rounding mode (for the last root "x")
     *
     * @return the root of the argument number
     *
     * @throws ArithmeticException       if the argument number is negative
     * @throws IllegalArgumentException  if rootMC has precision 0
     */

    public static BigDecimal bigSqrt(BigDecimal squarD, MathContext rootMC)
    {
        // Static constants - perhaps initialize in class Vladimir!
        BigDecimal TWO = new BigDecimal(2);
        double SQRT_10 = 3.162277660168379332;


        // General number and precision checking
        int sign = squarD.signum();
        if(sign == -1)
            throw new ArithmeticException("\nSquare root of a negative number: " + squarD);
        else if(sign == 0)
            return squarD.round(rootMC);

        int prec = rootMC.getPrecision();           // the requested precision
        if(prec == 0)
            throw new IllegalArgumentException("\nMost roots won't have infinite precision = 0");

        // Initial precision is that of double numbers 2^63/2 ~ 4E18
        int BITS = 62;                              // 63-1 an even number of number bits
        int nInit = 16;                             // precision seems 16 to 18 digits
        MathContext nMC = new MathContext(18, RoundingMode.HALF_DOWN);


        // Iteration variables, for the square root x and the reciprocal v
        BigDecimal x = null, e = null;              // initial x:  x0 ~ sqrt()
        BigDecimal v = null, g = null;              // initial v:  v0 = 1/(2*x)

        // Estimate the square root with the foremost 62 bits of squarD
        BigInteger bi = squarD.unscaledValue();     // bi and scale are a tandem
        int biLen = bi.bitLength();
        int shift = Math.max(0, biLen - BITS + (biLen%2 == 0 ? 0 : 1));   // even shift..
        bi = bi.shiftRight(shift);                  // ..floors to 62 or 63 bit BigInteger

        double root = Math.sqrt(bi.doubleValue());
        BigDecimal halfBack = new BigDecimal(BigInteger.ONE.shiftLeft(shift/2));

        int scale = squarD.scale();
        if(scale % 2 == 1)                          // add half scales of the root to odds..
            root *= SQRT_10;                          // 5 -> 2, -5 -> -3 need half a scale more..
        scale = (int)Math.floor(scale/2.);          // ..where 100 -> 10 shifts the scale

        // Initial x - use double root - multiply by halfBack to unshift - set new scale
        x = new BigDecimal(root, nMC);
        x = x.multiply(halfBack, nMC);                          // x0 ~ sqrt()
        if(scale != 0)
            x = x.movePointLeft(scale);

        if(prec < nInit)                 // for prec 15 root x0 must surely be OK
            return x.round(rootMC);        // return small prec roots without iterations

        // Initial v - the reciprocal
        v = BigDecimal.ONE.divide(TWO.multiply(x), nMC);        // v0 = 1/(2*x)


        // Collect iteration precisions beforehand
        ArrayList<Integer> nPrecs = new ArrayList<Integer>();

        assert nInit > 3 : "Never ending loop!";                // assume nInit = 16 <= prec

        // Let m be the exact digits precision in an earlier! loop
        for(int m = prec+1; m > nInit; m = m/2 + (m > 100 ? 1 : 2))
            nPrecs.add(m);


        // The loop of "Square Root by Coupled Newton Iteration" for simpletons
        for(int i = nPrecs.size()-1; i > -1; i--)
        {
            // Increase precision - next iteration supplies n exact digits
            nMC = new MathContext(nPrecs.get(i), (i%2 == 1) ? RoundingMode.HALF_UP :
                    RoundingMode.HALF_DOWN);

            // Next x                                                 // e = d - x^2
            e = squarD.subtract(x.multiply(x, nMC), nMC);
            if(i != 0)
                x = x.add(e.multiply(v, nMC));                          // x += e*v     ~ sqrt()
            else
            {
                x = x.add(e.multiply(v, rootMC), rootMC);               // root x is ready!
                break;
            }

            // Next v                                                 // g = 1 - 2*x*v
            g = BigDecimal.ONE.subtract(TWO.multiply(x).multiply(v, nMC));

            v = v.add(g.multiply(v, nMC));                            // v += g*v     ~ 1/2/sqrt()
        }

        return x;                        // return sqrt(squarD) with precision of rootMC
    }



    public static BigDecimal sqrt3(BigDecimal x, int scale)
    {
        // Check that x >= 0.
        if (x.signum() < 0) {
            throw new IllegalArgumentException("x < 0");
        }

        // n = x*(10^(2*scale))
        BigInteger n = x.movePointRight(scale << 1).toBigInteger();

        // The first approximation is the upper half of n.
        int bits = (n.bitLength() + 1) >> 1;
        BigInteger ix = n.shiftRight(bits);
        BigInteger ixPrev;

        // Loop until the approximations converge
        // (two successive approximations are equal after rounding).
        do {
            ixPrev = ix;

            // x = (x + n/x)/2
            ix = ix.add(n.divide(ix)).shiftRight(1);

            Thread.yield();
        } while (ix.compareTo(ixPrev) != 0);

        return new BigDecimal(ix, scale);
    }


    public static BigDecimal sqrt2(BigDecimal value) {
        BigDecimal x = new BigDecimal(Math.sqrt(value.doubleValue()));
        return x.add(new BigDecimal(value.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
    }

    public static BigDecimal triangles(long constraint){

        int cnt =0;
        BigDecimal Suma = BigDecimal.ZERO ;
//        long Suma = 0 ;
        BigDecimal C = BigDecimal.valueOf(constraint) ;

        for (long b = 2; b*b <= constraint /4 ; b+=2 ) {
            for ( long c =b; c < (constraint*2)/b ; c+=2){
//                double Q = (b*b+b*b*c*c + c*c) ;
//                BigInteger b2 = BigInteger.valueOf(b) ;
//                BigInteger c2 = BigInteger.valueOf(c);
////                BigInteger Q2 = sqrt( ((b2.multiply(b2).add(BigInteger.valueOf(1))).multiply(c2).multiply(c2)).add(b2.multiply(b2)) );
//                double Q2 = Math.sqrt( ((b*b+1)*c*c + b*b) );
                BigDecimal Q2 = sqrt3(BigDecimal.valueOf( ((b*b+1)*c*c + b*b) ), 7) ;
//                    if ( Q2%2 ==0 ){
//                if ( (Q2.mod(BigInteger.valueOf(2))).equals(BigInteger.ZERO))  {
                if ( Q2.remainder(new BigDecimal(2)).compareTo(BigDecimal.ZERO) ==0  )  {
//                    System.out.println("Q = " + Q +"    Q2 =" + Q2);

//                    BigInteger Area = Q2.divide(BigInteger.valueOf(2)) ;
                    BigDecimal Area = Q2.divide(BigDecimal.valueOf(2)) ;
//                    double Area = Q2.doubleValue()/2 ;
//                    double Area = Q2/2 ;

                    if ( Area.compareTo(C) < 0 ) {
//                    if ( Area < constraint ) {
                        cnt+=1 ;
                        System.out.println(cnt +".     b =  "+ b +"    c =  "+ c + "  ;   Area = " + Area + "    Q2 =" + Q2 ) ;


                        Suma = Suma.add(Area) ;
//                        Suma+=  Area ;
                    }
                }

            }

        }
        return Suma ;
    }

    public static void main(String[] args) {

        double t1 = System.nanoTime() ;

//        BigInteger val = new BigInteger("1000000") ;
        long val = 10000000000L ;
//        BigInteger S = new BigInteger(BigInteger.valueOf( triangles(val))) ;
        BigDecimal S = triangles(val) ;
//        triangles(val) ;
        System.out.println("\nResult =  " + S);

        System.out.println(is_square(680896836));

        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );
    }

}
