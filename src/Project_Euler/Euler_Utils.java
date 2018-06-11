package Project_Euler;

//  Created by Bogdan Trif on 03-09-2017 , 6:11 PM.


public class Euler_Utils {

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public int gcd3(int a, int b, int c) {
        return gcd(gcd(a, b) ,c );
    }

//    Or the Euclidean algorithm for calculating the GCD...
    public int egcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

}
