package Project_Euler;

//  Created by Bogdan Trif on 14-07-2017 , 2:11 PM.



public class pb138_Special_Isoscel_Triangles {
    static public void main(String dandy[]){
        double thenTime = System.nanoTime();
        long m=1;
        long sum=0;
        int count=0;
        for(long n=1;n>0;n++){
            long appo=((n*n)-(4*n*m)-(m*m));
            if((appo==1 || appo==-1)){
                sum=sum+((n*n)+(m*m));
                m=n;
                count++;
            }
            if (count==12) n=-1;
        }

        System.out.println(sum);
        double nowTime = System.nanoTime();
        System.out.println("completed in "+(nowTime - thenTime)/1e6 + "  ms");
    }
}

    

