package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 25-05-2017 , 12:02 PM.


/**
 * Class that compares the execution time of the linear and binary search algorithms
 * when:
 * Searching for the first element, an element at the middle and the last element
 */


/**
Search Algorithms. Complexity (non graded activity)

Now, we will focus on the number of operations performed by both algorithms:
 linear search algorithm and binary search algorithm.

Below, you can find the implementation of both algorithms and the comparison of the number of sentences
 for different cases. What happens if the value we are looking for is at the beginning of the array,
 in the middle of the array or at the end of the array? Which algorithm is better? Why? In which cases?

Try changing the size of the array. Can you estimate the complexity of the linear search algorithm?
 And the complexity of the binary search algorithm?

Which algorithm is better when we are searching for a value that is not in the array?
 */

public class SearchComp {

    private static int num;

    public static void clearNum(){
        num = 0;
    }

    public static int getNum(){
        return num;
    }

    public static int linear(int[] array, int search) {

        for (int i=0; i<array.length; i++) {
            num++;
            if(array[i]==search) {
                return i;
            }
        }
        return -1;
    }

    public static int binary(int[] array, int search) {

        int low = 0;
        int high = array.length - 1;

        while(high >= low) {
            num++;
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

        // create sorted array
        int array[] = new int[10000];
        int previous = 0;

        for(int i=0; i<array.length; i++) {
            array[i] = previous+(int) ((Math.random() +1.0)*5.0);
            previous = array[i];
        }

        int toSearch;
        int nLinear, nBinary;

        System.out.format("%25s %20s %20s\n","Case", "Iter Linear", "Iter Binary");

        // Search first element
        toSearch = array[0];
        clearNum();
        linear(array, toSearch);
        nLinear = getNum();

        clearNum();
        binary(array, toSearch);
        nBinary = getNum();


        System.out.format("%25s %20d %20d\n","First element", nLinear,nBinary);

        // Search an element in the middle
        toSearch = array[(int)array.length/2];

        clearNum();
        linear(array, toSearch);
        nLinear = getNum();

        clearNum();
        binary(array, toSearch);
        nBinary = getNum();

        System.out.format("%25s %20d %20d\n","Element in the middle", nLinear,nBinary);

        // Search for the last element
        toSearch = array[array.length-1];

        clearNum();
        linear(array, toSearch);
        nLinear = getNum();

        clearNum();
        binary(array, toSearch);
        nBinary = getNum();
        System.out.format("%25s %20d %20d\n","Last element", nLinear,nBinary);

    }
}

