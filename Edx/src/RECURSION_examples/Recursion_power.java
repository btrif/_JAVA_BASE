package RECURSION_examples;

/**
 * Created by Bogdan on 4/26/2017.
 */
public final class Recursion_power {

    public static void main(String[] args){
        int x = 32 ;
        int y = 6 ;
        System.out.println( "x= "+ x +  ";   y=" + y  ) ;
        System.out.println("\n"+ x +"^" + y +" = "
                + new Recursion_power().power(x, y) ) ;
        System.out.println( y + "!  = " +new Recursion_power().factorial(y)   ) ;
        System.out.println( x + "!  = " +new Recursion_power().fac(x)   ) ;
        System.out.println( x + "!  = " +new Recursion_power().factorial(x)   ) ;
        System.out.println( new Recursion_power().fac(9) );

    }

    public int power(int x, int y) {
        if ( y==0 ){
            return 1 ;
        }
        else {
            return x * power(x, y-1) ;
        }

    }

    long factorial(int number) {
        if (number == 1) {
            return 1;
        } else {

            return number * factorial(number - 1);
        }
    }

    double fac (int n) {
        if (n <= 1) return 1;
        else return n * fac(n - 1);
    }


}
