package WEEK_06.Errors;

/**
 * Created by Bogdan Trif on 08-05-2017 , 8:39 PM.
 */
public class Execution_Errors {

    public static void main(String args[])
    {
        String a = new String("Hello");
        String b = new String("Hello");
        if (a.equals(b)){
            System.out.println(a + " " + b + " are equal");
        }else{
            System.out.println(a + " " + b + " are different");
        }
    }
}
