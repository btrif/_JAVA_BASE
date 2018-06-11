package Project_Euler;

//  Created by Bogdan Trif on 25-09-2017 , 8:44 PM.
// Sun, 3 Oct 2010, 03:30 , kevinsogo, Philippines


import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Double.*;
import static java.math.BigInteger.*;
import static java.util.Arrays.*;

public class pb304_Primonacci_2 {
    static long time = nanoTime();
    static String tim() {
        return (nanoTime() - time) * 1e-9 + " s.";
    }
    static void time() {
        out.println(tim());
    }
    static long mod2 = 1234567891011L;
    static BigInteger mod = BigInteger.valueOf(mod2);
    public static void main (String args[]) {
        int n = args.length == 0 ? 100000 : Integer.parseInt(args[0]);
        long off = 100000000000000L;
        boolean c[] = new boolean[(int)(10 * n * log(n) + 1)];
        int L = (int)ceil(sqrt(off + c.length));
        boolean c2[] = new boolean[L];
        for (int i = 2; i * i < L; i++) {
            if (!c2[i]) {
                for (int j = i * i; j < L; j += i) {
                    c2[j] = true;
                }
            }
        }
        for (int i = 2; i < L; i++) {
            if (!c2[i]) {
                for (long j = off / i * i; j < off + c.length; j += i) {
                    if (j >= off && j != i)
                        c[(int)(j - off)] = true;
                }
            }
        }
        BigInteger v[][] = exp(new BigInteger[][]{{ONE, ONE}, {ONE, ZERO}}, off - 1);
        long f0 = v[0][1].longValue();
        long f1 = v[0][0].longValue();
        long sum = 0;
        for (int i = 1, j = 0; i <= n; i++) {
            long f2 = (f0 + f1) % mod2;
            f0 = f1;
            f1 = f2;
            j++;
            while (c[j]) {
                f2 = (f0 + f1) % mod2;
                f0 = f1;
                f1 = f2;
                j++;
            }
            sum += f1;
            sum %= mod2;
        }
        out.println(sum);
        time();
    }
    static BigInteger[][] exp(BigInteger b[][], long e) {
        if (e == 0) return new BigInteger[][] {{ONE, ZERO}, {ZERO, ONE}};
        if (e == 1) return b;
        if ((e & 1) == 0) return exp(mul(b, b), e >> 1);
        return mul(b, exp(b, e - 1));
    }
    static BigInteger[][] mul(BigInteger a[][], BigInteger b[][]) {
        return new BigInteger[][]{
                {
                        a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])).remainder(mod),
                        a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1])).remainder(mod),
                },
                {
                        a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])).remainder(mod),
                        a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1])).remainder(mod),
                },
        };
    }
    
}
