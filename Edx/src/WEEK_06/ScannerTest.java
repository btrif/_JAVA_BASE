package WEEK_06;


import java.util.Scanner;

/**
 * Created by Bogdan Trif on 10-05-2017 , 9:52 PM.
 */
public class ScannerTest {
    public static void main(String arg[]){
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Your username is " + username);
    }

}
