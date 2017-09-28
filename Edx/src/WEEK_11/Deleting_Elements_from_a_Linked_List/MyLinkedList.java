package WEEK_11.Deleting_Elements_from_a_Linked_List;

//  Created by Bogdan Trif on 09-06-2017 , 10:13 AM.


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
     * Delete the first occurrence of a value
     * Return a boolean stating if the delete was successful
     */
    public boolean deleteFirstOccurrence(E info){
        boolean found = false;
        if (first != null){
            Node<E> current=first;
            Node<E> previous=first;

            while ((current !=null)&&(!current.getInfo().equals(info))){
                previous = current;
                current = current.getNext();
            }

            if (current != null){
                found = true;
                if (current ==previous){
                    // The first ocurrence is within the first node
                    first = first.getNext();
                }else{
                    previous.setNext(current.getNext());
                }
            }
        }
        return found;
    }
    /*
     * Delete all the occurrences of a value
     * Returns the number of deleted nodes
     * Possible implementation using deleteFirstOccurrence
     */
    public int deleteAll(E info){
        int number=0;
        while (deleteFirstOccurrence(info))
            number++;
        return number;
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
