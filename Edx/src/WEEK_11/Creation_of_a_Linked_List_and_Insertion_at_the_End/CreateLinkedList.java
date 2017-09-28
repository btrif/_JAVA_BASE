package WEEK_11.Creation_of_a_Linked_List_and_Insertion_at_the_End;

//  Created by Bogdan Trif on 08-06-2017 , 3:59 PM.


/*
 * Exercise for Creation of a Linked List and printing
 */
public class CreateLinkedList{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> first = new MyLinkedList<Integer>();

        // Insert the first 10 ints at the beginning
        for (int i=0; i< 10; i++){
            first.insert(i);
        }
        //Print the whole list
        first.print();

        // Create another linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> second = new MyLinkedList<Integer>() ;

        // Insert 10 ints at the end
        for (int i=0; i< 10; i++){
            second.insertEnd(i);
        }
        //Print the whole second list
        second.print();

    }
}
