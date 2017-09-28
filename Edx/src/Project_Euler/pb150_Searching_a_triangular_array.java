package Project_Euler;

//  Created by Bogdan Trif on 01-09-2017 , 10:39 AM.
/*
 Solved by Bogdan Trif @    Completed on Fri, 1 Sep 2017, 15:41
The  Euler Project  https://projecteuler.net

Searching a triangular array for a sub-triangle having minimum-sum      -       Problem 150

In a triangular array of positive and negative integers, we wish to find a sub-triangle
such that the sum of the numbers it contains is the smallest possible.

In the example below, it can be easily verified that the marked triangle satisfies
this condition having a sum of −42.


We wish to make such a triangular array with one thousand rows, so we generate 500500
pseudo-random numbers sk in the range ±219, using a type of random number generator
(known as a Linear Congruential Generator) as follows:

t := 0
for k = 1 up to k = 500500:
t := (615949*t + 797807) modulo 2**20
sk := t−2**19

Thus: s_1 = 273519, s_2 = −153582, s_3 = 450905 etc

Our triangular array is then formed using the pseudo-random numbers thus:

s1
s2  s3
s4  s5  s6
s7  s8  s9  s10
...
Sub-triangles can start at any element of the array and extend down as far as we like
(taking-in the two elements directly below it from the next row,
the three elements directly below from the row after that, and so on).
The "sum of a sub-triangle" is defined as the sum of all the elements it contains.
Find the smallest possible sub-triangle sum.

*/


import java.util.Arrays;
import java.util.stream.IntStream;

public class pb150_Searching_a_triangular_array {

    static public int[][] create_2D_triangle (int dim){
        long t = 0 ;
        long s ;
        int[][] triang = new int[dim][] ;

        for (int row=0; row< dim ; row++){
            triang[row] = new int[row+1] ;

            for (int col = 0 ; col<triang[row].length ;col++ ){
                t = (long)  ( ( 615949 *  t + 797807) % (Math.pow(2, 20)) ) ;
                s = (long) (t - Math.pow(2, 19) );
//                System.out.println("s = " + s);
                triang[row][col] = (int) s;
            }
        }
        return triang ;
    }

    // prints a 2D array
    static void printArray2D(int array[][]){
        System.out.print("[");
        for ( int[] i : array) {
            System.out.print("[");
            for (int j: i ){
                System.out.print(j + " ");
            }
            System.out.print("]\n");
        }
        System.out.print("]");
    }


//    public static long find_triangle_sum_down(int[][] triangle, int i, int j, int size  ){
//
//        int[][] T = triangle ;
//        long Sum = 0 ;
//
//        for (int k=0 ; k < size; k++){
//
//            int[] arr_range = Arrays.copyOfRange(T[i+k] , j, j+k+1 ) ;
//            Sum += IntStream.of(arr_range).sum() ;
//        }

//        return Sum ;
//    }

     static public long[] find_triangle_position_going_down(int[][] triangle, int i, int j ){
 /** Find the sum of all possible triangles at a position i,j
    @param triangle triangle array, nested list
    @param i int, row number
    @param j int, column number
    @return smallest  sum of the  triangle    */

        int[][] T = triangle ;
        long S = (long) Math.pow(10,8) ;
        long s_temp = 0  ;
        int dim = 0 ;


        for (int k=0 ; k < (T.length-i) ; k++){

            int[] arr_range = Arrays.copyOfRange( T[i+k] , j, j+k+1 ) ;
//            for (int a=0; a<arr_range.length;a++)
//            { System.out.print(arr_range[a] +" ");  }
//            System.out.println("\nrow_sum =" + IntStream.of(arr_range).sum() );

            s_temp += IntStream.of(arr_range).sum() ;

//            System.out.println("\ns_temp = "+  s_temp + "   T.len = " +T.length + "    arr_range.len =" + arr_range.length +"\n");

            if ( s_temp < S){
                S = s_temp ;
                dim = k+1 ;
//                System.out.println("\nrow, col =" + i + " " + j + "    ; len_row = " +k+1 + "    s_temp = " + s_temp  ) ;
            }
        }

        long[] sum_dim = new long[2] ;
        sum_dim[0] = S ;
        sum_dim[1] = dim ;

//        System.out.println("Smallest Sum = " + S);
        return sum_dim ;
    }


    public static long smart_brute_force(int[][] T, int min_dim){

        long SUM = (long) Math.pow(10, 8) ;
        long temp_sum = 0 ;
        long dim = 0 ;


        for ( int row=0 ; row < T.length-min_dim ; row++ ){
            System.out.println("we are at the row : " + row);
            if ( row == 8) { break ; }
            for (int col =0 ; col <= row ; col++  ){
                long[] arr = new long[2] ;
                arr = find_triangle_position_going_down(T, row, col ) ;
                temp_sum = arr[0] ;
                dim = arr[1] ;

                if ( temp_sum < SUM ){
                    SUM = temp_sum ;
                    System.out.println("---- row, col , dim =  "+ row +"  "+ col+"  "+ dim +"  -->   " + SUM );
                    }
            }
        }
    System.out.println("\n\nSmallest possible minimum-sum : \t" + SUM );

    return SUM  ;
    }



    public static void main(String[] args) {

        System.out.println("Create and print the triangle using the Linear_Congruential_Generator :\n");

        double t1 = System.nanoTime() ;

        // GENERATING THE TRIANGULAR ARRAY with dimensions 1000 :
        int[][] triang = new pb150_Searching_a_triangular_array().create_2D_triangle(1000) ;
//        printArray2D(triang);
        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );

        System.out.println("\n__________________________");
//        System.out.println("Triangle sum : " +   find_triangle_position_going_down(triang, 1,0 ) ) ;
        long[] result =  find_triangle_position_going_down(triang, 0,0 ) ;
        System.out.println("Smallest sum = " + result[0] + "   dim = " + result[1]);


        System.out.println("\n========= MY FIRST SOLUTION, SMART BRUTE FORCE ============");
        double t2 = System.nanoTime() ;

        smart_brute_force(triang, 1) ;

        System.out.println("\nCompleted in  " + (System.nanoTime() - t2)/1e6 + "  ms" );
    }


}
