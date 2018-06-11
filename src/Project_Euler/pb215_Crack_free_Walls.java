package Project_Euler;

//  Created by Bogdan Trif on 02-05-2018 , 1:07 PM.


import java.util.ArrayList;
import java.util.Arrays;

public class pb215_Crack_free_Walls {


    int w = 32;
    int h = 10;
    int[] bits = new int[32];
    ArrayList<Integer> rows = new ArrayList<Integer>();

    public long Crack_free_Walls() {

        int x = 1;
        for (int i = 0; i<32; i++) {
            bits[i] = x;
            x *= 2;
        }

        rec(1,0);
        rec(2,0);

        ArrayList<ArrayList<Integer>> cons = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<rows.size(); i++) {
            cons.add(new ArrayList<Integer>());
        }

        for (int i = 0; i<rows.size(); i++) {
            for (int j = i+1; j<rows.size(); j++) {
                if ((rows.get(i)&rows.get(j)) == 0) {
                    cons.get(i).add(j);
                    cons.get(j).add(i);
                }
            }
        }

        long[] counts = new long[rows.size()];
        Arrays.fill(counts,1);

        for (int i = 0; i<h-1; i++) {
            long[] next = new long[counts.length];
            for (int j = 0; j<counts.length; j++) {
                for(int k : cons.get(j)) {
                    next[k] += counts[j];
                }
            }
            counts = next;
        }

        long sum = 0;
        for (int i = 0; i<counts.length; i++)
            sum += counts[i];

    System.out.println(sum);
    return sum ;

    }

    private void rec(int pos, int row) {
        if (pos > w-2) {
            if (pos == w-1)
                rows.add(row);

        } else {
            row |= bits[pos];
            rec(pos+2,row);
            rec(pos+3,row);
        }
    }

    public static void main(String[] args) {        // Crack_free_Walls : 806844323190414

        double t1 = System.nanoTime() ;     // Compute the time

        pb215_Crack_free_Walls  CFW = new pb215_Crack_free_Walls() ;

        System.out.println( "\nCrack_free_Walls : "  + CFW.Crack_free_Walls() );

        System.out.println("\n#Completed in  " + (System.nanoTime() - t1)/1e6 + "  ms" );



    }

}
