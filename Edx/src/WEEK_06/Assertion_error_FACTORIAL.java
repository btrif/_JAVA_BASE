package WEEK_06;

/**
 * Created by Bogdan Trif on 09-05-2017 , 5:19 PM.
 */
public class Assertion_error_FACTORIAL {

    static int factorial(int number){

        assert (number > 0) ;

        System.out.println("At factorial("+number+")");

        if (number == 1){
            return 1 ;
        }



            return number * factorial(number-1);
    }

    public static void main(String[] args){

        System.out.println( factorial(6) );
    }
}
