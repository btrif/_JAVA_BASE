/**
 * Created by Bogdan Trif on 29-04-2017 , 9:48 AM.
 */
public class Euler_Utils {

    public static int gcd(int num1, int num2)     {
        if(num1%num2==0)return num2;
        return gcd(num2,num1%num2);
    }

    public static void main(String[] args){
        System.out.print(gcd (345,45 ));

    }

}
