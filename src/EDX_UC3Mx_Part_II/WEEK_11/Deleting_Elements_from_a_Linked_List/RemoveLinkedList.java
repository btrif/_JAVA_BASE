package EDX_UC3Mx_Part_II.WEEK_11.Deleting_Elements_from_a_Linked_List;

//  Created by Bogdan Trif on 09-06-2017 , 10:13 AM.


/*
 * Exercise for Removing the first occurrence of a given value
 * and removing all the occurrence of a given value
 */
public class RemoveLinkedList{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> mine = new MyLinkedList<Integer>();
        boolean success;

        // Insert 10 ints at the beginning (twice)
        for (int i=0; i< 10; i++){
            mine.insert(i);
            mine.insert(i);
        }

        System.out.println("Test: deleting first occurrence of a value");
        //Print the whole list
        mine.print();

        System.out.print("Deleting 9: ");
        success = mine.deleteFirstOccurrence(9);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 9: ");
        success = mine.deleteFirstOccurrence(9);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 9: ");
        success = mine.deleteFirstOccurrence(9);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 5: ");
        success = mine.deleteFirstOccurrence(5);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 5: ");
        success = mine.deleteFirstOccurrence(5);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 5: ");
        success = mine.deleteFirstOccurrence(5);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 0: ");
        success = mine.deleteFirstOccurrence(0);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 0: ");
        success = mine.deleteFirstOccurrence(0);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 0: ");
        success = mine.deleteFirstOccurrence(0);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();


        mine = new MyLinkedList<Integer>();
        int numberdeleted;

        // Insert 10 ints at the beginning (twice)
        for (int i=0; i< 10; i++){
            mine.insert(i);
            mine.insert(i);
        }
        System.out.println("Test: deleting of all the occurrences of a value");
        //Print the whole list
        mine.print();

        System.out.print("Deleting 9: ");
        numberdeleted = mine.deleteAll(9);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
        System.out.print("Deleting 0: ");
        numberdeleted = mine.deleteAll(0);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
        System.out.print("Deleting 5: ");
        numberdeleted = mine.deleteAll(5);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
        System.out.print("Deleting 100: ");
        numberdeleted = mine.deleteAll(100);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
    }
}

