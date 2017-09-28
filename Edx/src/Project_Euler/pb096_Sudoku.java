package Project_Euler;

//  Created by Bogdan Trif on 03-07-2017 , 12:14 PM.



import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class pb096_Sudoku {

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

    static void show_Complete(int array[][], String grid_nr ) {
        System.out.println("\n============  "  + grid_nr +"  =============" );
        for (int[] i :array) {
            System.out.print("++++   ");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("  ++++");
        }
        System.out.println("===============================" );
    }


    public static boolean find_empty_location (int array[][], int L[]){
        // L is the current position of the cursor, array of the form L = [3,4]
        for (int row = 0 ; row < 9 ; row++){
            for (int col = 0 ; col < 9 ; col++){
                if ( array[row][col] == 0 ) {
                    L[0] = row ;
                    L[1] = col ;
                    return true ;
                }
            }
        }
        return false ;
    }


    public static boolean used_in_row( int array[][], int row, int num) {
        /**  Returns a boolean which indicates whether any assigned entry
         in the specified row matches the given number. */
        for (int i = 0; i < 9; i++) {
            if (array[row][i] == num) {
                return true;
            }
        }
    return false;
    }

    public static boolean used_in_col( int array[][], int col, int num) {
            /**  # Returns a boolean which indicates whether any assigned entry
             # in the specified column matches the given number.  */
            for (int i = 0; i < 9; i++) {
                if (array[i][col] == num) {
                    return true;
                }
            }
        return false;
        }

    public static boolean used_in_box( int array[][], int row, int col, int num) {
        /**   Returns a boolean which indicates whether any assigned entry
          within the specified 3x3 box matches the given number  */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[ i+row-row%3 ][ j+col-col%3 ] == num) {
//                    System.out.println("row="+ (i+row-row%3) + "   col=" + (j+col-col%3) + "    num=" + num);
                    return true ;
                }
            }
        }
        return false;
        }


    public static boolean check_location_is_safe(int array[][], int row, int col, int num) {
        /**  Check if 'num' is not already placed in current row,
           current column and current 3x3 box          */

//        boolean A = used_in_row(array, row, col) ;
        return ( !used_in_row(array, row, num) && !used_in_col(array, col, num) &&
                !used_in_box(array, row, col, num) );

    }

/** ######## ============= THE MAIN BACKTRACKING ALGORITHM ======== ######## */
    public static boolean solve_sudoku(int Grid[][]) {
        // 'L' is a list variable that keeps the record of row and col in find_eGridpty_location Function
        int[] L = { 0, 0 } ;
       // If there is no unassigned location, we are done
        if ( !find_empty_location(Grid, L ) ) {
            return true ;
            }
        //  We assign list values to row and col that we got from find_empty_location function
        int row = L[0] ;
        int col = L[1] ;
        for (int i=0; i < L.length ;  i++){
//            System.out.print(L[i]+" ");

        }

        for (int num=1; num< 10; num++ ){
            if (check_location_is_safe(Grid, row, col, num ) ) {
            // make tentative assignment
                Grid[row][col] = num ;
         //  Return If Success
                if ( solve_sudoku(Grid)  ) {      // RECURSIVE CALL
                    return true;
                }
        // IF failure, unmake & try again, this triggers backtracking
                Grid[row][col] = 0 ;
                }
            }

//        show_Complete(Grid, 12) ;
        return false ;
        }


    private static void readFile1(File fin) throws IOException {
        String grid_number = null ;
        FileInputStream fis = new FileInputStream(fin);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;

        int count = 0 ;
        int[][] grid = new int[9][9] ;
        int SUM = 0 ;


        while ((line = br.readLine()) != null) {

            if (line.startsWith("G")) {
                grid_number = line ;
                System.out.println("\n======= " + grid_number + " ==========");

            } else  {
                if (count%9 ==0){
                grid = new int[9][9] ;
                count= 0 ;
                }

                String[] line_split =  line.split("");
                int[] line_ints = new int[line_split.length]; //Used to store our ints
//                System.out.println();

                for (int i=0 ; i< line_split.length ; i++ ){

                    line_ints[i] = Integer.parseInt(line_split[i]) ;
//                    System.out.print("\tcnt="+ (count)+", "+count +" nr="+ line_ints[i] );
                    grid[count ][i] = line_ints[i] ;
                }
                    count++ ;

                    if ( count%9 ==0 ) {
                        printArray2D(grid);
                        if ( solve_sudoku(grid ) ) {
                            show_Complete(grid, grid_number );
                            int[] top_left = Arrays.copyOfRange(grid[0], 0, 3);

                            String A = Int_Array_to_String(top_left, "");
                            int B = Integer.parseInt(A) ;
                            System.out.println("the string : \t" + A +"    & the int : \t" + B);
                            SUM += B ;

                        }
                    }
            }
        }
        br.close();
        System.out.println("\n The final sum is : \t" + SUM);
    }


    public static void main(String[] args) throws IOException {
        int M[][] = new int[][] {{6, 3, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 5, 0, 0, 0, 0, 8}, {0, 0, 5, 6, 7, 4, 0, 0, 0}, {0, 0, 0, 0, 2, 0, 0, 0, 0}, {0, 0, 3, 4, 0, 1, 0, 2, 0}, {0, 0, 0, 0, 0, 0, 3, 4, 5}, {0, 0, 0, 0, 0, 7, 0, 0, 4}, {0, 8, 0, 3, 0, 0, 9, 0, 2}, {9, 4, 7, 1, 0, 0, 0, 8, 0}} ;
        int N[][] = new int[][] {{3, 6, 1, 7, 2, 5, 9, 4, 8}, {5, 8, 7, 9, 6, 4, 2, 1, 3}, {4, 9, 2, 8, 3, 1, 6, 5, 7}, {6, 3, 8, 2, 5, 9, 4, 7, 1}, {1, 7, 4, 6, 8, 3, 5, 9, 2}, {2, 5, 9, 1, 4, 7, 8, 3, 6}, {7, 4, 6, 3, 9, 2, 1, 8, 5}, {9, 2, 3, 5, 1, 8, 7, 6, 4}, {8, 1, 5, 4, 7, 6, 3, 2, 9}} ;

        System.out.println("____________");
        System.out.println("find_empty_location : \t" + find_empty_location(N, new int[]{0,0}) );
        System.out.println( "Used in a row : \t" + used_in_row(M, 0, 3) + "\t" +used_in_row(N,0,3));
        System.out.println( "Used in a col : \t" + used_in_col(M, 0, 5) + "\t" + used_in_col(N,0,5));

        System.out.println( "\nUsed in a box : \t" + used_in_box(M, 1, 1, 3) + "\t" + used_in_box(N,1,1, 3));
        System.out.println( "Used in a box : \t" + used_in_box(M, 2, 2, 6) + "\t" + used_in_box(N,2,2, 6));
        System.out.println( "Used in a box : \t" + used_in_box(M, 7, 7, 7) + "\t" + used_in_box(N,7,7, 7));

        System.out.println( "\ncheck_location_is_safe : \t" + check_location_is_safe(M, 1, 1, 8) + "\t" + check_location_is_safe(N,1,1, 8));
        System.out.println("____________");

//        M[1][1] = 111 ;
        double t0 = System.currentTimeMillis() ;
        double t1 = System.nanoTime() ;

        if (solve_sudoku(M) == true ){
            show_Complete(M , "555") ;
        }
        System.out.println("\n Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );
//        System.out.println("\n Completed in  " + (System.currentTimeMillis() - t0) + "  ms" );

        //use . to get current directory
        File dir = new File(".");
        File fin = new File(dir.getCanonicalPath() +  "/src/Project_Euler/pb096_Sudoku.txt");

        double t2 = System.nanoTime() ;
        readFile1(fin) ;

        System.out.println("\n Completed in  " + (System.nanoTime() - t2)/1e6 + "  ms" );

        System.out.println("\nThe complete path of the file : \t"+ fin);
    }
}


// The final sum is : 	24702
//Completed in  116.861181  ms