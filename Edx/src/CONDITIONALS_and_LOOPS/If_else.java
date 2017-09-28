package CONDITIONALS_and_LOOPS;

/**
 * Created by Bogdan on 4/26/2017.
 */
public class If_else {

    public static void main(String[] args) {
        int numTiles = 8;
        for(int i=0; i<numTiles;i++){
            for(int j=0; j<numTiles;j++){
                if(i==0 || i==numTiles-1){
                    System.out.print("1");
                }else if (i+j==numTiles-1){
                    System.out.print("1");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
