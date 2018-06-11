package EDX_UC3Mx_Part_II.WEEK_06.EXAM_06;

/**
 * Created by Bogdan Trif on 17-05-2017 , 11:07 AM.
 */


public class factorial{
    static int factorial(int number) {
        if(number <= 1) {
            return 1;
        }
        return number * factorial(number-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

}