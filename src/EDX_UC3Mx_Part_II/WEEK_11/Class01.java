package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 07-06-2017 , 9:48 PM.


public class Class01<E>{private E attribute;

    public void set (E value){
            this.attribute = value;
            }

    public E get(){
            return attribute;
            }

    public static void main(String[] args){
        Class01<Integer> myClass = new Class01<Integer>();
        Class01<String> yourClass = new Class01<String>();
        myClass.set(0);
        yourClass.set("0");
        System.out.println(myClass.get() + yourClass.get());
    }

}