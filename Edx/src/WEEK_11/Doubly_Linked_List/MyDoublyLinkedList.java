package WEEK_11.Doubly_Linked_List;

//  Created by Bogdan Trif on 19-06-2017 , 11:51 AM.


public class MyDoublyLinkedList<E extends Comparable<E>>{
    private Node<E> head;
    private Node<E> tail;

    public MyDoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    /*
     * Insertion at the beginning
     */
    public void insert(E info){
        Node<E> newNode = new Node<E>(info);
        newNode.setNext(head);
        if (head != null){
            head.setPrev(newNode);
        }
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
        Node<E> newNode = new Node<E>(info);
        if (tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
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
            if (head.getNext() != null){
                head.getNext().setPrev(null);
                head = head.getNext();
            }else{
                head =null;
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
        if (tail != null){
            data = tail.getInfo();
            if (tail.getPrev() != null){
                tail.getPrev().setNext(null);
                tail = tail.getPrev();
            }else{
                tail = null;
                head = null;
            }
        }
        return data;
    }
    /*
     * Delete all nodes with info equal to value
     * returns number of deleted nodes
     * Possible implementation (obviously there are many others)
     */

    public int deleteAll(E info){
        int deleted = 0;
        Node <E> current = head;
        while (current != null){
            while ( (current != null) && (current.getInfo().compareTo(info) != 0) ){
                current = current.getNext();
            }
            if (current != null){
                deleted++;
                if (current == head){
                    if (head.getNext() != null){
                        head.getNext().setPrev(null);
                        head = head.getNext();
                    }else{
                        head = null;
                        tail = null;
                    }
                    current = head;
                }else if (current == tail){
                    // Here we know that at least there is one other previous
                    // node
                    tail.getPrev().setNext(null);
                    tail = tail.getPrev();
                    current = null;
                }else{
                    // a node at the middle of the list
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                    current = current.getNext();
                }
            }
        }
        return deleted;
    }

    /*
     * Print all list forward
     */
    public void print(){
        Node<E> current = head;

        while (current != null){
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    /*
     * Print all list backwards
     */
    public void printBackwards(){
        Node<E> current = tail;

        while (current != null){
            System.out.print(current.getInfo() + " ");
            current = current.getPrev();
        }
        System.out.println();
    }
}

