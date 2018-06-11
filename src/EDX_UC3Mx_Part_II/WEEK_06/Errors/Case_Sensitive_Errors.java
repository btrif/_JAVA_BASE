package EDX_UC3Mx_Part_II.WEEK_06.Errors;

/**
 * Created by Bogdan Trif on 08-05-2017 , 8:11 PM.
 */

public class Case_Sensitive_Errors {
    public static void main(String []args)
    {
        String b = "Volvo";
        String hp = "130";
        Car c = new Car(b,hp);
        c.getHorsePower(b);
        System.out.println("c = " + c.getHorsePower(b) );

    }
}
