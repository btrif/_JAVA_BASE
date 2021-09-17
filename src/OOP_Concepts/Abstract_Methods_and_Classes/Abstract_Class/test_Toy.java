package OOP_Concepts.Abstract_Methods_and_Classes.Abstract_Class;

/**
 * Created by Bogdan Trif on 02-05-2017 , 12:35 PM.
 */
public class test_Toy {
    public static void main(String[] args) {

        //Instantiating the Toy class gives error because it is abstract
        // Toy myToy = new Toy();

        // Even if it has an abstract superclass the class TeddyBear works because
//        it has its own methods
        TeddyBear myTeddyBear = new TeddyBear();
        myTeddyBear.play();
        ToyCar myToyCar = new ToyCar();
        myToyCar.play();

        // THIS WORKS --> it is called DYNAMIC BINDING and is run at Execution Time
        Toy A = new ToyCar() ;
        A.play();

        // DoeSN't work because Toy cannot be instantiated !!
//        Toy B = (ToyCar) (new Toy()) ;

    }

}

/**
 Abstract classes cannot be instantiated. Thus, we cannot create a new Toy() object.
 Abstract classes contains at least one method without code,
    there is no problem in the definition of the Toy class.
 As the play method is declared abstract it must contain no code.
 The TeddyBear and ToyCar classes extend the Toy class.
 In consequence, they have to either implement the play method or be abstract themselves.
 When calling the play method on an object, the code of the method in the instantiated class is executed
 (remember polymorphism).
 */
