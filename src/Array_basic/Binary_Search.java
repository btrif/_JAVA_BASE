package Array_basic;

//  Created by Bogdan Trif on 25-05-2017 , 11:43 AM.


public class Binary_Search {

    public static int binary(int[] array, int search) {

        int low = 0;
        int high = array.length - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            if(array[middle] == search) {
                return middle;
            } else if(array[middle] < search) {
                low = middle + 1;
            } else  {
                // enter here if array[middle] > search
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int A[] = new int[100] ;
        for (int i=0 ; i<A.length; i++){
            A[i] = (int) ( (Math.random()+1.0)*50 ) ;
            System.out.print(A[i]+" ");
        }
        System.out.println("\n------------");
        System.out.println(binary( A , 64) );


    }
}
