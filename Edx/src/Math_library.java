/**
 * Created by Bogdan Trif on 03-05-2017 , 10:47 AM.
 */
public class Math_library {
    // Methods
    double a;

    public void Coin(){

        a = Math.random();
        if (a>=0.5){
            System.out.println ("A");
        }else{
            System.out.println ("B");
        }
    }

    public void Dice(){
        a = (Math.random()*5)+1;
        if (a < 1){
            System.out.println ("A");
        }else if (a < 2){
            System.out.println ("B");
        }else if (a < 3){
            System.out.println ("C");
        }else if (a < 4){
            System.out.println ("D");
        }else if (a < 5){
            System.out.println ("E");
        }else{
            System.out.println ("F");
        }
    }

    public void Bingo(){
        for (int i=0;i<50;i++){
            a = Math.random()*100;
            int b = (int) a ;
            System.out.println ("Ball i: "+ i + "    b=" + b  );
        }
    }

    // MAIN
    public static void main(String[] args) {
        // PYthagorean Theorem
        double base = 5;
        double height = 12;
        double hypotenuse = Math.sqrt(Math.pow(base, 2)
                + Math.pow(height, 2));
        System.out.println(hypotenuse);

        // Random Numbers :
        System.out.println( Math.random());
        // Which API call returns a random number greater than or equal to 10.0 and less than 100.0?
        System.out.println("Random number between 10 and 100 : \t" + Math.random() *90 +10  );
        Math_library x = new Math_library() ;
        System.out.println("Coin : ");
        x.Coin() ;
        System.out.println("Dice : ");
        x.Dice() ;
        System.out.println(" ------  Bingo ------------ ");
//        x.Bingo();
    }
}
