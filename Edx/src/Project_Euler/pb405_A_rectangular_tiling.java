package Project_Euler;

//  Created by Bogdan Trif on 28-08-2017 , 5:26 PM.

/*
Problem 405     -       A rectangular tiling

We wish to tile a rectangle whose length is twice its width.
Let T(0) be the tiling consisting of a single rectangle.
For n > 0, let T(n) be obtained from T(n-1) by replacing all tiles in the following manner:

p405_tile1.png

The following animation demonstrates the tilings T(n) for n from 0 to 5:

p405_tile2.gif

Let f(n) be the number of points where four tiles meet in T(n).

For example, f(1) = 0, f(4) = 82 and f(10^9) mod 17^7 = 126897180.

Find f(10^k) for k = 10^18, give your answer modulo 17^7.               */


import static java.lang.Math.pow;

public class pb405_A_rectangular_tiling {

    public static int rectangular_tiles(int level){
        if (level == 2) {
            return 2 ;
        }
        else {
            return 0 ;
        }
    }

    public static void main(String[] args) {

        double t1 = System.nanoTime() ;
//        int var = 5 ;
//        for (int i=0 ; i <= 1e5 ; i++){
//            var = i ;
//            if (i == 1e8 + 13452542){
//                System.out.println("Yes ! I just broke !   " + var);
//                break;
//            }
//        }

        double a[] = {0, 0} ;
        double b[] = {0, 0} ;
        double up_range = 1e2 ;
        System.out.println("up_range = "+up_range);

        for (double i = 2;  i <= up_range; i++){
            b[0] = (a[0]+a[1])*4 ;
            if( i % 2 == 0 ){
                b[1] = a[1]*2 + 2 ;
            }
            if( i % 2 == 1 ){
                b[1] = a[1]*2 + 4 ;
            }
            a = b ;
//            if (i % 1e6 == 0) {
            System.out.println("i= " + i + "  " + "a= [" + a[0] + " " + a[1] + "]  " + (a[0] + a[1]) +
                        "  b= [" + b[0] + " " + b[1] + "]  " + (b[0] + b[1]));
//            }
        }


//        int R = rectangular_tiles(2);
//        System.out.println("\nThe number of cross intersections : \t" + R);

        double t2 = System.nanoTime() ;
        System.out.println("\n Completed in  " + (System.nanoTime() - t2)/1e6 + "  ms" );

    }
}


// NOTE : 2017-08-28, 20:13 Need to find a recursion formula based on the pattern I found