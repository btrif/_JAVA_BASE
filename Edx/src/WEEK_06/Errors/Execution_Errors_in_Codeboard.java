package WEEK_06.Errors;

import java.util.Scanner;

/**
 * Created by Bogdan Trif on 09-05-2017 , 11:05 AM.
 */
public class Execution_Errors_in_Codeboard {

    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter something: ");
        float n = reader.nextFloat();
        System.out.println("You have entered: "+n);
    }
}
