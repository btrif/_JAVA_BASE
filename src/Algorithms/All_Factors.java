package Algorithms;

//  Created by Bogdan Trif on 04-09-2017 , 11:00 PM.


import java.util.ArrayList;
import java.util.Collections;

public class All_Factors {

    public ArrayList<Integer> allFactors(int a) {

        int upperlimit = (int)(Math.sqrt(a));
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1;i <= upperlimit; i+= 1){
            if(a%i == 0){
                factors.add(i);
                if(i != a/i){
                    factors.add(a/i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }

    public static void main(String[] args) {
        int n = 90 ;
        All_Factors F = new All_Factors() ;
        F.allFactors(n);
        System.out.println(F.allFactors(n));
    }

}
