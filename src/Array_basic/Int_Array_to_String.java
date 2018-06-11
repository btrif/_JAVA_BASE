package Array_basic;

//  Created by Bogdan Trif on 14-07-2017 , 5:27 PM.


import java.util.Arrays;

public class Int_Array_to_String {

    int[] array ;
    String strSeparator = "";
    StringBuffer sb = new StringBuffer();

//    public Int_Array_to_String(int[] array ){
//        this.array = array ;
//        this.sb = sb ;
//    }
//
//    public int[] get_Array() {
//        return array ;
//    }
//
//    public int[] convert_to_String() {
//
//        if (array.length > 0){
//            sb.append(array[0]);
//
//            for(int i=1; i < array.length; i++){
//                sb.append(strSeparator).append(array[i]);
//            }
//        }
//    return sb.to ;
//    }


//    private static String Int_Array_to_String(String[] theAray, String delimiter) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < theAray.length; i++) {
//            if (i > 0) {
//                sb.append(delimiter);
//            }
//            String item = theAray[i];
//            sb.append(item);
//        }
//        return sb.toString();
//    }



    public void print_Array(){
        for (int i=0 ; i < array.length ; i++){
            System.out.print(array[i]);
        }
    }


    public static void main(String args[]){


        int[] intNumbers = new int[]{1, 2, 3, 4, 5};

        /*     METHOD I
         * First approach is to loop through all elements of an int array
         * and append them to StringBuffer object one by one. At the end,
         * use toString method to convert it to String.
         */

        //create new StringBuffer object
        StringBuffer sbfNumbers = new StringBuffer();

        //define the separator you want in the string. This example uses space.
        String strSeparator = "";

        if(intNumbers.length > 0){
            //we do not want leading space for first element
            sbfNumbers.append(intNumbers[0]);
        /** Loop through the elements of an int array. Please
         * note that loop starts from 1 not from 0 because we
         * already appended the first element without leading space.s  */

            for(int i=1; i < intNumbers.length; i++){
                sbfNumbers.append(strSeparator).append(intNumbers[i]);
            }
        }

        System.out.println("int array converted to String using for loop");

        //finally convert StringBuffer to String using toString method
        System.out.println(sbfNumbers.toString());


        /*  METHOD II
         * Second options is to use Arrays class as given below.
         * Use Arrays.toString method to convert int array to String.
         *
         * However, it will return String like [1, 2, 3, 4, 5]
         */

        String strNumbers = Arrays.toString(intNumbers);

        System.out.println("String generated from Arrays.toString method: " + strNumbers);

        //you can use replaceAll method to replace brackets and commas
        strNumbers = strNumbers.replaceAll(", ", strSeparator).replace("[", "").replace("]", "");

        System.out.println("Final String: " + strNumbers);

//        Int_Array_to_String A = new Int_Array_to_String(new int[] {6,7,8}) ;
//            A.get_Array() ;
//
//            A.print_Array();
        }

    }




