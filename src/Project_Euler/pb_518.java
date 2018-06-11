package Project_Euler; /**
 * Created by Bogdan Trif on 29-04-2017 , 9:35 AM.
 */

/** ======  Sun, 31 May 2015, 16:15,  saharsh, India =====
I generated all geometric triplets below 10^8 and subtracted 1 from each term and then check if all three are prime.
 Here's my java code,takes about 10 seconds.. */


public class pb_518 {

        /**
         * @param args
         */
        public static void main(String[] args) {

            long startTime = System.currentTimeMillis();


            // TODO Auto-generated method stub
            int upperlimit = 100000000;
            int i,j,k;
            long answer = 0;
            boolean primes[] = new boolean[upperlimit+1];
            for(i=2;i*i<upperlimit;i+=1)
                if(!primes[i])
                    for(j=i*i;j<=upperlimit;j+=i)
                        primes[j]=true;
            primes[1]=true;
            primes[0]=true;
            for(i=1;i*i<=upperlimit;i++)
                for(j=i+1;j*j<=upperlimit;j++)
                    if(gcd(i,j)==1)
                    {
                        for(k=1;k<=upperlimit/(j*j);k++)
                        {
                            if(!primes[k*i*i-1]&&!primes[k*j*j-1]&&!primes[k*i*j-1])
                            {
                                answer+=(k*(i*i+i*j+j*j));
                                answer-=3;
                            }
                        }
                    }
            System.out.println(answer);

        // Record  the time
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime ;
        System.out.println("\nCompleted in : " + totalTime * Math.pow(10,-3) + " sec\n" );
        }

        public static int gcd(int num1, int num2)     {
            if(num1%num2==0)return num2;
            return gcd(num2,num1%num2);
        }




}
