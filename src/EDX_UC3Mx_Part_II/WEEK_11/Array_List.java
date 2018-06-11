package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 20-06-2017 , 1:31 PM.


import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {


        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        for (int i = 0; i<100; i++) {
            int var = (int) (Math.random() * 10);
            arraylist2.add(var);
            System.out.println(var);

        }

        System.out.println("\n\n-------------Problem 2------------");
        ////////////

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i<10; i++){
            arraylist.add(i);
        }
        for (int i = 0; i<arraylist.size(); i++){
            if (i%3 == 0){
                arraylist.remove(i);
            }
        }
        arraylist.set(2, 0);
        arraylist.set(7, 0);
        for (int i = 0; i < arraylist.size(); i++){
            System.out.print(arraylist.get(i));
        }



        }


    }


