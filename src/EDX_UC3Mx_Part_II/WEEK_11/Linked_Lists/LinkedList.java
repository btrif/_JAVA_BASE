package EDX_UC3Mx_Part_II.WEEK_11.Linked_Lists;

//  Created by Bogdan Trif on 08-06-2017 , 12:58 PM.


import com.sun.corba.se.spi.ior.ObjectKey;

public class LinkedList {

    private Node top ;

    public LinkedList() { top = null ;}

    // Methods
    private void insert (Object e, Node prev) {

        if ( prev != null) {
        Node n = new Node ( e, prev.getNext() ) ;
        prev.setNext(n);
        }
    }
    private Object extract (Node prev ) {

        if ( prev == null || prev.getNext() == null ) {return null ;}
//        if ( prev.getNext() == null  ) {return null ;}

        Object e = prev.getNext().getElem() ;
        prev.setNext( prev.getNext().getNext() );
        return e ;
    }


    public static void main(String[] args) {

        Node A = new Node ( "Baia Mare", null);

        System.out.println(" The first Node is : " + A.getElem() );
        Node B = new Node ( "Bulgari", null);


        LinkedList LL = new LinkedList() ;
        LL.insert(A, B);
        System.out.println(" Linked List : " + LL.extract(A.getNext()) );

    }


}
