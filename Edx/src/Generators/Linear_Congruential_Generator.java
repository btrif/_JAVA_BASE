package Generators;

//  Created by Bogdan Trif on 31-08-2017 , 9:32 PM.


import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Linear_Congruential_Generator {

    private static class LCG implements IntSupplier {
        int t =0 ;
        int s ;

        @Override
        public int getAsInt()        {
            t = (int)  ( ( 615949 *  t + 797807) % (Math.pow(2, 20)) ) ;
            s = (int) (t - Math.pow(2, 19) );

            return s;
        }
    }

    public static void main(String[] args) {

        LCG Linear_Generator = new LCG();
        IntStream myStream = IntStream.generate(Linear_Generator);
        myStream.limit(10).forEach(System.out :: println );
//        System.out.println( " 2^20 = " + Math.pow(2, 20) );
        for (int i=0 ; i<10 ; i++) {
            System.out.print(i+"  ");
            myStream.
        }
    }



}
