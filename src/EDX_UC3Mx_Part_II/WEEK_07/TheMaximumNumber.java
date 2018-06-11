package EDX_UC3Mx_Part_II.WEEK_07;

/**
 * Created by Bogdan Trif on 17-05-2017 , 5:25 PM.
 */
public class TheMaximumNumber {

    //Postcondition: a[x] is the maximum of a[0...n]


    public static void main(String[] args) {
        int[] a = {2,6,23,5,21,6,34,8,76,9} ;
        int n = a.length-1 ;
        int k = 0;
        int x = k;
        while (k < n) {
//        for (x=0; x != n-1; x++) {
            k = k+1;
            if (a[k] > a[x]) {
                x = k;

            }
            System.out.println("x =  " + x);
        }

    }




}
