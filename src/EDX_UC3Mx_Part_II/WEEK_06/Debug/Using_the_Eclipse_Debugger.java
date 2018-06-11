package EDX_UC3Mx_Part_II.WEEK_06.Debug;

/**
 * Created by Bogdan Trif on 11-05-2017 , 11:28 AM.
 */
public class Using_the_Eclipse_Debugger {

    public static int foo(int n){
        if (n < 1){
            return 0;
        } else {
            return 1 + foo(n / 10);
        }
    }
    public static void main(String[] args){
        System.out.println(foo(123));
    }

}
