package Project_Euler;

//  Created by Bogdan Trif on 15-10-2017 , 11:40 PM.


import java.util.Arrays;

public class pb229_Four_Representations_using_Squares {

    public static int count_element(int[] array, int elem) {
        int cnt = 0;
        for (int a : array) {
            if (a == elem) {
                cnt++;
            }
        }
    return cnt;
    }

    public static void main(String[] args) {

        int lim = 2000000001 ;
        int[] sieve = new int[lim] ;
        Arrays.fill(sieve, 1);


        for (int a=1 ; a<=2*Math.sqrt(lim) ; a++  ){
            if (a%100 == 0){
                System.out.println("a= " + a );
            }
            int b = 1 ;
            while ((a*a+b*b) < lim) {
                int n1 = a*a + b*b ;

                long n2 = (long) a * (long) a + 2 * (long) b * (long) b;
                long n3 = (long) a * (long) a + 3 * (long) b * (long) b;
                long n7 = (long) a * (long) a + 7 * (long) b * (long) b;

                if (sieve[n1] % 5 != 0) {
                    sieve[n1] *= 5 ;
                }

                if (n2 < lim) {
                    if (sieve[(int) n2] % 2 != 0){
                        sieve[(int)n2] *= 2 ;
                    }
                }

                if (n3 < lim) {
                    if (sieve[(int)n3] % 3 != 0){
                        sieve[(int)n3] *= 3 ;
                    }
                }

                if (n7 < lim) {
                    if (sieve[(int)n7] % 7 != 0){
//                        System.out.println("n7 = " + n7 + "    a, b = " + a + " " + b);
                        sieve[(int)n7] *= 7 ;
                    }
                }

                b++ ;
            }
        }


        int CNT = count_element(sieve, 210) ;

        System.out.println("\nthere are : " + CNT);

//        for (int i=0; i<sieve.length; i++ ){
//            System.out.println(sieve[i]);
//        }

    }

}
