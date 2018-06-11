package Project_Euler;

//  Created by Bogdan Trif on 23-05-2018 , 11:58 AM.


import java.math.BigInteger;

public class repeated_cycles {
                        /*
                    8639/70000 : 0.1234(142857)
                    1/1: 1.
                    1/2: 0.5
                    1/3: 0.(3)
                    1/4: 0.25
                    1/5: 0.2
                    1/6: 0.1(6)
                    1/7: 0.(142857)
                    1/8: 0.125
                    1/9: 0.(1)
                    1/10: 0.1
                    1/11: 0.(09)
                    1/12: 0.08(3)
                    1/13: 0.(076923)
                    1/14: 0.0(714285)
                     etc
                     */
    public static final BigInteger NINE = BigInteger.valueOf(9);

    public static void main(String... args) {
        System.out.println("8639/70000 : " + repeatingFraction(8639, 70000));
        for (int i = 1; ; i++)
            System.out.println("1/" + i + ": " + repeatingFraction(1, i));
    }

    private static String repeatingFraction(long num, long den) {
        StringBuilder sb = new StringBuilder();
        sb.append(num / den);
        sb.append('.');
        num %= den;
        for (int i = 3, lim = (int) Math.sqrt(num); i <= lim; i++) {
            while (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
            }
        }

        while (num > 0) {
            while (den % 2 == 0 && num % 2 == 0) {
                num /= 2;
                den /= 2;
            }
            while (den % 5 == 0 && num % 5 == 0) {
                num /= 5;
                den /= 5;
            }
            // simplify.
            BigInteger nine = NINE;
            BigInteger denBI = BigInteger.valueOf(den);
            long lim = den;
            while (lim % 2 == 0) lim /= 2;
            while (lim % 5 == 0) lim /= 5;
            for (int j = 1; j <= lim; j++, nine = nine.multiply(BigInteger.TEN).add(NINE)) {
                if (nine.mod(denBI).equals(BigInteger.ZERO)) {
                    BigInteger repeat = BigInteger.valueOf(num).multiply(nine).divide(denBI);
                    sb.append('(').append(String.format("%0" + j + "d", repeat)).append(')');
                    return sb.toString();
                }
            }
            num *= 10;
            sb.append(num / den);
            num %= den;
        }
        return sb.toString();
    }

}
