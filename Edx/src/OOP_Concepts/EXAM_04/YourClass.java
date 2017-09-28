package OOP_Concepts.EXAM_04;

/**
 * Created by Bogdan Trif on 02-05-2017 , 9:50 AM.
 */
public class YourClass extends MyClass {
    private int b;
    public YourClass (int a, int b) {
        super(a) ;
        this.b = b;
    }

    public static void main(String[] args){
        MyClass A = new MyClass(34) ;
        System.out.println( A.getA() );
        YourClass B = new YourClass(84354, 67) ;
        System.out.println( B.getA() +"    " + B.b);
        A.setA(555);
        System.out.println("A.a =  " + A.getA());
    }
}
