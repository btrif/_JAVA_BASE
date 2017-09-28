package WEEK_06.Debug.Factorial;

/**
 * Created by Bogdan Trif on 11-05-2017 , 12:37 PM.
 */

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print("The array is: ");
        for(int i=1; i<5; i++){
            int t = (int) (Math.random() * 10);
            array[i] = t;
            if(i!=5){
                System.out.print(array[i]+", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }

}
