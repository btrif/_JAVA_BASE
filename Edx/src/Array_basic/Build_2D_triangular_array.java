package Array_basic;

//  Created by Bogdan Trif on 01-09-2017 , 9:26 AM.


public class Build_2D_triangular_array {

    static public int[][] create_2D_triangle (int dim){
        int t = 0 ;
        int s ;
        int[][] triang = new int[dim][] ;

        for (int row=0; row< dim ; row++){
            triang[row] = new int[row+1] ;

            for (int col = 0 ; col<triang[row].length ;col++ ){
                t = (int)  ( ( 615949 *  t + 797807) % (Math.pow(2, 20)) ) ;
                s = (int) (t - Math.pow(2, 19) );
                triang[row][col] = s;
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

    // VOID MAIN EXECUTION
    public static void main(String[] args) {

        // Creates a TRIANGULAR ARRAY of specified size and fills is with firs consecutive numbers :
        int dim = 10 ;
        int nr = 0 ;
        int[][] triangle = new int[dim][] ;

        for (int row=0; row< dim ; row++){
            triangle[row] = new int[row+1] ;
            for (int col = 0 ; col<triangle[row].length ;col++ ){
                triangle[row][col] = nr;
                nr++;
            }
        }
        printArray2D(triangle);

        System.out.println("\n\n--------------------");
        System.out.println("Create and print the triangle using the Linear_Congruential_Generator\n");

        double t1 = System.nanoTime() ;

        int[][] triang = new Build_2D_triangular_array().create_2D_triangle(10) ;
        printArray2D(triang);
        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );
    }

}
