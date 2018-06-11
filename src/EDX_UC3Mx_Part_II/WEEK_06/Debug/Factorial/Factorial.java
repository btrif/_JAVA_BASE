package EDX_UC3Mx_Part_II.WEEK_06.Debug.Factorial;

/**
 * Created by Bogdan Trif on 11-05-2017 , 12:36 PM.
 */
public class Factorial {

    public static void main(String[] args) {

        int n = (int) (Math.random()*10);
        int result = 1;
        System.out.println("Value of n: "+n);
        while(n>1){
            result = result*(n);
            n-=1 ;
        }
        System.out.println("Value of n!: "+result);
    }
}
