package WEEK_11.Creation_of_a_Linked_List_and_Insertion_at_the_End;

//  Created by Bogdan Trif on 08-06-2017 , 3:59 PM.


public class MyLinkedList<E>{
    private Node<E> first;

    public MyLinkedList(){
        this.first = null;
    }

    /*
     * Insertion at the beginning
     */
    public void insert(E info){
        Node<E> newNode = new Node<E>(info);
        newNode.setNext(first);
        first = newNode;
    }
    /*
     * Insertion at the end
     * Implement this method
     */


    public void insertEnd(E info){
        Node<E> newNode = new Node<E>(info) ;
        Node<E> current = first ;

        if (current == null){
            first = newNode ;
        } else {
            while (current.getNext() != null ){
                current = current.getNext() ;
            }
            current.setNext(newNode);
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

