package EDX_UC3Mx_Part_II.WEEK_08.Rock_Paper_Scissors_Game;

//  Created by Bogdan Trif on 25-05-2017 , 3:42 PM.


import java.util.Scanner;

public class Parser{
    private MoveWords moves;
    private Scanner reader;


    // Constructor
    public Parser(){
        moves = new MoveWords();
        reader = new Scanner(System.in);
    }

    // Methods

    public void showCommands(){
        moves.showWords();
    }

    public Move newRandomMove(){
        return new Move(moves.randomMove());
    }


    public Move getMove(){

        String command = null;
        System.out.print("Your move: ");

        String input = reader.nextLine();

        Scanner tokenizer = new Scanner(input);

        if(tokenizer.hasNext()) {
            // get first word
            command = tokenizer.next().toUpperCase();
            if(tokenizer.hasNext()) {
                // note: if the command has two or more words, it is not
                // valid
                return new Move();
            }
        }

        if ( (command != null) && (moves.isValidMoveCommand(command)) )
            return new Move(command);

        // we return a move with no associated command, as it is unknown.
        return new Move();
    }
}

