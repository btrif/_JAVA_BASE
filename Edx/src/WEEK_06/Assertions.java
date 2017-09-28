package WEEK_06;

/**
 * Created by Bogdan Trif on 09-05-2017 , 5:43 PM.
 */
public class Assertions {
    static boolean tm = true ;


    // Assertions - Using the print statement

    static int intDiv (int m, int n){
        int x=m; int y=0;
        while (x>=n){
            x=x-n; y=y+1;
            if (tm){System.out.println(y*n + x == m);}
        }
        if (tm){ System.out.println(x < n);}
        return y;
    }


    static int intDiv2 (int m, int n){
        int x=m; int y=0;
        while (x>=n){
            x=x-n; y=y+1;
            assert y*n + x == m;
        }
        assert x < n;
        return y;
    }




    public static void main(String[] args) {
        System.out.println( intDiv(34,6) );

        System.out.println("---------\n");

        System.out.println(intDiv2(34,6) );





    }

}
