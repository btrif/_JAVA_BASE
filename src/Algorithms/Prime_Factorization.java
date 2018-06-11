package Algorithms;

//  Created by Bogdan Trif on 04-09-2017 , 11:03 PM.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Prime_Factorization {

//    public static List<Integer> primeFactors(int numbers) {
    public static int[] primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }

        //  This converts the List<Integer> into int[]      !!!!!!!

        int[] array = factors.stream().mapToInt(i->i).toArray();

        // no Duplicates
        int[] noDuplicates = IntStream.of(array).distinct().toArray();
        return noDuplicates ;
        //        return factors;
    }


    public static int largestPrimeFactor(long number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }

    /**
     * @param args
     */

    public static void main(String[] args) {
        int n1 = 8*7*5*11*19*17 ;
        System.out.println("Prime factors of " + n1 + "  are : ");
        for (Integer integer : primeFactors(n1)) {
            System.out.print(integer + " ");
        }
        int n2 = 11*13*15*4*23*31 ;

        System.out.println("\nPrime factors of " +n2+ "  are : ");
        for (Integer integer : primeFactors(n2)) {
            System.out.print(integer + " ");
        }
        int n3 = 31 ;
        System.out.println("\nPrime factors of " + n3 + "  are : ");
        for (Integer integer : primeFactors(n3)) {
            System.out.print(integer + " ");
        }
    }



}
