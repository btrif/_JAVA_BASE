package WEEK_11;

//  Created by Bogdan Trif on 19-06-2017 , 4:26 PM.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class The_Interface_Collection_E_02 {
    public static void main(String[] args) {
        //    Look at the following code:
        List<Integer> mySecondList = new ArrayList<Integer>();


        for ( int j = 0; j < 10; j++ ){
            mySecondList.add(j);
        }
        Iterator<Integer> iterator = mySecondList.iterator();

        while (iterator.hasNext()) {
            System.out.println(mySecondList );
            if (iterator.next()%2 == 0){
                iterator.remove();
            }
        }
    }

}
