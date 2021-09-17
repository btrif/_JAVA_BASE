package Project_Euler;

/*  Created by Bogdan Trif on 23-09-2017 , 7:53 PM.

# © Solved by Bogdan Trif @
#The  Euler Project  https://projecteuler.net

Almost right-angled triangles I     -       Problem 223

Let us call an integer sided triangle with sides a ≤ b ≤ c barely acute if the sides satisfy
a^2 + b^2 = c^2 + 1.

How many barely acute triangles are there with perimeter ≤ 25,000,000  (2.5*10**7)  ?

*/

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class pb223_Almost_right_angled_triangles_I {

    public static boolean is_square(long nr){
        double sq = Math.sqrt(nr);
        long x = (long) sq;
        if (Math.pow(sq,2) == Math.pow(x,2)) {
            return true ;
        }
        return false;
    }


    public static long almost_brute_force(int lim) {

        long[] Sq1 = new long[ (lim/2) ] ;
        long[] Sq  = new long[ (lim/2) ] ;

        for (int k=4 ; k< lim/2 ; k++){
            Sq1[k] = (long) (((long) k*(long) k)+1) ;
            Sq[k] = (long) ((long) k*(long) k) ;
        }

        int cnt = 0 ;
        for (int i =4 ; i< Sq1.length ; i++  ) {
            int high = (i-1) ;
            int low = (int) floor( sqrt( (long) ( (long) Sq1[i]-1)/2 ) )  ;


            for (int j = high ; j > low ; j-- ) {
                long b_sq = (long) Sq[j] ;

                if ( is_square( (Sq1[i] -  b_sq) ) ) {

                    long a = (long) (sqrt(Sq1[i] - b_sq)) ;
                    long b = (long) (sqrt(b_sq)) ;
                    long c = (long) (sqrt(Sq1[i]-1 )) ;
                    if ( (a+b+c) <= lim) {
                        cnt += 1 ;
//                        System.out.println(cnt + ".      a = "+  a + "    b=" +  b + "     c="+c +"      perim= "+ perim + "    c^2+1 = " + c*c+1 +"    low= "+ low + "   high= " + high + "     b_sq= "+ b_sq ) ;

                        if (((a+b+c)%10000)< 5 ){
                            System.out.println(cnt + ".      a = "+  a + "    b=" +  b + "     c="+c +"      perim= "+ (a+b+c) + "         c^2+1 = " + c*c+1 ) ;
                        }

                        }
                    }
                }
            }
        return cnt + (long) (lim/2) - 1 ;
        }

    public static void main(String[] args) {

        double t1 = System.nanoTime() ;

//        System.out.println("\nAlmost-right angled triangles : " + almost_brute_force(250000) );
        System.out.println("\nAlmost-right angled triangles : " + almost_brute_force(20000) );

        System.out.println("\nCompleted in  " + (System.nanoTime() - t1)/1e9 + "  s" );

    }
//   lim = 25.000 --> Almost-rght angled triangles : 37347
//    Completed in  360.858535  ms


//    low =  math.floor( sqrt( (Sq1[i]-1)/2) )
//            if i%10000 == 0 :
//            # print(str(i)+'.       high   =  ', i, high ,  '  Sq1 = ' ,Sq1[i] , '    c_sq+1=', Sq1[i] ,'  high=' ,Sq[high] ,'    low=', low , '   time = ', round((time.time()-t1 ),2),' s' )

//            for j in range(high, low, -1) :
//            # print( Sq[j]  )
//    b_sq = Sq[j]
//            if is_square( (Sq1[i] - b_sq) ) :
//    a = int(sqrt(Sq1[i] - b_sq))
//    b = int(sqrt(b_sq))
//    c = int(sqrt(Sq1[i]-1 ))
//            if a+b+c <= lim :
//    cnt+=1
//    print(str(cnt)+'.      a = ', a, '    b=' ,  b, '     c=',c,'      perim=', a+b+c , '         c^2+1 = ', c )
//
//            return print('\nAnswer : \t', cnt +lim//2 - 1)



}
