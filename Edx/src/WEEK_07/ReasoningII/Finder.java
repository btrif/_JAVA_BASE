package WEEK_07.ReasoningII;

/**
 * Created by Bogdan Trif on 18-05-2017 , 10:30 AM.
 */
/**
 * This class provides functions to search
 * minimum number in an array of integers.
 *
 * @author UC3M MOOC Team
 * @since 2016-04
 *
 */
public class Finder {

    /**
     * Find the minimum element in an array.
     *
     * @param a the array to search in
     * @return the minimum element of a
     */
    public int findMinimumElement(int[] a) {

        // Your task (you can find these indications below in the line):
        // 1. Add an assertion that verifies that "a" array is not empty
        assert a.length > 0 && a != null ;
        // 2. Add an assertion that verifies the loop invariant (k < n)

        // 3. Add an assertion that verifies the postcondition


        //Substitute this line for checking that "a" array is not empty.

        int min = a[0];
        int k = 1;

        int n = a.length-1 ;
        // loop through the array and look at each element
        while (k != n) {
            //Substitute this line with an assertion for the class invariant
            assert k < n ;
            if (a[k] < min) {
                // current array element is lesser than any we've seen before
                // so we store it as the new minimum element
                min = a[k];
            }
            k++;
        }

        //Substitute this line with an assertion for the loop postcondition
        assert k ==n ;
        return min;
    }

}

