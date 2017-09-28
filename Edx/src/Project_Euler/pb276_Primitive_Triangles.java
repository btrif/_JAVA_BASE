package Project_Euler;

//  Created by Bogdan Trif on 03-09-2017 , 5:50 PM.
/*
# Solved by Bogdan Trif @
#The  Euler Project  https://projecteuler.net

                    Primitive Triangles     -       Problem 276

Consider the triangles with integer sides a, b and c with a ≤ b ≤ c.
An integer sided triangle (a,b,c) is called primitive if gcd(a,b,c)=1.
How many primitive integer sided triangles exist with a perimeter not exceeding 10 000 000 (10^7) ?
 */


import Algorithms.Prime_Factorization;
import Array_basic.Array_basic ;

public class pb276_Primitive_Triangles {

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public int gcd3(int a, int b, int c) {
        return gcd(gcd(a, b) ,c );
    }


    private void brute_force(int perimeter){
        int cnt = 0 ;

        for (int a=1; a <= perimeter/3 ;a++ ){
            System.out.println("size = " + a);

            for(int b = a ; b<= (perimeter-a) /2 ; b++  ){

                int scnt = 0 ;
                for (int c = b ; c<= perimeter-a-b ; c++){
                    if ( gcd3(a,b,c) == 1 && a+b != c   ) {
                        cnt += 1 ;
                        scnt +=1 ;
//                        System.out.println("a, b, c = " + a + " ,  " + b + " ,  " + c + " ;   perim = " + (a + b + c)+" ;   cnt = " + cnt +"   ; scnt= " + scnt  );
                    }
                }
            }

        }
        System.out.println("\nBRUTE FORCE max perim = " + perimeter + " : \n" +
                "Primitive integer sided triangles :\t" + cnt );
    }


    public void Primitive_integer_sided_triangles(int perimeter){
        int cnt = 0 , p = perimeter ;
        for (int a=1; a <= p/3 ;a++ ){
//            System.out.println("size = " + a);

            for(int b = a ; b<= (p-a) /2 ; b++  ){
                if (a+b <= p/2 ){
                    cnt -= 1 ;  // we substract the cases like a,b,c = 1,1,2 to a,b,c = 25,25,50
                }
//                for (int c = b ; c<= p ; c++){
                // CASE 1
                if ( gcd(a,b) == 1   ) {
                    cnt += p-a-b ;
//                        System.out.println("a, b = " + a + " ,  " + b + " ;   cnt = " + cnt );
                }
                // CASE 2
                if ( gcd(a,b) != 1   ) {
                    int g = gcd(a,b) ;
                    int[] P =  Prime_Factorization.primeFactors(g) ;
                    System.out.print("   " + g +"    ");
//                    Array_basic.printArray1D(P);
//                    Combinations



//                        System.out.println("a, b, c = " + a + " ,  " + b + " ,  " + c + " ;   perim = " + (a + b + c)+"   "   );
                }


            }

        }
        System.out.println("\nMAIN SOLUTION max perim = "+perimeter+" : \n" +
                "Primitive integer sided triangles :\t" + cnt );
    }


    public static void main(String[] args) {
        int i= 90, j = 120 , k = 15;

        pb276_Primitive_Triangles GCD  = new pb276_Primitive_Triangles() ;
        pb276_Primitive_Triangles GCD3  = new pb276_Primitive_Triangles() ;
        System.out.println(" gcd("+i+"," + j + ") = " + GCD.gcd(i,j)   );
        System.out.println(" gcd3("+i+"," +j+ ","+k+ ") = " + GCD.gcd3(i,j, k) +"\n\n" );


        float start = System.nanoTime() ;

//        System.out.println( (double) 1e7/3 );
//        for (int a=0 ; a<= 1e3 ; a++){
//            System.out.println(a);
//        }
        int up_range = (int) 1000 ;

        pb276_Primitive_Triangles BF = new pb276_Primitive_Triangles() ;
        BF.brute_force(up_range);

        System.out.println("\nCompleted in  " + Math.floor((System.nanoTime() - start)/1e4 )/1e2 + "  ms" );

        /// MAIN ALGORITHM
        float t2 = System.nanoTime() ;

//        pb276_Primitive_Triangles solution = new pb276_Primitive_Triangles() ;
//        solution.Primitive_integer_sided_triangles( up_range);


//        for (int m=1 ; m<=1e7 ; m++){
//            if ( m%1000 == 0){
//            System.out.println(m); }
//            for (int n=1 ; n<=1e4 ; n++){
//
//            }
//        }

        System.out.println("\nCompleted in  " + Math.floor((System.nanoTime() - t2)/1e4 )/1e2 + "  ms" );

    }
}
