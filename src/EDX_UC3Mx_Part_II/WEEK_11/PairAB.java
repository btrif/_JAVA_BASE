package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 07-06-2017 , 6:53 PM.


public class PairAB <A, B > {

    A    one;
    B    two;

    public PairAB(A a, B b){
        one = a;
        two = b;
    }

    public void setOne(A a){        one =a ;    }
    public void setTwo(B b){        two =b ;    }
    public A getOne() {return one ;}
    public B getTwo() {return two ;}


    public static void main(String[] args) {

        PairAB A = new PairAB( "Bogdy", 6) ;
        A.setOne(747483722);

        System.out.println( A.getOne() );
        System.out.println( A.getTwo() );

    }

}
