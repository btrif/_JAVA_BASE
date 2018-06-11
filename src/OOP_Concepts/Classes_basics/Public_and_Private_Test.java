package OOP_Concepts.Classes_basics;

/**
 * Created by Bogdan Trif on 01-05-2017 , 8:44 PM.
 */
public class Public_and_Private_Test {
    public static void main(String[] args){
        Public_and_Private m1 = new Public_and_Private("Hi there", "Bogdan");
        System.out.println(m1.getMessage()+"  " + m1.getName());

        m1.setMessage("Servus");
        m1.setName("Radu");
        // Why it doesn't SET the variable with the new attributes ?
        System.out.println(m1.getMessage() + "  " + m1.getName() );

    }
}
