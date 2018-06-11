package EDX_UC3Mx_Part_II.WEEK_11.Linked_List_with_Head_and_Tail;

//  Created by Bogdan Trif on 19-06-2017 , 11:29 AM.


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

