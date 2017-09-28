package WEEK_11.Linked_List_with_Head_and_Tail;

//  Created by Bogdan Trif on 19-06-2017 , 11:28 AM.


public class MyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    /*
     * Insertion at the beginning
     */
    public void insert(E info){
        Node<E> newNode = new Node<E>(info);
        newNode.setNext(head);
        head = newNode;
        if (tail == null){
            tail = newNode;
        }
    }
    /*
     * Insertion at the end
     * Implement this method
     */

    public void insertEnd(E info){
        //Implement this method
        Node<E> newNode = new Node<E>(info) ;
        if ( tail == null ) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }


    /*
     * Extraction of the first node
     */
    public E extract(){
        E data = null;
        if (head != null){
            data = head.getInfo();
            head = head.getNext();
            if (head ==null){
                tail = null;
            }
        }
        return data;
    }
    /*
     * Extraction of the last node
     */
    public E extractEnd(){
        E data = null;
        Node<E> current;
        if (head != null){
            current = head;
            while ((current != tail) &&(current.getNext() != tail)){
                current = current.getNext();
            }
            data = tail.getInfo();
            if (current == tail){
                tail = null;
                head = null;
            }else{
                current.setNext(null);
                tail = current;
            }
        }
        return data;
    }



    /*
     * Print all list
     */
    public void print(){
        Node<E> current = head;

        while (current != null){
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

