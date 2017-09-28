package CONDITIONALS_and_LOOPS;

/**
 * Created by Bogdan on 4/26/2017.
 */
public class For_while {
    public static void main(String[] args) {
        int number = 2122848 ;


        for (int factor = 2; factor <= number; factor++) {

            int count = 0 ;
            while (number % factor == 0) {

                count++ ;
                number = number / factor;

                if (count == 1 ) {
                    System.out.println("number=  " + number + "  factor = " + factor + "  count=" + count);
                }
            }
        }

    }
}
