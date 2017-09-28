package Project_Euler;

//  Created by Bogdan Trif on 01-09-2017 , 8:37 PM.
// Solved by Bogdan Trif @  Completed on Fri, 1 Sep 2017, 22:15
// The  Euler Project  https://projecteuler.net

/*            Path sum: three ways        -       Problem 82
NOTE: This problem is a more challenging version of Problem 81.
The minimal path sum in the 5 by 5 matrix below, by starting in any cell in the left column and
finishing in any cell in the right column, and only moving up, down, and right, is indicated in red and bold;
the sum is equal to 994.

131 673 234 103 18
201 96  342 965 150
630 803 746 422 111
537 699 497 121 956
805 732 524 37  331

Find the minimal path sum, in matrix.txt (right click and "Save Link/Target As..."),
a 31K text file containing a 80 by 80 matrix,
from the top left to the bottom right by only moving right and down.                */



import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pb082_Path_sum_three_ways {


    static void printArray1D(int array[]){
        System.out.print("[ ");
        for (int element:array){
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

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


    private static int[][] read_File_and_fill_matrix(File fin) throws IOException {
        String grid_number = null ;
        FileInputStream fis = new FileInputStream(fin);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;

        int count = 0 ;
        int[][] grid = new int[80][80] ;

        while ((line = br.readLine()) != null) {
            String[] line_split =  line.split(",");
            int[] line_ints = new int[line_split.length]; //Used to store our ints
//            System.out.println("the length of the line is : " + line_ints.length);

            for (int i=0 ; i< line_split.length ; i++ ){
                line_ints[i] = Integer.parseInt(line_split[i]) ;
//                System.out.print("\tcnt="+ (count)+", "+" nr="+ line_ints[i] );
                grid[ count ][i] = line_ints[i] ;
            }
            count++ ;       // count var is the line number --> this increments line number
        }
//        printArray2D(grid);
        br.close();
    return grid ;
    }


    private static int three_ways_path(int[][] matrix){

        int[][] M = matrix ;
        int gridSize = M.length ;
        int sol[] = new int[80] ;


//        for (int i=0 ; i<sol.length; i++ ){
//            System.out.print(sol[i] + " ");
//        }
        //   initialize solution :
        for (int i=0 ; i< gridSize ; i++ ){
            sol[i] = M[i][gridSize - 1] ;
        }


        for (int i = gridSize-2 ; i>=0 ; i-- ){
        //   Traverse down :
            sol[0] += M[0][i] ;
            for (int j= 1 ; j< gridSize ; j++) {
//                sol[j] = min ( sol[j - 1] + M[j][i], sol[j] + M[j][i] ) ;
                List<Integer> lst = Arrays.asList(sol[j - 1] + M[j][i], sol[j] + M[j][i] );
                sol[j] = Collections.min(lst) ;

            }

            //   Traverse up :
            for (int j = gridSize-2; j>=0 ; j--){
                List<Integer> lst = Arrays.asList(sol[j], sol[j+1] + M[j][i] ) ;
                sol[j] = Collections.min(lst) ;
            }
        }

        System.out.println("The Complete path is : ") ;
        printArray1D(sol);
        int min = (int) Math.pow(10, 10) ;
        for (int i=0 ; i<sol.length ; i++){
            if (sol[i] < min) {
                min = sol[i] ;
            }
        }
        System.out.println("\nThe minimal path is : \t" + min ) ;


    return min ;
    }


    public static void main(String[] args) throws IOException {
        //use . to get current directory
        File dir = new File(".");
        File fin = new File(dir.getCanonicalPath() +  "/src/Project_Euler/pb086_matrix.txt");

        double t0 = System.nanoTime() ;
        int[][] M = read_File_and_fill_matrix(fin) ;
//        printArray2D(M);


        three_ways_path(M) ;

        System.out.println("\n Completed in  " + (System.nanoTime() - t0)/1e6 + "  ms" );

    }

}


