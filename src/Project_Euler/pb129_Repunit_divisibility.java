package Project_Euler;

//  Created by Bogdan Trif on 19-05-2018 , 1:21 PM.



import java.util.*;
import java.math.*;

public class pb129_Repunit_divisibility {


    public static void main(String[]args) {
        for (long n = 1000001; ; n += 2) {
            if (n % 5 == 0) n += 2;
            long k = 1;

            for (long repunit = 1; repunit != 0; repunit =
                    (repunit * 10 + 1) % n, k++)                ;


            if (k > 1000000) {
                System.out.println(n);
                break;
            }
        }

    }
}



