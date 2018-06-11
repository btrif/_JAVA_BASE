package EDX_UC3Mx_Part_II.WEEK_06;

/**
 * Created by Bogdan Trif on 09-05-2017 , 11:39 AM.
 */
public class Trace_by_Hand {

//    int rem (int m, int n) {        // without static before function declaration gives :
                                // non-static method cannot be referenced from a static context
/**
In the method intDiv, we reassigned values to two variables x and y in the loop.
At the end we returned y. Returning x instead of y is also interesting.
The value of x at the end of the execution represents the remainder of the integer division of m by n.
    */

    static int rem (int m, int n) {

        int x=m;
        int y=0;
        while (x>=n){
            x=x-n;
            y=y+1;
        }
        return x;
    }

/** The following method receives a number and an array. It calculates for each array position,
 i, the integer division of the number received and the i-th element of the input array
 and stores the result in the ith position of arrayResults.
 When the method finishes, it returns arrayResults.                          */

    static int[] divisions(int number, int[] array){  // Method (Function) Declaration
    int [] arrayResults = new int[array.length];
    for (int k = 0; k < array.length; k++) {  // This is how we assign elements in the array
        arrayResults[k] = number/array[k];
    }
    return arrayResults;
}


// Consider the following code in which a factorial of a number is computed.
// If the number is greater than 9, it should return 1 and not calculate it.

    public static int factorial (int number) {
        if (number==0 || number>9)
            return 1;
        else
            return number * factorial(number-1);
    }



    // MAIN METHOD
    public static void main(String[] args) {
        System.out.println( rem(45,12)) ;
        System.out.println();

        // Array Division
        int [] arr = {5, 12, 45, 1};
        int [] array = divisions(154, arr);
        for (int i = 0 ; i< array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n");

        //Factorial
        System.out.println( factorial(5) );



    }

}
