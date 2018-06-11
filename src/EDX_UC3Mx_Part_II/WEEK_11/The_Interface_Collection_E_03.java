package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 19-06-2017 , 4:28 PM.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class The_Interface_Collection_E_03 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> yourList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++){
            myList.add(i, (int) (Math.random()*10));
        }
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element<5){
                iterator.remove();
                yourList.add(element);
            }
        }
        System.out.println(myList);
        System.out.println(yourList);

    }

}
