package EDX_UC3Mx_Part_II.WEEK_08;

//  Created by Bogdan Trif on 24-05-2017 , 12:00 PM.


public class Multiply {

    static int multiply (int a, int b){
        int sum = 0;
        for (int i=0; i < a; i++){
            System.out.print("*");
            sum += b;
        }
        return sum;
    }


    static int multiply2 (int a, int b){
        int sum = 0;
        int limit, toSum;
        if (a<b){
            limit = a;
            toSum = b;
        }
        else {
            limit = b;
            toSum = a;
        }
        for (int i = 0; i < limit; i++){
            System.out.print("+");
            sum += toSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 30 ;
        int b = 20 ;

        double tStart = System.nanoTime();  // Start time count
        int result = multiply(a,b);
        System.out.println("\nResult: "+result);

        System.out.println("Completed in " + (System.nanoTime() - tStart) + " ns\n" );


        double tStart2 = System.nanoTime();  // Start time count
        result = multiply2(a,b);
        System.out.println("\nResult2 : "+result);
        System.out.println("Completed in " + (System.nanoTime() - tStart2) + " ns\n" );


    }

}
