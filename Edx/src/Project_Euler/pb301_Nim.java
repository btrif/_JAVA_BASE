package Project_Euler;

//  Created by Bogdan Trif on 23-09-2017 , 7:14 PM.
//    o(^_^)o         ( ͡° ͜ʖ ͡°)
//        # © Solved by Bogdan Trif @   Completed on Sat, 23 Sep 2017, 19:27

//LINKS :
//http://www.archimedes-lab.org/How_to_Solve/Win_at_Nim.html
//https://stackoverflow.com/questions/1991380/what-does-the-operator-do-in-java
//https://plus.maths.org/content/play-win-nim

import static java.lang.Math.pow;

public class pb301_Nim {

    public static int X(int i){
        return (i)^(2*i)^(3*i) ;
    }

    public static int solution(int limit){
        int cnt = 0 ;
        for (int j=1 ; j<=pow(2,limit) ; j++ ) {
            if (X(j) == 0 ) {
//                System.out.println("i= "+ j + "   " + X(j) );
                cnt +=1 ;
            }
        }

    return cnt;
    }


    public static void main(String[] args) {

        double t1 = System.nanoTime() ;

        System.out.println("\nLoosing configurations : " + solution(30) );

        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );
    }
}


//    ANSWER : Loosing configurations : 2178309     Completed in  2748.61387  ms


