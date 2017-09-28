package WEEK_11;

//  Created by Bogdan Trif on 20-06-2017 , 10:35 AM.

/*
 * Practising Lists
 */

import java.util.ArrayList;
import java.util.List;

public class Interface_List_sort {

    private static void printList(List<String> mine){
        for(String s : mine)
            System.out.print(s+" ");
        System.out.println();
    }
    public static void main(String args[]){
        List<String> myList = new ArrayList<String>();
        myList.add("This");
        myList.add("is");
        myList.add("a");
        myList.add("LIST");
        myList.add("implemented");
        myList.add("with");
        myList.add("An");
        myList.add("ArrayList");

        printList(myList);

        myList.sort(String::compareTo);
        printList(myList);

        myList.removeIf(x -> x.startsWith("T"));

        myList.removeIf(x -> x.toLowerCase().contains("i"));
        printList(myList);

        myList.sort(String::compareToIgnoreCase);
        printList(myList);

        List<String> myList2 = new ArrayList<String>();
        myList2.add("This");
        myList2.add("is");
        myList2.add("another");
        myList2.add("LIST");
        myList2.add("implemented");
        myList2.add("with");
        myList2.add("An");
        myList2.add("ArrayList");

        printList(myList2);

        System.out.println("Does List2 contain the whole myList? "+
                myList2.containsAll(myList));

        myList.retainAll(myList2);

        System.out.println("Does List2 contain the whole myList? "+
                myList2.containsAll(myList));

        myList2.removeAll(myList);
        System.out.println("Does List2 contain the whole myList? "+
                myList2.containsAll(myList));

    }

}
