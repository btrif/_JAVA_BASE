package Project_Euler;

//  Created by Bogdan Trif on 16-01-2019 , 4:38 PM.


public class pb201_Subsets_with_a_unique_sum{
    public static void main(String args[]) {
        int cos = 100;
        int tam = 50;
        int jod = 328351;
//int mier[] = {1,3,6,8,10,11};
        long cant[][][] = new long[2][tam+1][jod];
        cant[0][0][0]=1;
        long su = 0;
        for(int n = 1;n<cos+1;n++){
            su = 0;
            int ss = n*n;
            int min = Math.min(n+1,tam+1);
            cant[n%2][0][0]=1;
            for(int m = 1;m<min;m++){
                for(int s = 0;s<jod;s++){
                    cant[n%2][m][s] = (s>=ss?cant[1-(n%2)][m-1][s-ss]:0)+cant[1-(n%2)][m][s];
                    if(m==50 && cant[n%2][m][s]==1)su+=s;
                }
            }
        }
        System.out.println(su);
    }
}
