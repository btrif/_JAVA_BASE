package EDX_UC3Mx_Part_II.WEEK_11;

//  Created by Bogdan Trif on 07-06-2017 , 10:54 AM.


public class Operations_with_Arrays_II {
    /**
     * Operations with Arrays.
     */


        private static void print(String name, int a[]){
            System.out.print(name +" = [");
            for (int i=0; i < a.length-1; i++){
                System.out.print(a[i]+", ");
            }
            System.out.println(a[a.length-1]+"]");
        }

        private static int indexMin(int[] array) {
            int var = 0;
            for (int i = 1; i < array.length -1; i++) {
                if (array[i] < var) {
                    var = i;
                }
            }
            return var;
        }

        private static int min(int[] array) {
            int var = array[0];
            for (int i = 1; i < array.length -1; i++) {
                if (array[i] < var) {
                    var = i;
                }
            }
            return var;
        }

        public static void main(String args[]){
            int[] arrayA = new int[]{0,1,2,3,4,5};
            int[] arrayB = new int[10];

            for (int i = 0; i<10; i++){
                arrayB[i] = (int) (Math.random()*100);
            }

            print("A", arrayA);
            // Complete this sentence. It should behave exactly the same as the previous method call
            //System.out.println("A = "+??????????);
            print("B", arrayB);
            //System.out.println("B = "+?????????);

            System.out.println("min(A) = "+ min(arrayA));
            System.out.println("indexMin(A) = "+ indexMin(arrayA));

            System.out.println("min(B) = "+ min(arrayB));
            System.out.println("indexMin(B) = "+ indexMin(arrayB));
        }

}
