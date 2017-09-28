package WEEK_11;

//  Created by Bogdan Trif on 07-06-2017 , 5:37 PM.


public class Pair {
    Object one;
    Object two;

    public Pair(Object a, Object b){
        one = a;
        two = b;
    }

    public void setOne(Object a){        one =a ;    }
    public void setTwo(Object b){        two =b ;    }
    public Object getOne() {return one ;}
    public Object getTwo() {return two ;}


    public static void main(String[] args) {

        Pair A = new Pair( "Bogdy", 6) ;
        A.setOne(999);
        System.out.println( A.getOne() );
        System.out.println( A.getTwo() );

    }
}
