package Project_Euler;

//  Created by Bogdan Trif on 08-12-2017 , 12:03 AM.
//Sat, 3 Sep 2011, 15:02,         Raman, India


import java.lang.*;

public class pb276 {

    public static long primitive_triangles(long limit)    {

        long grand = 0;
        for(long i=1 ; i < limit/3 ; i++)        {
            limit = limit/i ;

            long total=0 ;
            for(long a=1 ; a < limit/3 ; a++)            {
// For perimeters not exceeding Limit for which it becomes a+b<=c
                long min_b=a ;
                long max_b=((limit+1)/2)-a ;

                long min_c = a ;
                long max_c = a ;

                long no_c=(max_b-min_b+1) ;

                if(max_b>=min_b)                {
                    total=total+((min_c+max_c)*(no_c)/2) ;
                }

// For perimeters which are exceeding Limit

                min_b = Math.max(a,max_b+1) ;
                max_b = ((limit+1)/2)-((a+1)/2) ;

                min_c = (limit-a-min_b)-(min_b)+1 ;
                max_c = (limit-a-max_b)-(max_b)+1 ;

                no_c = (max_b-min_b+1) ;

                if(max_b >= min_b)        {
                    total = total + ((min_c+max_c)*(no_c)/2);
                }

    }

            long j = Mobius(i);
/*
if(limit==3)
total=1; // 1 1 1
if(limit==4)
total=1;
if(limit==5)
total=2; // 1 2 2
if(limit==6)
total=3; // 2 2 2
if(limit==7)
total=5; // 1 3 3; 2 2 3
if(limit==8)
total=6; // 2 3 3
if(limit==9)
total=9; // 1 4 4; 2 3 4; 3 3 3
if(limit==10)
total=11; // 2 4 4; 3 3 4
*/
            grand = grand+j*total;
            System.out.println(i+" "+total+" "+j);
            }

    System.out.println("\nAnswer : "+ grand ) ;
    return grand ;

}

    static int Mobius(long n)    {
        if(n==1)
            return 1;

        if(n==2||n==3)
            return -1;

        if(n%4==0)
            return 0;

        int Mu=1;
        if(n%2==0)         {
            Mu=Mu*(-1);
            n=n/2;        }

        long p=3;
        while(p*p<=n)        {
            if(n%(p*p)==0)
                return 0;

            if(n%p==0)            {
                Mu=Mu*(-1);
                n=n/p;            }

            p=p+2;
        }

    if (n>1)        {
        Mu=Mu*-1;        }

    return Mu;

    }

    public static void main(String[] args) {
        System.out.println( primitive_triangles(100 ) ) ;


    }

}
