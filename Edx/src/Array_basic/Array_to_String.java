package Array_basic;

//  Created by Bogdan Trif on 15-07-2017 , 9:26 PM.


import java.util.Arrays;

public class Array_to_String {

    private static String mytoString(String[] theAray, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < theAray.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            String item = theAray[i];
            sb.append(item);
        }
        return sb.toString();
    }

    private static String Int_Array_to_String(int[] intNumbers, String delimiter) {

        StringBuffer sbfNumbers = new StringBuffer();


        if (intNumbers.length > 0) {
            sbfNumbers.append(intNumbers[0]);

            for (int i = 1; i < intNumbers.length; i++) {
                sbfNumbers.append(delimiter).append(intNumbers[i]);
            }
        }
        String strNumbers = Arrays.toString(intNumbers);
        strNumbers = strNumbers.replaceAll(", ", delimiter).replace("[", "").replace("]", "");

        return strNumbers ;

    }



    public static void main(String[] args) {
        String[] testArray = { "Apple", "Banana", "Carrots" };
        System.out.println(mytoString(testArray, ", "));
        System.out.println(mytoString(testArray, " - "));
        System.out.println(mytoString(testArray, " | "));
        System.out.println(mytoString(testArray, " + "));

        int[] int_test = {5,6,7,8} ;
        String A = Int_Array_to_String(int_test, "") ;
        int B = Integer.parseInt(A) ;
        System.out.println(A +"    " + B );


    }

}
