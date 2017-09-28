package WEEK_11;

//  Created by Bogdan Trif on 21-06-2017 , 12:27 PM.


import java.util.ArrayList;

public class Array_List_02 {

    public static void main(String[] args) {


        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist3 = new ArrayList<Integer>();

        for (int i = 0; i<5; i++){
            arraylist1.add(i);
            arraylist2.add(5-i-1);
        }

        arraylist1.addAll(2, arraylist2);
        arraylist1.addAll(6, arraylist1);
        arraylist3.addAll(arraylist1.subList(4, 9));

        System.out.println(arraylist3);

    }

}
