package EDX_UC3Mx_Part_II.WEEK_07.UnitTesting;

/**
 * Created by Bogdan Trif on 22-05-2017 , 10:59 AM.
 */
public class Calculator {

    private static int result;

    public void add(int n){
        result += n;
    }

    public void subtract(int n){
        result -= n;
    }

    public void square(int n){
        result = n*n;
    }

    public int getResult(){
        return result;
    }
}
