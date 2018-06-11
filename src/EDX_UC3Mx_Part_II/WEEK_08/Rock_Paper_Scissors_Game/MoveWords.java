


package EDX_UC3Mx_Part_II.WEEK_08.Rock_Paper_Scissors_Game;

//  Created by Bogdan Trif on 25-05-2017 , 3:41 PM.



import java.util.Random;

public class MoveWords{

    public static final int TIE = 0;
    public static final int WIN = 1;
    public static final int LOSE = 2;

    private static final String[] validMoves = {"SCISSORS", "PAPER", "ROCK"};
    private static final String[] validCommands = {"QUIT", "HELP"};

    private Random rnd;

    public MoveWords(){
        rnd = new Random();
    }

    public boolean isValidMoveCommand(String value){

        for (int i =0; i< validMoves.length; i++){
            if(validMoves[i].equals(value))
                return true;
        }

        for (int i =0; i< validCommands.length; i++){
            if(validCommands[i].equals(value))
                return true;
        }

        return false;
    }

    public String randomMove(){
        float p = rnd.nextFloat();
        return validMoves[ (int) (p * validMoves.length)];
    }

    public void showMoves(){
        for (String move : validMoves)
            System.out.print(move+" ");
        System.out.println();
    }
    public void showCommands(){
        for (String cmd : validCommands)
            System.out.print(cmd+" ");
        System.out.println();
    }

    public void showWords(){
        showMoves();
        showCommands();
    }

    private static int getIndex(String value){
        for (int i =0; i< validMoves.length; i++){
            if(validMoves[i].equals(value))
                return i;
        }
        return -1;
    }

    public static int checkWinner(String first, String second){
        int first_i, second_i;

        first_i = getIndex(first);
        second_i = getIndex(second);

        if (first_i == second_i) return TIE;

        return (( (first_i +1) % validMoves.length ) == second_i ) ? WIN: LOSE;
    }

}

