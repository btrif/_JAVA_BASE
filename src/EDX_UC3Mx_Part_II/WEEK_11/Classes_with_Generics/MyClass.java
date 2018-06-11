package EDX_UC3Mx_Part_II.WEEK_11.Classes_with_Generics;

//  Created by Bogdan Trif on 07-06-2017 , 9:56 PM.

/**
Exercise about Classes with Generics (non-graded activity)

Compile and execute the provided code. As you can see, the method equals() does not behave as intended
(we are comparing references, as this is how this method was originally implemented in the class Object ).

Please, implement (override) a method equals() within our class that compares the value of the attributes
of this and other. In order to achieve this, you can use the method  equals() (with the attributes).

The solution will be published at the end of the week. Meanwhile, you can discuss your solution at the forum.
*/

class MyClass<E>{
    private E attribute;
    MyClass(E var){
        this.attribute = var;
    }
    public E get(){
        return this.attribute;
    }
    public void set(E value){
        this.attribute = value;
    }
    public int hashCode(){
        return attribute.hashCode();
    }

    public boolean equals(Object other){
     if (other instanceof MyClass<?> ) {
         if ( this.get() == null ) {
             // checks if both attributes are null
             return this.get() == ( (MyClass<E>) other).get();
         } else {
             // checks if both attributes are equal
             return this.get().equals(((MyClass<E>) other).get());
         }
         } else {
                 return false ;
             }


    }

}
