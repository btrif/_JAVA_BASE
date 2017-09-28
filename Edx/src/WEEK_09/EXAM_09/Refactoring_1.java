package WEEK_09.EXAM_09;

//  Created by Bogdan Trif on 30-05-2017 , 6:11 PM.


public class Refactoring_1 {
    /**
     * Prints a lema, the name of an array and an array of doubles
     *
     * @param lema the lema to print
     * @param name the name of the array
     * @param array the array to print
     */
    public static void method1(String lema, String name, double[] array){
        System.out.println(lema);
        System.out.print(name + " = {");
        for (int i=0; i< array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1]+"}");
    }


    public static void main(String[] args){
        double arrayA[] = {0,1,2,3,4};

        method1("Before reversing", "arrayA", arrayA);

        double temp;
        for(int i = 0; i < arrayA.length / 2; i++){
            temp = arrayA[i];
            arrayA[i] = arrayA[arrayA.length - i - 1];
            arrayA[arrayA.length - i - 1] = temp;
        }

        method1("After reversing", "arrayA", arrayA);
    }
}