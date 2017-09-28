package OOP_Concepts.Classes_basics;

/**
 * Created by Bogdan Trif on 01-05-2017 , 8:24 PM.
Here we want to prove that once we declare the init variables as private we can
access them only though the methods getters and set them with setters

 */

public class Public_and_Private {
    private String message   ;
    private String name ;

    // CONSTRUCTOR :
    public Public_and_Private(String message, String name){
    this.message = message ;
    this.name = name ;
    }

    public void setMessage(String m){
        this.message = m;
    }

    public String getMessage() {
        return this.message ;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName() {
        return this.name ;
    }

//    public static void main(String[] args){
//        public_and_private m1 = new public_and_private("Hi there", "Bogdan");
//        System.out.println(m1.getMessage()+"  " + m1.getName());
//
//        m1.message = "Servus" ;
//        m1.name = "Radu" ;
//        // Here they work because the main is written inside the class are PRIVATE ????????
//        System.out.println(m1.message + "  " + m1.name );
//
//    }
}
