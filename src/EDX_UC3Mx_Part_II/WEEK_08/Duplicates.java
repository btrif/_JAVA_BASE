package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 25-05-2017 , 10:36 AM.


/**
 Quadratic Growth (non graded activity)

This method has quadratic growth, i.e., the number of operations needed
(the number of times the inner loop performs an operation in the worst case) is array.length * array.length.

Now, it is time to check it. Change the code in order to count the operations.
How many operations do you need? How does the length of the array impact on the execution time?
 */


/**
 * Main class of the Java program.
 */

public class Duplicates {

    // Added by me (BT)
    private static int invoked = 0;

    public static void clearInvoked(){
        invoked = 0;
    }

    public static int getInvoked(){
        return(invoked);
    }


//Function to check for duplicates using an O(n^2) algorithm ( double for loop)
    public static boolean existDuplicates(int[] array){
        for (int i=0; i< array.length; i++){
            for (int j=i+1; j< array.length; j++){
                invoked++;

                if (array[i] == array[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // create array
        int array[] = new int[100];
        boolean exist;

        clearInvoked();
        for(int i=0; i<array.length; i++) {
            array[i] = (int) ( (Math.random() + 1) *50.0);
            invoked++;
            System.out.print(array[i]+" ");
        }

        clearInvoked();
        exist = existDuplicates(array);

        System.out.println("\nI.  Invokes : \t" + getInvoked());

        if (exist){
            System.out.println("\nThere are duplicates");
        }
        else{
            System.out.println("\nThere are NO duplicates");
        }

        clearInvoked();
        int previous = 0;
        for(int i=0; i<array.length; i++) {
            array[i] = previous + (int) ( (Math.random() + 1) *50.0);
            previous = array[i];
            invoked++;
            System.out.print(array[i]+" ");

        }
        System.out.println("\nII. Invokes for the O(n) algorithm (single for loop): \t" + getInvoked());

        clearInvoked();
        exist = existDuplicates(array);
        System.out.println("\nIII.  Invokes for O(n^2) algorithm (double for loop) : \t" + getInvoked());

        if (exist){
            System.out.println("\nThere are duplicates");
        }
        else{
            System.out.println("\nThere are NO duplicates");
        }

    }
}

