package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 07-06-2017 , 2:05 PM.


public class PairSI {
    String one;
    int two;

    public PairSI(String a, int b){
        one = a;
        two = b;
    }

    public void setOne(String a){        one =a ;    }
    public void setTwo(int b){        two =b ;    }
    public String getOne() {return one ;}
    public int getTwo() {return two ;}


    public static void main(String[] args) {

        PairSI A = new PairSI( "Bogdy", 6) ;
        A.setOne("Trf");
        System.out.println( A.getOne() );
        System.out.println( A.getTwo() );

    }
}
