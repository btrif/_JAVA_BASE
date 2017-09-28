package RECURSION_examples;

/**
 * Created by Bogdan on 4/26/2017.
 */
public final class Recursion {

    public static void main(String[] args){

        int x = 35 ;
        int y =  9 ;

        System.out.println( "Generate recursion : \r" );
        new Recursion().generate(123) ;
        System.out.println( "\nmystery recursion : " + new Recursion().mystery(3,4) ) ;
        System.out.println( "\nDivision recursion : " + new Recursion().intDiv( 79, 9) ) ;

        System.out.println("Division II : \n" ) ;
        int result[]=division(x,y);
        System.out.println( "Quotient : " + result[0] + "   Remainder :" + result[1] ) ;

    }


    /** METHOD 1
     * @param x an integer such that x >= 0
     */
    void generate(int x)    {
        System.out.print(x % 10);
        if ((x / 10) != 0) {
//            System.out.print(x +"\n");
            generate(x / 10);

        }
        System.out.print(x % 10);
    }


    /** METHOD 2
     * @param x an integer such that x >= 0
     * @param y an integer such that y >= 0
     */
    public int mystery(int x, int y)    {
        if (x == 0) {
            return y;
        }
        return mystery(x-1, y+1);
    }

    /**  METHOD 3
     * Returns the quotient of an integer division
     * @param dividend a positive int
     * @param divisor a positive int
     */
    int intDiv(int dividend, int divisor){
         if (  dividend < divisor ){
             return 0;
         }
    int tmp = dividend - divisor;
    return 1 + intDiv(tmp , divisor ) ;
    }

    /** METHOD 4
     *
     * @param dividend
     * @param divisor
     * @return
     */
    static int[] division(int dividend, int divisor){

        int result[] = {0, dividend};

        if ( dividend < divisor ){
            return result ;
        }else{
            int tmp = dividend - divisor ;
            result = division(tmp, divisor) ;
            result[0]++ ;
            return result ;






        }

    }




}
