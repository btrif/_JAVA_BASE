package WEEK_06;

/**
 * Created by Bogdan Trif on 09-05-2017 , 4:20 PM.
 */
public class Printing {
        static double[] divisions(int number, int[] array){
            double [] arrayResults = new double[array.length];
            for (int k = 0; k < array.length; k++) {
                if (array[k] ==0 ){
                    arrayResults[k] = Double.POSITIVE_INFINITY ;
                } else {
                    arrayResults[k] = number/array[k];
                }

            }
            return arrayResults;
        }


        public static void main(String[] args) {
            int [] arr = {5, 12, 0 , 1};

            double[] arrResult= divisions(154, arr);

            for (int i=0; i< arrResult.length;i++){
                System.out.println("array[" + i +"] = "+ arrResult[i]);
            }
        }
}
