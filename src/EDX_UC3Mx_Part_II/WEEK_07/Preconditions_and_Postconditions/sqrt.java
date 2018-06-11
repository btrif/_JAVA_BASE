package EDX_UC3Mx_Part_II.WEEK_07.Preconditions_and_Postconditions;

/**
 * Created by Bogdan Trif on 19-05-2017 , 9:36 AM.
 */
public class sqrt {

    /**
     * @param num is an integer number greater than 0
     *
     */
    public double sqrt(int num) {
//        double root = Math.sqrt(new Integer(num).doubleValue());
        double root = Math.sqrt(num) ;


        return root;
    }

    public static void main(String[] args) {
        int a = -175 ;
        double s = new sqrt().sqrt(a) ;
        System.out.println("square root of " + a + " is "  + new sqrt().sqrt(a) );
    }

}
