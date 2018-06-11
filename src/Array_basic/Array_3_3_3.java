package Array_basic;

/**
 * Created by Bogdan on 4/26/2017.
 */
public class Array_3_3_3 {

    public static void main(String[] args) {

        int[] array = new int[] {11, 22, 33, 44, 44};
        double average = 0;
        double sum = 0;
        int count = 0;
        for (int element : array){
            if (element % 2 != 0) {
                count++;
                sum += element;
            }
        }
        if (count > 0){
            average = sum / count;
        }
        System.out.println(average);

    }

}
