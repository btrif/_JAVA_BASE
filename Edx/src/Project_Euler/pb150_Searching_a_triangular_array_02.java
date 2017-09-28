package Project_Euler;

//  Created by Bogdan Trif on 02-09-2017 , 12:39 PM.

/*
Sun, 2 Jul 2017, 01:18,  thatisme1, Java, Pakistan
Solved using dynamic programming by caching sums of triangles rooted at each point.
        Coded in java; runs in 1400ms on i5. */

import java.util.concurrent.TimeUnit;


public class pb150_Searching_a_triangular_array_02 {


        static final int NUMBERS_TO_GENERATE = 500500;
        static final int TRIANGLE_SIZE = 1000;
        static final int OLD_SUM = 1;
        static final int ORG_NUM = 0;
        static final int SUM = 2;
        static final int MAX_TRG_SZ = 1000;

        // 3 indexes for keeping old sum, sum and actual number
        long[][][] matrix = new long[TRIANGLE_SIZE][TRIANGLE_SIZE][3];

        /**
         * Generate numbers into 3d matrix.
         */
        void generateNumbers() {

            int numberInRow = 0;
            int rowSize = 1;
            final long twoPow19 = (long) Math.pow(2, 19);
            final long twoPow20 = (long) Math.pow(2, 20);
            long t = 0;
            for (int k = 1; k <= NUMBERS_TO_GENERATE; ++k) {
                t = (615949 * t + 797807) % twoPow20;

                long num = t - twoPow19;

                matrix[rowSize - 1][numberInRow][ORG_NUM] = num;
                matrix[rowSize - 1][numberInRow][OLD_SUM] = num;
                matrix[rowSize - 1][numberInRow][SUM] = num;

                numberInRow++;

                if (numberInRow == rowSize) {
                    rowSize++;
                    numberInRow = 0;
                }
            }
        }

        long minSum() {
            long minSum = Long.MAX_VALUE;
            // increase size in loop
            for (int trSz = 2; trSz < MAX_TRG_SZ; ++trSz) {
                // move from top to the bottom row
                for (int row = 0; row <= MAX_TRG_SZ - trSz + 1; ++row) {

                    // if sum was calculated in last iteration but cannot be
                    // calculated now due to absence of more rows at the bottom,
                    // then
                    // copy sum in old sum
                    if (row == MAX_TRG_SZ - trSz + 1) {
                        for (int col = 0; col < row + 1; ++col) {
                            matrix[row][col][OLD_SUM] = matrix[row][col][SUM];
                        }

                    } else {
                        for (int col = 0; col < row + 1; ++col) {
                            int requiredSize = trSz - 1;

                            long sum = matrix[row][col][ORG_NUM];

                            sum += (matrix[row + 1][col][SUM] + matrix[row + 1][col + 1][SUM]);

                            // remove the common part from the 2 sub triangles
                            if (requiredSize > 1) {
                                sum -= matrix[row + 2][col + 1][OLD_SUM];
                            }

                            matrix[row][col][OLD_SUM] = matrix[row][col][SUM];
                            matrix[row][col][SUM] = sum;

                            if (sum < minSum) {
                                minSum = sum;
                            }
                        }
                    }
                }
            }
            return minSum;
        }

        public static void main(String[] args) {
            System.out.println("Euler 150 :");
            long start = System.nanoTime();
            pb150_Searching_a_triangular_array_02 euler150 = new pb150_Searching_a_triangular_array_02();
            euler150.generateNumbers();

            System.out.println("Minimum Sum: " + euler150.minSum());

            long end = System.nanoTime();
            System.out.println("Elapsed Time (ms): " + TimeUnit.NANOSECONDS.toMillis(end - start));
        }
    }
