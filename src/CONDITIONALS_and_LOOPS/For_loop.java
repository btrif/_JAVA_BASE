package CONDITIONALS_and_LOOPS;

/**
 * Created by Bogdan on 4/25/2017.
 */


//////////// ======== 2
public class For_loop {

    public static void main(String[] args) {
        for(int i=20; i >= 0; i--){
            System.out.print(i);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}

