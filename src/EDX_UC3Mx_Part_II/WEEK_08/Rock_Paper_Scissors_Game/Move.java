package EDX_UC3Mx_Part_II.WEEK_08.Rock_Paper_Scissors_Game;

//  Created by Bogdan Trif on 25-05-2017 , 3:41 PM.

/*

* @startuml

* Bob -> Alice : hello this morning
* Alice --> Bob : ok

* @enduml

*/


/**
 * Class that stores a move
 */

public class Move{

    private String move;

    // CONTRUCTORS
    public Move(){
        this.move = null;
    }

    public Move(String move){
        this.move = move;
    }


    //  Methods
    public String getMove(){
        return move;
    }

    public boolean isUnknown(){
        return (move == null);
    }

    public int beats(Move other){
        return MoveWords.checkWinner(this.move, other.getMove());
    }
}

