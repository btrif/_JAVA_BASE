package Project_Euler;

//  Created by Bogdan Trif on 13-07-2017 , 11:31 AM.


/*Suppose you want to get 2 euros with the coins 2E, 1E, 0.50E, 0.20E, 0.10E, 0.05E,
0.02E, 0.01E.
* Find every possible way to achieve that*/


public class pb031_Coins_sum {

    static int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1};
    static int perms = 0;


    public static void main(String[] args){
        coins(200,0);
        System.out.println("Total permutations : " + perms);
    }
    static void coins(int total, int i){
        if(total==0){
            perms++;
            return;
        }
/*The following "if" statement, stops the recursion when we reach "1
cent" and the
total value of coins is not 2 euros.*/
        if(i >= coins.length){
            return;
        }
        int possibilities = total/coins[i];
        for( int l = possibilities; l>= 0; l-- ) {
            int next = total - l*coins[i];
            int nexti = i+1;
            coins(next, nexti );
        }
    }
}
