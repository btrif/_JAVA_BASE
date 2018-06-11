package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 12:15 PM.


public class Average {

    static double aver(double array[]){
        double average = 0;
        double number;
        for (int i= 0; i< array.length; i++){
            number = array[i] / array.length;
            average += number;
        }
        return average;
    }

    static double aver2(double array[]){
        double average = 0;
        double number;
        for (int i= 0; i< array.length; i++){
            number = array[i];
            average += number;
        }
        return average / array.length;
    }


    public static void main(String args[]){
        // Creation of a random array of length 10000
        double array[] = new double[10000];
        for(int i=0; i<array.length; i++) {
            array[i] = (double) Math.random() *500;
        }

        for(int i=0; i<array.length ; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("Result 1st Algorithm: " + aver(array));
        System.out.println("Result 2nd Algorithm: " + aver2(array));

        // Now, we are going to measure the time.

        long beginning, end;
        int times = 1000;

        // First algorithm
        beginning = System.nanoTime();
        for (int i = 0; i < times; i++){
            aver(array);
        }
        end = System.nanoTime();

        System.out.println("\nTime 1st Algorithm: "+ ((end - beginning) / times)+ " ns \n");

        // Second Algorithm
        beginning = System.nanoTime();
        for (int i = 0; i < times; i++){
            aver2(array);
        }
        end = System.nanoTime();

        System.out.println("Time 2nd Algorithm: "+ ((end - beginning) / times) + " ns \n");
    }


}
