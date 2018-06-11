package EDX_UC3Mx_Part_II;

import java.util.stream.IntStream;

/**
 * Created by Bogdan Trif on 27-04-2017 , 11:32 AM.
 */
public class Exam_3 {

    public static void main(String[] args) {
        System.out.println("\n==========  PROBLEM 1 ==========");
        int k = 7 ;
        double m = Math.pow(10, k) ;

        System.out.println( "foo m = "+ m +" :  " + new Exam_3().foo(m) )  ;
        System.out.println("----------------------");


        String s = new String("Hello");
        int num = 6;
        int [] array = {1, 2, 3, 4};
        int result = 0;
        result = new Exam_3().foo2(s, num, array);
        System.out.println(  "foo2  result = " + result ) ;
        System.out.println("s = " + s + "  " + s.length() );
        System.out.println("num = " + num + "  "  );
        System.out.print("the modified array : \t");
        new Exam_3().printArray(array) ;

        System.out.println("\n==========  PROBLEM 2 ==========");

        System.out.println("\n-----------Question 1 -----------");
        int[] lst = {11,12,13,14} ;
        int res3 = new Exam_3().foo3( lst, 112 ) ;
        System.out.println(  "foo3  result = " + res3 ) ;

        System.out.println("\n----------Question 2 ------------");

        int[] B = IntStream.range(0, 14).toArray();
        new Exam_3().printArray(B);
        int res4 = new Exam_3().foo3( B, 12 ) ;
        System.out.println(  "foo3  res4 = " + res4 ) ;
        int[] C = { 27,23,22,22,32,41,19,47,33,32,42,51,24, 64, 22, 21, 18 } ;
        new Exam_3().printArray(C);
        int res5 = new Exam_3().foo3( C, 12 ) ;
        System.out.println(  "foo3  res5 = " + res5 ) ;

        System.out.println("\n==========  PROBLEM 3 ==========");
        System.out.println("\n---------- Question 1 ------------");
        int [] arr = {25, 7, 7, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
        new Exam_3().printArray(arr);

        System.out.println( new Exam_3().countSorted(arr) );

        System.out.println("\n==========  PROBLEM 4 ==========");
        System.out.println("\n---------- Question 1 ------------");
//        int [] arr3 = {6, 2, 4 , 6, 5, 2 , 3 ,4, 4, 6, 9, 4, 8 } ; // case III
//        new Exam_3().bar( arr3 , 1, 8 ) ;           // case III
//        int [] arr2 = {6, 2, 4 , 6, 5, 2 , 3 ,4, 4, 6, 9, 4, 8 } ; // case II
//        new Exam_3().bar( arr2 , 1, 2 ) ;   // // case II
        int [] arr1 = {3, 4, 2  } ; // case I
        new Exam_3().bar( arr1 , 1, 5 ) ;   // case I

    }

    // FIRST METHOD
    double foo(double n){
        if (n < 1){
            return 0;
        } else {
            return 1 + foo(n / 10);
        }
    }


    //   THE ARRAY - Print Array Method
    void printArray(int array[]){
        System.out.print("[ ");
        for (int element:array){
            System.out.print(element + " ");
        }
        System.out.println("]");

    }

    // SECOND METHOD II

    int foo2(String x, int number, int[] array){
        number = array.length;
        x = x + "xAtfoo";
        System.out.println("number = " + number );
        System.out.println("x = " + x + "  " + x.length() );

        for (int i=0; i < number; i++){
            array[i] = array[i] + x.length();
        }
        x = x + "Success";
        System.out.println("x = " + x + "  " + x.length() );


        return x.length();

    }

    // THIRD METHOD
    int foo3(int[] array, int num){
        int i = array.length - 1;
        while (i >= 0){
            if (array[i] > num){
                System.out.println("i = " + i );
                return i;
            }
            i--;
            System.out.println("i2 = " + i );
        }
        return i;
    }

    // FOURTH METHOD
    int countSorted(int[] array){
        int count = 1;
        int max = 1;
        for (int k = 1; k < array.length; k++) {
            if (array[k-1] <= array[k]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if ( count > max ) {
            max = count;
        }
        return max;
    }

    // FIFTH METHOD
    /** Precondition: array contains only positive values.
     * @param num a positive int
     */
    void bar(int[] array, int num, int lim){
        int i = 0;
        int v = 0;
        while ((i < array.length) && (array[i] + num < lim)){
            if (array[i] <= array[v]){
                v = i; /* Statement A */
                System.out.println("statement A --> v = "+ v + "  i=" + i);
            }
            i++; /* Statement B */
            System.out.println("statement B --> v = "+ v + "  i=" + i);
        }
        System.out.println(v);
    }


}
