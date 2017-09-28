package Algorithms;

//  Created by Bogdan Trif on 04-09-2017 , 8:00 PM.


import java.util.ArrayList;
import java.util.BitSet;

public class Prime_Sieves {

    private static long[] as = {2, 7, 61};

    private static long modpow(long x, long c, long m) {
        long result = 1;
        long aktpot = x;
        while (c > 0) {
            if (c % 2 == 1) {
                result = (result * aktpot) % m;
            }
            aktpot = (aktpot * aktpot) % m;
            c /= 2;
        }
        return result;
    }

    private static boolean millerRabin(long n) {
        outer:
        for (long a : as) {
            if (a < n) {
                long s = 0;
                long d = n - 1;
                while (d % 2 == 0) {
                    s++;
                    d /= 2;
                }

                long x = modpow(a, d, n);
                if (x != 1 && x != n - 1) {
                    for (long r = 1; r < s; r++) {
                        x = (x * x) % n;
                        if (x == 1) {
                            return false;
                        }
                        if (x == n - 1) {
                            continue outer;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean IsPrimeMR(long num) {
        if (num <= 1) {
            return false;
        } else if (num <= 3) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            return millerRabin(num);
        }
    }
    public static int[] primes(int min, int max) {
        ArrayList<Integer> primesList = new ArrayList<Integer>();

        for( int i=min; i<max; i++ ){
            if( IsPrimeMR(i) ){
                primesList.add(i);
            }
        }

        int[] primesArray = new int[primesList.size()];
        for(int i=0; i<primesArray.length; i++){
            primesArray[i] = (int) primesList.get(i);
        }
        return primesArray;
    }


    public static String tostring (int [] arr){
        String ans="";
        for (int i=0; i<arr.length;i++){
            ans= ans+arr[i]+ " ";
        }
        return ans;
    }
    public static int closestPrime(int num) {
        int count=1;
        for (int i=num;;i++){
            int plus=num+count, minus=num-count;
            if (IsPrimeMR(minus)){
                return minus;
            }

            if (IsPrimeMR(plus)) {
                return plus;
            }
            count=count+1;
        }
    }


    public static boolean isPrime(int number)    {
        int boundary = (int)Math.floor(Math.sqrt(number));
        if (number < 2) { return false ;}
        for (int i = 2; i * i <= number; i++)
        {
            if (number % i == 0) { return false ; }
        }
        return true;
    }

//    ArrayList<> Sieve of Eratosthenes
// https://stackoverflow.com/questions/586284/finding-prime-numbers-with-the-sieve-of-eratosthenes-originally-is-there-a-bet

    // Return primes less than limit
    static ArrayList<Integer> EratosthenesSieve1(int limit) {
        final int numPrimes = countPrimesUpperBound(limit);
        ArrayList<Integer> primes = new ArrayList<Integer>(numPrimes);
        boolean [] isComposite    = new boolean [limit];   // all false
        final int sqrtLimit       = (int)Math.sqrt(limit); // floor
        for (int i = 2; i <= sqrtLimit; i++) {
            if (!isComposite [i]) {
                primes.add(i);
                for (int j = i*i; j < limit; j += i) // `j+=i` can overflow
                    isComposite [j] = true;
            }
        }
        for (int i = sqrtLimit + 1; i < limit; i++)
            if (!isComposite [i])
                primes.add(i);
        return primes;
    }

//    Formula for upper bound of number of primes less than or equal to max (see wolfram.com):
//    http://mathworld.wolfram.com/PrimeCountingFunction.html

    static int countPrimesUpperBound(int max) {
        return max > 1 ? (int)(1.25506 * max / Math.log((double)max)) : 0;
    }



//    I have a really efficient implementation:
//    we don't keep the even numbers, therefore halving the memory usage.
//    we use BitSet, requiring only one bit per number.
//    we estimate the upper bound for number of primes on the interval,
//    thus we can set the initialCapacity for the Array appropriately.
//    we don't perform any kind of division in the loops.
//    Here's the code:

    public ArrayList<Integer> PrimeSieve(int n) {
        int upperBound = (int) (1.25506 * n / Math.log(n));
        ArrayList<Integer> result = new ArrayList<Integer>(upperBound);
        if (n >= 2)
            result.add(2);

        int size = (n - 1) / 2;
        BitSet bs = new BitSet(size);

        int i = 0;
        while (i < size) {
            int p = 3 + 2 * i;
            result.add(p);

            for (int j = i + p; j < size; j += p){
                bs.set(j);  }

            i = bs.nextClearBit(i + 1);
        }
        return result;
    }

//    http://www.geeksforgeeks.org/sieve-of-eratosthenes/

    void  EratosthenesSieve2(int n)    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)    {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p) {
                    prime[i] = false; }
            }
        }

        // Print all prime numbers
//        int upperBound = (int) (1.25506 * n / Math.log(n)) ;
//        int[] primes = new int[upperBound] ;
//        int cnt = 0 ;
        for(int i = 2; i <= n; i++)     {
            if(prime[i] == true) {
//                primes[cnt] = i ;
//                cnt+=1 ;
                System.out.print(i + " ");
            }
        }
//        return primes ;
    }




    public static void main(String args[])   {
        int n = (int) 1e7 ;
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        Prime_Sieves SE = new Prime_Sieves();

        //
        double start = System.nanoTime() ;

        ArrayList<Integer> sieve1 =  SE.EratosthenesSieve1(n) ;
        System.out.println("Last number in the sieve is :\t" + sieve1.get(sieve1.size()-1) );

        System.out.println("\n Completed in  " + (System.nanoTime() - start)/1e6 + "  ms" );

        //
        double start2 = System.nanoTime() ;

        ArrayList<Integer> sieve2 =  SE.PrimeSieve(n) ;
        System.out.println("Last number in the sieve is :\t" + sieve2.get(sieve2.size()-1) );

        System.out.println("\n Completed in  " + (System.nanoTime() - start2)/1e6 + "  ms" );

        //
        double start3 = System.nanoTime() ;
        int m = (int) 1e2 ;
        System.out.println("\nPrime numbers up to "+ m+ " : \n");
        SE.EratosthenesSieve2(m) ;


        System.out.println("\n Completed in  " + (System.nanoTime() - start3)/1e6 + "  ms" );



    }

}
