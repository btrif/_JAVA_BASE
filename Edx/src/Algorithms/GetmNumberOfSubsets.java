package Algorithms;

//  Created by Bogdan Trif on 11-09-2017 , 4:00 PM.

/*
 Non-repeating terms, so if I have the case :
9 = 9
4,4,1 = 9
4, 1, 1, 1, 1, 1 = 9
1, 1, 1, 1, 1, 1, 1, 1, 1 = 9       IT DOESN'T WORK !!
 */


class GetmNumberOfSubsets {


    private static int GetmNumberOfSubsets(int[] numbers, int sum){

        int[] dp = new int[sum + 1];
        dp[0] = 1;
        int currentSum =0;
        for (int i = 0; i < numbers.length; i++)
        {
            currentSum += numbers[i];
            for (int j = Math.min(sum, currentSum); j >= numbers[i]; j--)
                dp[j] += dp[j - numbers[i]];
        }

        return dp[sum];

    }

    public static void main(String[] args) {

        GetmNumberOfSubsets A = new GetmNumberOfSubsets() ;

        int[] lst = {1,4,9} ;

        System.out.println(  A.GetmNumberOfSubsets( lst , 9 )   ) ;
    }

}
