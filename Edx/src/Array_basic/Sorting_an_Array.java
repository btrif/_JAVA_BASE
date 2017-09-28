package Array_basic;

/**
 * Created by Bogdan Trif on 17-05-2017 , 5:37 PM.
 */
public class Sorting_an_Array {


// Consider the following methods which sort the array elements in ascending order,
// by using the auxiliary method swap:


    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    void sort(int[] a, int n) {
        for(int i = 0; i < n; i++) {
            int k=1;
            while (k != n)  {
                if (a[k-1] > a[k])
                    swap(a, k-1, k);
                k = k+1;
            }
        }
    }

}
