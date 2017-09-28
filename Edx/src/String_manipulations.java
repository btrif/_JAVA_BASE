//  Created by Bogdan Trif on 14-07-2017 , 10:02 AM.


public class String_manipulations {

    public static int[] stringArrayToIntArray(String intString) {
        String[] intStringSplit = intString.split(" "); //Split by spaces
        int[] result = new int[intStringSplit.length]; //Used to store our ints

        for (int i = 0; i < intStringSplit.length; i++) {
            //parse and store each value into int[] to be returned
            result[i] = Integer.parseInt(intStringSplit[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        String intString = "6 25 11 32 6 11 44"; //Original String
        int[] intArray = stringArrayToIntArray(intString); //Call our method
        System.out.println("The original intString : \t " + intString);
        System.out.print("The modified array of int : \t");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println("-------------");
        String digits = "625113261144";
        String[] digits_split = digits.split("");
        for (int i=0 ; i< digits.length() ; i++ ){
            System.out.print( digits_split[i]+" " );
        }

    }

}
