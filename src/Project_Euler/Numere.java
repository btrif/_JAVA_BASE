package Project_Euler;

import java.util.Arrays;

public class Numere {

    public static void main(String s[]) {
        try {
            int lim = 1000000001;  //   Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//            int lim = 100000001;
            int[] sieve = new int[lim];
            Arrays.fill(sieve, 1);

            for (int a = 1; a <= 2 * Math.sqrt(lim); a++) {
                if (a % 100 == 0) {
                    System.out.println("a= " + a);
                }
                int b = 1;
                while ((a * a + b * b) < lim) {
                    int n1 = a * a + b * b;

                    long n2 = (long) a * (long) a + 2 * (long) b * (long) b;
                    long n3 = (long) a * (long) a + 3 * (long) b * (long) b;
                    long n7 = (long) a * (long) a + 7 * (long) b * (long) b;

                    if (sieve[n1] % 5 != 0) {
                        sieve[n1] *= 5;
                    }

                    if (n2 < lim) {
                        if (sieve[(int) n2] % 2 != 0) {
                            sieve[(int) n2] *= 2;
                        }
                    }

                    if (n3 < lim) {
                        if (sieve[(int) n3] % 3 != 0) {
                            sieve[(int) n3] *= 3;
                        }
                    }

                    if (n7 < lim) {
                        if (sieve[(int) n7] % 7 != 0) {
//                            System.out.println("n7 = " + n7 + "    a, b = " + a + " " + b);
                            sieve[(int) n7] *= 7;
                        }
                    }

                    b++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
