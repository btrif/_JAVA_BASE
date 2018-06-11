package Project_Euler;

//  Created by Bogdan Trif on 27-09-2017 , 11:47 PM.


public class pb251_Cardano_Triplets {

    static long a, c, d, e, f, g, h, i, j, k, limt = 1000, m, n, o;
    static double b;

    public static void main(String[] args) {
        for (a = 1; a + b + c <= 110000000/2; a++) {
            if (a%3 != 2) {
                continue;
            }
            if (a < 1000) {
                limt = 1000;
            } else if (a < 10000) {
                limt = 10000;
            } else if (a < 100000) {
                limt = 100000;
            } else {
                limt = 110000000;
            }
            for (c = limt - (a + (long) b); c > 0; c--) {
                d = (a + 1) * (a + 1);
                e = (8 * a) - 1;
                f = d * e;
                g = 27 * c;
                if (f % g == 0) {
                    h = f / g;
                    if (Math.sqrt(h) == (long) Math.sqrt(h)) {
                        b = Math.sqrt(h);
                        if (a + b + c <= 1000) {
                            o++;
                            System.out.println(a + "  " + b + "  " + c);
                        } else {
                            b = 0;
                            continue;
                        }

                    }
                } else {
                    b = 0;
                    continue;
                }
                b = 0;
            }
            c = 1;
        }
        System.out.println(o);
    }

}
