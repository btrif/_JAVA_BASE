package Algorithms;

//  Created by Bogdan Trif on 04-09-2017 , 10:40 PM.

// Java program to print all combination of size r in an array of size n
import Array_basic.Array_basic;

import java.io.*;

class Combinations {

    public long compute_Comb(int n, int r){
        return Math_Utils.factorial(n)/(Math_Utils.factorial(r)*Math_Utils.factorial(n-r) )   ;
    }

    /* arr[] ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index ---> Current index in data[]
    r ---> Size of a combination to be printed */

    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
        // Current combination is ready to be printed, print it
        if (index == r)         {
            for (int j=0; j<r; j++) {
                System.out.print(data[j] + " ");
//                M[ind][j] = data[j] ;
            }
            System.out.println("; ");
//            ind +=1 ;
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)         {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)     {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
//        int ind = 0;
//        int[][] M = new int[(int)n][r] ;
//        Combinations N = new Combinations() ;


        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r );
//        Array_basic pr = new Array_basic();
//        pr.printArray2D(M);
    }

//    public int[] getCombinations(int arr[], int n, int r){
//
//    }

    /*Driver function to check for above function*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;




        printCombination(arr, n, r);


    }
}

/* This code is contributed by Devesh Agrawal */

