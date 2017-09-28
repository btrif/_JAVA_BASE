package WEEK_11.Inserting_Elements_in_a_Linked_List;

//  Created by Bogdan Trif on 14-06-2017 , 10:02 AM.


/*
 * Exercise for inserting in a sorted way (lowest to highest)
 * elements within a linked list
 */
public class SortedInsertionLinkedList{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> mine = new MyLinkedList<Integer>();
        // Insert 10 ints
        for (int i=0; i< 10; i++){
            mine.insert((int)(100*Math.random()));
        }


        //Print the whole list
        mine.print();
//        while (mine. != null ){
//            System.out.println(mine.extract() ) ;
//
//        }



    }
}