package EDX_UC3Mx_Part_II.WEEK_08.LAB;

//  Created by Bogdan Trif on 25-05-2017 , 5:06 PM.


import java.util.*;
/**
 * Class that implements two possible solutions to the Towers of Hanoi Problem
 */
public class TowersOfHanoi {

    public static void hanoiBinary(int n, String[] rods) {
        int origin, sink;
        for (int i = 1; i < (1 << n); i++){
            origin = (i &i-1)%3;
            sink = ((i|i-1)+1)%3;
            System.out.println(rods[origin] + " -> " + rods[sink]);
        }
    }
    public static void hanoiRecursive(int n, String source, String spare,
                                      String destination) {
        if (n == 1) {
            System.out.println(source + " -> " + destination);
        }
        else {
            hanoiRecursive(n - 1, source, destination, spare );
            System.out.println(source + " -> " + destination);
            hanoiRecursive(n - 1, spare, source, destination);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int discs;
        String[] rods= {"A","B","C"};
        System.out.print("Please, enter the number of discs: ");
        discs = scanner.nextInt();
        /*A is the source of the discs, C their destination and B
	    the spare rod*/
        System.out.println("Recursive Solution: ");
        hanoiRecursive(discs, rods[0], rods[1], rods[2]);

        System.out.println("Binary Solution: ");
        hanoiBinary(discs, rods);
    }
}

