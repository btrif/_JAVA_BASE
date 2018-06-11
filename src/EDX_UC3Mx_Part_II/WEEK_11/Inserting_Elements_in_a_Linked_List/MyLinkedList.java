package EDX_UC3Mx_Part_II.WEEK_11.Inserting_Elements_in_a_Linked_List;

//  Created by Bogdan Trif on 14-06-2017 , 10:02 AM.


public class MyLinkedList<E extends Comparable<E>>{
    // Notice that stating E extends Comparable<E> is needed, as we should use
    // compareTo for inserting in a sorted way
    private Node<E> first;

    public MyLinkedList(){
        this.first = null;
    }

    /*
     * Insertion at the beginning
     * Change this method to insert the values in a sorted way
     */
    public void insert(E info){
        Node<E> newNode = new Node<E>(info);
        Node<E> current, previous ;
        if ( first ==null ) {
            first = newNode ;
        } else {
            current = first ;
            previous = first ;

        while ( ( current != null ) && ( current.getInfo().compareTo(info) < 0 ) ){
            // if we want to insert the elements from higher to lower,
            // we will need to change the "sign" of the comparison
            //(current.getInfo().compareTo(info)>0) )
            previous = current ;
            current = current.getNext() ;
        }
        if ( previous == current){
            // at the beginning
            newNode.setNext( first );
            first = newNode ;
        } else {
            //this works at the end
            // and at the middle
            previous.setNext(newNode);
            newNode.setNext(current);

        }

    }

    }

    /*
     * Extraction of the first node
     */
    public E extract(){
        E data = null;
        if (first != null){
            data = first.getInfo();
            first = first.getNext();
        }
        return data;
    }
    /*
     * Print all list
     */
    public void print(){
        Node<E> current = first;

        while (current != null){
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

