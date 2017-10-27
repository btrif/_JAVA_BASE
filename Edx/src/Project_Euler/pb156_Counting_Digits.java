package Project_Euler;

//  Created by Bogdan Trif on 01-10-2017 , 10:12 PM.


public class pb156_Counting_Digits {

    public static long count_digit(long n, char d){
        String s = Long.toString(n) ;
        int counter = 0;
        for( int i=0; i<s.length(); i++ ) {
            if( s.charAt(i) == d ) {
                counter++ ;
            }

        }
    return counter ;
    }

    public static long brute_force(long up_rng ){
        long cnt1=0, cnt2=0, cnt3=0, cnt4=0, cnt5=0, cnt6=0, cnt7=0, cnt8=0, cnt9=0 ;
        long SUM1=0, SUM2=0, SUM3=0, SUM4=0, SUM5=0, SUM6=0, SUM7=0, SUM8=0, SUM9=0  ;
        for( long n=1; n <= up_rng ; n++ ){

            int k1 = (int) count_digit(n, '1' ) ;
            cnt1 += k1 ;

            int k2 = (int) count_digit(n, '2' ) ;
            cnt2 += k2 ;

            int k3 = (int) count_digit(n, '3' ) ;
            cnt3 += k3 ;

            int k4 = (int) count_digit(n, '4' ) ;
            cnt4 += k4 ;

            int k5 = (int) count_digit(n, '5' ) ;
            cnt5 += k5 ;

            int k6 = (int) count_digit(n, '6' ) ;
            cnt6 += k6 ;

            int k7 = (int) count_digit(n, '7' ) ;
            cnt7 += k7 ;

            int k8 = (int) count_digit(n, '8' ) ;
            cnt8 += k8 ;

            int k9 = (int) count_digit(n, '9' ) ;
            cnt9 += k9 ;

            if (n == cnt1) {
                SUM1 += n ;
                System.out.println(n + "    dig="+ '1' +"   Sum = " + SUM1);    }

            if (n == cnt2) {
                SUM2 += n ;
                System.out.println(n + "    dig="+ '2' +"   Sum = " + SUM2);    }

            if (n == cnt3) {
                SUM3 += n ;
                System.out.println(n + "    dig="+ '3' +"   Sum = " + SUM3);    }

            if (n == cnt4) {
                SUM4 += n ;
                System.out.println(n + "    dig="+ '4' +"   Sum = " + SUM4);    }

            if (n == cnt5) {
                SUM5 += n ;
                System.out.println(n + "    dig="+ '5' +"   Sum = " + SUM5);    }

            if (n == cnt6) {
                SUM6 += n ;
                System.out.println(n + "    dig="+ '6' +"   Sum = " + SUM6);    }

            if (n == cnt7) {
                SUM7 += n ;
                System.out.println(n + "    dig="+ '7' +"   Sum = " + SUM7);    }

            if (n == cnt8) {
                SUM8 += n ;
                System.out.println(n + "    dig="+ '8' +"   Sum = " + SUM8);    }

            if (n == cnt9) {
                SUM9 += n ;
                System.out.println(n + "    dig="+ '9' +"   Sum = " + SUM9);    }



            if (n % 1000000000 == 0 ){
                System.out.println(" iter = " + n);

            }

        }
        return (SUM1 + SUM2 + SUM3 + SUM4 + SUM5 + SUM6 + SUM7 + SUM8 + SUM9 ) ;
    }

    public static void main(String[] args) {

//        System.out.println( count_digit(199981, '1' ) );
    System.out.println("\nTotal Sum = "  + brute_force((long) Math.pow(10, 11) ) ) ;
    //  Total Sum = 21295121502550

    }

}
