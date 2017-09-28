package WEEK_08.EXAM_08;

//  Created by Bogdan Trif on 25-05-2017 , 5:19 PM.


public class Complexity_of_Methods_II {

    private static int invoked = 0;

    public static void clearInvoked(){
        invoked = 0;
    }

    public static int getInvoked(){
        return(invoked);
    }


    static boolean foo (int n) {
    if (n==0) {
        invoked++;
        return false;
    } else {
        invoked++;
        return bar(n-1);
    }
}

    static boolean bar (int n) {
        if (n==0) {
            invoked++;
            return true;
        } else {
            invoked++;
            return foo(n-1);
        }
    }

    public static void main(String[] args) {

        int A = 20 ;
        clearInvoked();
        System.out.println(foo(A) + "   and was invoked " + getInvoked() +" times" );
        clearInvoked();
        System.out.println(bar(A)+ "   and was invoked " + getInvoked()+" times"  );
    }
}
