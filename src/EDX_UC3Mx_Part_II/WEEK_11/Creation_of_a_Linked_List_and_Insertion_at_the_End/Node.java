package EDX_UC3Mx_Part_II.WEEK_11.Creation_of_a_Linked_List_and_Insertion_at_the_End;

//  Created by Bogdan Trif on 08-06-2017 , 3:59 PM.


public class Node<E>{
    private E info;
    private Node<E> next;


    // Constructors
    public Node(){
        this.next = null;
    }

    public Node(E info){
        this.info = info;
        this.next = null;
    }
    public Node(E info, Node<E> next){
        this.info = info;
        this.next = next;
    }

    // MEthods

    public E getInfo(){
        return this.info;
    }
    public void setInfo(E info){
        this.info = info;
    }
    public Node<E> getNext(){
        return this.next;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

}
