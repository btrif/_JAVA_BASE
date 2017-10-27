package Project_Euler;

//  Created by Bogdan Trif on 10-10-2017 , 10:17 AM.
// Completed on Tue, 10 Oct 2017, 21:45


/*
Inscribed circles of triangles with one angle of 60 degrees         -       Problem 195

Let's call an integer sided triangle with exactly one angle of 60 degrees a 60-degree triangle.
Let r be the radius of the inscribed circle of such a 60-degree triangle.

There are 1234 60-degree triangles for which r ≤ 100.
Let T(n) be the number of 60-degree triangles for which r ≤ n, so
T(100) = 1234       ,
T(1000) = 22767     , and
T(10000) = 359912       .

Find T(1053779).

*/


import java.util.* ;


public class pb195_Inscribed_circles_of_triangles_with_one_angle_of_60_degrees {

    private static String Int_Array_to_String(int[] intNumbers, String delimiter) {
        StringBuffer sbfNumbers = new StringBuffer();
        if (intNumbers.length > 0) {
            sbfNumbers.append(intNumbers[0]);
            for (int i = 1; i < intNumbers.length; i++) {
                sbfNumbers.append(delimiter).append(intNumbers[i]);
            }
        }
        String strNumbers = Arrays.toString(intNumbers);
        strNumbers = strNumbers.replaceAll(", ", delimiter).replace("[", "").replace("]", "");
        return strNumbers ;

    }

    public static long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static long gcd3(long a, long b, long c) {
        return gcd(gcd(a, b) ,c );
    }

    public static double InRadius(double a, double b, double c){
        double s = (a+b+c)/2 ;
        return (double) s* (Math.sqrt( ( 1-a/s)*(1- b/s)*(1-c/s) )) ;
//        return (double) (Math.sqrt( ( s-a)*(s-b)*(s-c)/s )) ;

    }

    public static int solution_inscribed_circles(int Lim){

        long cnt = 0 ;
        int SCNT = 0 ;

        for (long m=1 ; m < Lim*(3.5) ; m++  ) {

            if (m % 10000 == 0){  System.out.println("cnt = " + cnt +"       m = " + m);   }

            for (long n=1 ; n < m ; n++ ){

                if (m*n > 3.5*Lim ) { break; }

                if ( gcd(m,n)==1 || (m-n)%3 ==3   ) {
                    long a = (long) (2*m*n + m*m) ;
                    long b = (long) (2*m*n + n*n) ;
                    long c = (long) (m*m + n*n + m*n) ;
                    cnt+=1        ;

                    if (a != b) {
                        int g = (int) gcd3(a, b, c);
                        long ga = (long) (a/g) ;
                        long gb = (long) (b/g) ;
                        long gc = (long) (c/g) ;

                        double inrad = (double) InRadius(ga, gb, gc);
                        if ( inrad  <= Lim) {
                            int x = 1;
                            while (InRadius(ga*x, gb*x, gc*x) <= Lim) {
                                SCNT++;
                                x++;
//                                if (m > 1000000) {
//                                System.out.println(cnt + ".    " + ga  + ", " + gb + ", " + gc  + "   m,n= " + m + " " + n + "    gcd3= " + gcd3(a, b, c) + "    sum= " + (ga + gb + gc)  + "     InRad= " + inrad);
//
        //                                }
                                }
                            }
                        }
                    }
                }
            }
        return SCNT ;
    }



    public static void main(String[] args) {

//        System.out.println("InRadius = " + InRadius(67, 3367, 3400) ) ;
//        System.out.println("InRadius = " + InRadius(17101, 151, 17176 ) ) ;
//        System.out.println("InRadius = " + InRadius(7,13,15) ) ;

        double t1 = System.nanoTime() ;

        // Solution  = 75085391     <-- CORRECT ANSWER !!!!     Completed in  16.842924733  s
        System.out.println("\nSolution  = " + solution_inscribed_circles(1053779) ) ;
//        System.out.println("\nSolution  = " + solution_inscribed_circles(10000) ) ;

        System.out.println("\nCompleted in  " + (System.nanoTime() - t1)/(1e9) + "  s" );    //  16.84  s






        // VERY IMPORTANT HERE VARIABLE MISSMATCH ! NEED A FIX IMMEDIATELY
        int m =  46334 ;
        int n = 7 ;
        long a = Long.valueOf(2*m*n + m*m) ;
        long b = (long) (2*m*n + n*n) ;
        long c = (long) (m*m + n*n + m*n) ;
        System.out.println("\n a, b, c =   " + a+"  " + b +"  " + c) ;

//        SOLUTIONS : 100 = 1234 ;  1.000 = 22767 ;  10.000 = 359912 ,

    }
}
