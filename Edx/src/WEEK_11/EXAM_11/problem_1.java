package WEEK_11.EXAM_11;

//  Created by Bogdan Trif on 21-06-2017 , 3:51 PM.


import java.util.ArrayList;

public class problem_1 {


    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>() ;
        System.out.println(arraylist);
        for (int i=10 ; i<50 ; i+=5){
            arraylist.add(i) ;
//            System.out.print(i+"  ");
        }
        System.out.println(arraylist);

        method(arraylist);
//        int[] aa = {10,20,30,40,50} ;
//        method() ;

    }

    private static void method(Integer[] array) {
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
        for (int i=0; i< array.length; i++){
            listOfIntegers.add(array[i]);
            System.out.print(i + "  ");
        }
    }


}
