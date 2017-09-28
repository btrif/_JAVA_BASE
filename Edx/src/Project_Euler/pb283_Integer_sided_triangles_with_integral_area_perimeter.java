package Project_Euler;

//  Created by Bogdan Trif on 16-09-2017 , 4:08 PM.


import java.util.stream.LongStream;

public class pb283_Integer_sided_triangles_with_integral_area_perimeter {

    static long gCd(long x, long y) {
        if (y == 0)
            return x;
        return gCd(y, x%y);
    }

    /* It uses the method by Markov pdf */
    static long calcSumPerimeters(long m) {
        long sumPerimeters = 0;

        for (long ui = 1; ui <= 2*m; ui++) {
            if ((2*m)%ui == 0) {
                for (long vi = 1; vi <= Math.sqrt(3)*ui; vi++) {
                    if (gCd(ui, vi) == 1) {
                        long d12mult = 4*m*m*(ui*ui + vi*vi);
                        long st = 1;
                        if (ui < vi)
                            st = (2*m/ui)*(vi*vi - ui*ui);
                        for (long i = st; i*i <= d12mult; i++) {
                            if (d12mult%i == 0) {
                                long d1 = i;
                                long d2 = d12mult/i;
                                if ((d1 + 2*m*ui)%vi == 0 && (d2 + 2*m*ui)%vi == 0) {
                                    sumPerimeters += (d1 + 2*m*ui)/vi + (2*m*vi)/ui +
                                            (d2 + 2*m*ui)/vi + (2*m*vi)/ui +
                                            (d1 + d2 + 4*m*ui)/vi;
                                }
                            }
                        }
                    }
                }
            }
        }

        return sumPerimeters;
    }

    public static void main(String[] args) {

        System.out.println(LongStream.rangeClosed(1, 1000).parallel().map(m -> calcSumPerimeters(m)).sum());

    }

}
