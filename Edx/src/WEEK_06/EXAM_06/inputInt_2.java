package WEEK_06.EXAM_06;

import java.util.Scanner;

/**
 * Created by Bogdan Trif on 17-05-2017 , 11:26 AM.
 */
public class inputInt_2 {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number greater than 10: ");
        int n = reader.nextInt();
        assert n>10;
//        if (n>10){
//            System.out.println(n + " is greater than 10 !");
//        } else {
//            System.out.println(n + " is smaller or equal than 10 !");
//        }
    }
}
