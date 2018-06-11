package EDX_UC3Mx_Part_II.WEEK_06.Debug;

/**
 * Created by Bogdan Trif on 11-05-2017 , 1:16 PM.
 */
public class Understanding_the_Values_of_Variables {

    public static int foo(int[] array, int num){
        int i = array.length - 1;
        int count = 0;
        while (i >= 0){
            if (array[i] > num){
                return i;
            }
            i--;
            count++;
        }
        return i;
    }
    public static void main(String[] args){
//        int[] array = {1,12,3,-4,2};
        int[] array = {-4,6,1,0,-1} ;
        System.out.println(foo(array, 7));
    }


}
