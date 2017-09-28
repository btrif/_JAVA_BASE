package WEEK_11.Deleting_Elements_from_a_Linked_List;

//  Created by Bogdan Trif on 09-06-2017 , 10:13 AM.


public class Node<E>{
    private E info;
    private Node<E> next;

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

