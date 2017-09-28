package WEEK_08;

//  Created by Bogdan Trif on 25-05-2017 , 11:28 AM.


/**
 * Class that compares the execution time of the linear and binary search algorithms
 * when:
 * Searching for the first element, an element at the middle and the last element
 */


/**
Search Algorithms. Execution Time (non graded activity)

There are different strategies to calculate if a given value is within a sorted array
and also its position within the array.
For example, we can traverse the whole array implementing a linear search algorithm
(that is a special case of searching by brute force). Alternatively, we can implement a binary search algorithm.

Below, you can find the implementation of both algorithms and the comparison of their execution time
for different cases. What happens if the value we are looking for is at the beginning of the array,
in the middle of the array or at the end of the array? Which algorithm is better? Why? In which cases?

Which algorithm is better when we are searching for a value that is not in the array?
 */

public class SearchTime {

    public static int linear(int[] array, int search) {

        for (int i=0; i<array.length; i++) {
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

        long startTime, endTime;
        float timeLinear, timeBinary;
        int toSearch;
        int times = 10000;

        System.out.format("%25s %20s %20s\n","Case", "Ex. time Linear", "Ex. time Binary");

        // Search first element
        toSearch = array[0];

        // LINEAR
        startTime= System.nanoTime();
        for(int i=0; i < times; i++) {
            linear(array, toSearch);
        }
        endTime = System.nanoTime();

        timeLinear = ((float) (endTime-startTime))/times;

        // BINARY
        startTime= System.nanoTime();
        for(int i=0; i<times; i++) {
            binary(array, toSearch);
        }
        endTime = System.nanoTime();

        timeBinary = ( (float) (endTime-startTime))/times;

        System.out.format("%25s %20f %20f\n","First element", timeLinear,timeBinary);



        // Search an element in the middle
        toSearch = array[(int)array.length/2];

        // LINEAR
        startTime= System.nanoTime();
        for(int i=0; i < times; i++) {
            linear(array, toSearch);
        }
        endTime = System.nanoTime();

        timeLinear = ((float) (endTime-startTime))/times;

        // BINARY
        startTime= System.nanoTime();
        for(int i=0; i<times; i++) {
            binary(array, toSearch);
        }
        endTime = System.nanoTime();

        timeBinary = ( (float) (endTime-startTime))/times;

        System.out.format("%25s %20f %20f\n","Element in the middle", timeLinear,timeBinary);

        // Search for the last element
        toSearch = array[array.length-1];

        // LINEAR
        startTime= System.nanoTime();
        for(int i=0; i<times; i++) {
            linear(array, toSearch);
        }
        endTime = System.nanoTime();

        timeLinear = ((float) (endTime-startTime))/times;


        // BINARY
        startTime= System.nanoTime();
        for(int i=0; i<times; i++) {
            binary(array, toSearch);
        }
        endTime = System.nanoTime();

        timeBinary = ( (float) (endTime-startTime))/times;

        System.out.format("%25s %20f %20f\n","Last element", timeLinear,timeBinary);

    }
}

