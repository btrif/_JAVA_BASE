package Array_basic;

/**
 * Created by Bogdan on 4/26/2017.
 */
public class Array_3_3_2 {

    static void changeArray(int key, int array[]){

        key = key + 7;

        for (int i = 0; i < array.length; i++){
            array[i] = array[i] + key;
        }

        System.out.println("*At changeArray *");
        System.out.println("The key is: "+ key);
    }

    //   THE ARRAY - Print Array Method
    static void printArray(int array[]){


        System.out.print("[ ");
        for (int element:array){
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        int key = 5;
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        System.out.println("*At the main *");
        System.out.println("The key is: "+ key);

        printArray(array);
        changeArray(key, array);

        System.out.println("*At the main *");
        System.out.println("The key is: "+ key);
        printArray(array);
    }



}
