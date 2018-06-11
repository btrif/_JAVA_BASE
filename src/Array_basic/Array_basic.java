package Array_basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Bogdan Trif on 27-04-2017 , 12:54 PM.
 */
public class Array_basic {

    // allocates memory for 10 integers / Creates an empy array of 10 integers
    int[] anArray = new int[10];


    // Creates an array of consecutive numbers
    public int[] consecutiveNumbers( int a ) {
        int[] lst = new int[a] ;
        for (int i = 0; i < a; ++i) {
            lst[i] = i;
        }
        return lst;
    }


    //   THE ARRAY - Print Array Method
    public static void printArray1D(int array[]){
        System.out.print("[ ");
        for (int element:array){
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    public static void printArray2D(int array[][]){
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


    // Returning the maximum value of the array
    static double maximum_of_array(double[] array) {
        double var = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > var) {
                var = array[i];
            }
        }
        return var;
    }


    public static void main(String[] args){
        // Initialize and Reserve the space for an array :
        int[] A = new int[4];
        printArray1D(A);

        // Method 1 - JAVA 8 Only Create an array of Consecutive Numbers  :
        int[] B = IntStream.range(1, 30).toArray();
        printArray1D(B);

        // Method 2 - The most basic method - Create an array of Consecutive Numbers  :
        System.out.println("\nMethod 2 - The most basic method - Create an array of Consecutive Numbers  :");
        int[] C = new Array_basic().consecutiveNumbers(20);
        printArray1D(C);

        // 2 Dimensional Nested Array filled with 0's :
        int[][] D = new int[4][7];
        printArray2D( D ) ;


        // ======  Make a copy of an array ======
        // Method I
        int[] src  = new int[]{1,2,3,4,5};
        int[] dest = new int[5];

        System.arraycopy( src, 0, dest, 0, src.length );
        System.out.println("\nMake a copy of an array - Method I :" );
        printArray1D(dest) ;
        //Method II
        System.out.println("\nMake a copy of an array - Method II :" );
        int[] a = new int[]{1,2,3,4,5};
        int[] b = a.clone();
        printArray1D(b);

        //Method III - May be faster
/**        Arrays.copyOf may be faster than a.clone() on small arrays.
        Both copy elements equally fast but clone() returns Object so the compiler has to insert
        an implicit cast to int[]. You can see it in the bytecode, something like this:
        ALOAD 1
        INVOKEVIRTUAL [I.clone ()Ljava/lang/Object;
        CHECKCAST [I
        ASTORE 2            */

        System.out.println("\nMake a copy of an array - Method III - BEST :" );
        int[] lst1 = new int[]{1,2,3,4,5};
        int[] lst2 = Arrays.copyOf(lst1, lst1.length) ;
        printArray1D(lst2);

        System.out.println();

    // Sum of a list (array )       ######################
        int[] aa = {10,20,30,40,50};
        int sum = IntStream.of(aa).sum();
        printArray1D(aa);
        System.out.println("The sum is " + sum);

        // Creation of a random array of length 5
        System.out.println("\n------   Creation of a random array of length 5 ---------");
        double X[] = new double[5];
        for (int i=0; i<X.length; i++) {
            X[i] = (double) Math.random() *500;
            System.out.print(X[i]+" ");
        }

        // SIMPLEST WAY - REDUCE the Array :
        double Sum = 0 ;
        for (double elem : X) {
            Sum += elem ;
        }
        System.out.println("\nThe sum of the array X is :  " + Sum);



        //   Returning the maximum value of the array
        System.out.println("\nThe maximum value of the array is : " + maximum_of_array(X) );


        // Array Range, Get the array range of a list(array) :

        int[] array_range = Arrays.copyOfRange(aa, 2, 4);
        System.out.println("Initial array is :");
        printArray1D(aa);
        System.out.println("Array range of the initial array is :");
        printArray1D(array_range);


        // Minimum and Maximum of a list :
        // METHOD I
        System.out.println("\n------ Minimum and maximum of a list ----------------");
        System.out.println("Initial array : ");
        List<Integer> lst = Arrays.asList(100,2,3,4,5,6,7,67,2,32);
        System.out.println(lst);

        int min = Collections.min(lst);
        int max = Collections.max(lst);

        System.out.println("Minimum of list " + min );
        System.out.println("Maximum of list " + max );



    }

}
