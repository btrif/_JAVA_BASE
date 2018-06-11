package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 07-06-2017 , 2:01 PM.


public class PairII {
    int one;
    int two;

    public PairII(int a, int b){
        one = a;
        two = b;
    }

    public void setOne(int a){        one =a ;    }
    public void setTwo(int b){        two =b ;    }
    public int getOne() {return one ;}
    public int getTwo() {return two ;}


    public static void main(String[] args) {

        PairII A = new PairII(3, 6) ;
        A.setOne(11);
        System.out.println( A.getOne() );
        System.out.println( A.getTwo() );

    }
}
