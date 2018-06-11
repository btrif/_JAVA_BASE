package EDX_UC3Mx_Part_II.WEEK_08.EXAM_08;

//  Created by Bogdan Trif on 25-05-2017 , 5:19 PM.


public class Complexity_of_Methods_I {


//    The minimum value of an array
    static int foo (int[] array){
        int tmp = array[0];
        for (int i = 1; i < array.length; i++){
            if ( tmp > array[i] ) {tmp = array[i];}
        }
        return tmp;
    }

    public static void main(String[] args) {

        int[] A = {45,4512,13,567,12,6,23,78,11} ;
        System.out.println(foo(A));
    }
}
