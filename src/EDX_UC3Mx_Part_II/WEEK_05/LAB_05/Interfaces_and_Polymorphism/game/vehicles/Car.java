package EDX_UC3Mx_Part_II.WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.vehicles;

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.terrains.Maze ;
import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Explorer ;



/**
 * Created by Bogdan Trif on 04-05-2017 , 6:18 PM.
 */

public class Car implements Explorer{
    private String name;
    public Car(String name){
        this.name = name;
    }
    public char getFootprint(){
        return 'c';

    }
    public void explore(Maze mazeToExplore){
        if (mazeToExplore.findPathFrom(1, 0)) {
            mazeToExplore.print(getFootprint());
        } else {
            System.out.println("no solution found");
        }
    }
}
