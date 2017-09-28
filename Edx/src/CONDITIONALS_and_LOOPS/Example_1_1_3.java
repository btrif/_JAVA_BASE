package CONDITIONALS_and_LOOPS;

/**
 * Created by Bogdan on 4/26/2017.
 */
public class Example_1_1_3 {
    public static void main(String[] args) {

        int num = 13 * 7 * 23;
        int a = 1;
        while (a <= num / 2) {
            if (num % a == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println(" ");
    }
}

