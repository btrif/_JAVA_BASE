package WEEK_11;

//  Created by Bogdan Trif on 19-06-2017 , 3:44 PM.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class The_Interface_Collection_E_01 {

    public static void main(String[] argv) {

        List<String> myList = new ArrayList<String>();

        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        method1(myList);
        method2(myList);
    }

    private static void method1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void method2(List<String> list)     {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
