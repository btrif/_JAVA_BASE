package EDX_UC3Mx_Part_II.WEEK_09.EXAM_09;

//  Created by Bogdan Trif on 30-05-2017 , 7:02 PM.


public class Cohesion_2 {

    /**
     * Prints a lema, the name of an array and an array of double
     *
     * @param lema a string to print before the array
     * @param name the name of the array
     * @param the array
     */
    public static void printArray(String lema, String name, double[] array){
        System.out.println(lema);
        System.out.print(name + " = {");
        for (int i=0; i< array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1]+"}");
    }
    /**
     * Reverses an array of double
     *
     * @param the array
     */
    public static void reverse(double[] array){
        double temp;
        for(int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args){
        double arrayA[] = {0,1,2,3,4};

        printArray("Before reversing", "arrayA", arrayA);
        reverse(arrayA);
        printArray("After reversing", "arrayA", arrayA);
    }

}
