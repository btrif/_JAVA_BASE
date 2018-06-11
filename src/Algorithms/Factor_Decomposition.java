package Algorithms;

//  Created by Bogdan Trif on 11-09-2017 , 4:10 PM.


public class Factor_Decomposition {



    public static void main(String[] args) {

        int[] Fctr = new int[20] ;  // Maximum number of factors

        int number = 50220040 ;

        int f = 0 ;
        for (int factor = 2; factor <= number; factor++) {

            while (number % factor == 0) {
                number = number / factor;
                System.out.println("number=  " + number + "  factor = " + factor);
                Fctr[f] = factor ;
                f++ ;
                }
            }
        int[] FACTORS = new int[f] ;
        System.out.println("-------- Factor list -------");
        for (int i =0 ; i<FACTORS.length ; i++){
            FACTORS[i] = Fctr[i] ;
            System.out.print(FACTORS[i]+" ");

        }

    }

}
