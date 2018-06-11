package EDX_UC3Mx_Part_II.WEEK_06.EXAM_06;

/**
 * Created by Bogdan Trif on 17-05-2017 , 11:35 AM.
 */

public class generate{
    public static int generate(int x)
    {
        System.out.print(x % 10);
        if ((x / 10) != 0) {
            generate(x / 10);
        }
        return x;
    }
    public static void main(String[] args){
        System.out.println(generate(523));
    }

}


