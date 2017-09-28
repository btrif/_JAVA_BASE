package Array_basic;

/**
 * Created by Bogdan on 4/26/2017.
 */
public class Array_average {        // Example 2.2.3



        public static void main(String[] args) {

            int[] array = new int[] {11, 22, 33, 44, 55};
            double average = 0;
            for (int element : array){
                average += element;
            }
            if (array.length > 0){
                average = average / array.length;
            }
            System.out.println(average);


    }
}
