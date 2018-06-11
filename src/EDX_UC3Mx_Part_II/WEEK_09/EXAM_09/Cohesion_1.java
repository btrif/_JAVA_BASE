package EDX_UC3Mx_Part_II.WEEK_09.EXAM_09;

//  Created by Bogdan Trif on 30-05-2017 , 7:02 PM.


public class Cohesion_1 {
    /**
     * Prints the content of an array of double, reverses it and prints it again
     *
     * @param name the name of the array
     * @param array the array of double
     */
    public static void reverse(String name, double[] array){
        double temp;
        System.out.println("Before reversing");
        System.out.print(name + " = {");
        for (int i=0; i< array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1]+"}");

        for(int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("After reversing");
        System.out.print(name + " = {");
        for (int i=0; i< array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1]+"}");

    }

    public static void main(String[] args){
        double arrayA[] = {0,1,2,3,4};

        reverse("arrayA",arrayA);

    }

}
