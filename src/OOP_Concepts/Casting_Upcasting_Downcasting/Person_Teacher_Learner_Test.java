package OOP_Concepts.Casting_Upcasting_Downcasting;

/**
 * Created by Bogdan Trif on 28-04-2017 , 9:56 PM.
 */

//As explained before, downcasting is a dangerous practice.
//You should be very careful when downcasting. However, upcasting is safer.
//We have defined the following classes:

public class Person_Teacher_Learner_Test {

    public static void main(String[] args){

        Person[] people = new Person[8];
// Now imagine that we want to store the information of 8 people, learners and teachers, in an array.
        people[0] = new Learner("Juan");
        people[1] = new Teacher("Carlos");
        people[2] = new Learner("Ana");
        people[3] = new Learner("Ivan");
        people[4] = new Learner("Mike");
        people[5] = new Teacher("Iria");
        people[6] = new Learner("Elisa");
        people[7] = new Teacher("Carmen");

        // UPCASTING
        for (Person person:people){
            if (person instanceof Learner){
                ( (Learner) person).enroll();    ; // UPCASTING
                System.out.println( person.name );

//The sentence person instanceof Learner returns true if the object person is an instance
//of the class Learner and false otherwise.
//We want to ensure that all the learners are enrolled in the MOOC. However,
//the sentence person.enroll(); makes the program to not compile.
//What sentence should be placed instead of that one?
            }
        }

    }
}

//When you cast an object, you should ensure that you are invoking over an object of the class you are casting.
//You should place the proper parenthesis ((Class) variable).method();