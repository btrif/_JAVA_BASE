package OOP_Concepts.Classes_basics;

/**
 * Created by Bogdan Trif on 27-04-2017 , 8:54 PM.
 */
public class Account {

    // Attributes of the Class
    static public int totalBank = 0;
    public int MAXLOAN = 400;
    public int totalAccount = 0;


    // Constructor
    public Account(int init){
        if (init > 0)
            totalAccount = init;
        else
            init = 0;
        totalBank += init;
    }

    public int getTotalBank(){
        return totalBank;
    }

    public int getTotalAccount(){
        return totalAccount;
    }

}
