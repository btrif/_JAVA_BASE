package EDX_UC3Mx_Part_II.WEEK_11.Classes_with_Generics;

//  Created by Bogdan Trif on 07-06-2017 , 9:56 PM.


public class GenericsTest {

    public static void main(String args[]){

        Integer a = new Integer(65);
        int b = 65;
        String foo = new String("A new String");

        MyClass<Integer> one = new MyClass<Integer>(a);
        System.out.println(one.get());

        MyClass<Integer> two = new MyClass<Integer>(b);
        System.out.println(two.get());

        MyClass<String> first = new MyClass<String>(foo);
        System.out.println(first.get());

        MyClass<String> second = new MyClass<String>("A new String");
        System.out.println(second.get());

        // If no equals method is provided,
        // equals is the one implemented by the class Object
        // that compares references
        // So, you should override the equals method for this class
        if (one.equals(two))
            System.out.println("They are equal");
        else
            System.out.println("They are different");

        if (second.equals(first))
            System.out.println("They are equal");
        else
            System.out.println("They are different");



        MyClass<String> x = new MyClass<String>("x");
        MyClass<String> n1 = new MyClass<String>(null);
        MyClass<String> n2 = new MyClass<String>(null);
        System.out.println(n1.get());
        System.out.println(n2.get());
        if (n1.equals(n2) && n2.equals(n1)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are different");
        }
        System.out.println(n1.get());
        System.out.println(x.get());
        if (n1.equals(x) || x.equals(n1)) {
            System.out.println("They are equal (error)");
        } else {
            System.out.println("They are different (ok)");
        }

        MyClass<String>  se = new MyClass<String>("e");
        MyClass<Double> ie = new MyClass<Double>(2.71828);
        System.out.println(se.get());
        System.out.println(ie.get());
        if (se.equals(ie) || ie.equals(se)) {
            System.out.println("They are equal (error)");
        } else {
            System.out.println("They are different (ok)");
        }

    }

}
