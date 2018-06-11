package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 21-06-2017 , 12:35 PM.


//The Interface List<E> and the Class ArrayList<E> (non-graded activity)
//
//Read carefully the provided code.
//
//Implement a method that removes all the duplicates of the list using only methods
//provided by the Class ArrayList<E> and the Interface List<E>.
//
//The solution will be published at the end of the week.
//Meanwhile, you can discuss your solution in the forum.


import java.util.ArrayList;
import java.util.List;

public class Interface_List_and_the_Class_ArrayList {

    private static void printList(List<Integer> mine){
        for(Integer s : mine)
            System.out.print(s+" ");
        System.out.println();
    }
    private static List<Integer> createRandomList(int size, int max){
        List<Integer> result = new ArrayList<Integer>();

        for (int i=0; i< size; i++){
            result.add( (int)( Math.random()*max));
        }
        return result;
    }
    /*
     * You should implement this function without resorting to use HashSet
     * and maintaining the order of the List
     */
    private static void removeDuplicates(List<Integer> mine){
        for (int index=0 ; index < mine.size() ; index++ ){
            while ( index != mine.lastIndexOf( mine.get(index)) ){
                mine.remove(mine.lastIndexOf(mine.get(index))) ;
                printList(mine);
            }
        }




    }

    public static void main(String args[]){
        List<Integer> myList = createRandomList(10,5);
        printList(myList);
        //remove Duplicates from myList
        removeDuplicates(myList);
        printList(myList);
    }

}
