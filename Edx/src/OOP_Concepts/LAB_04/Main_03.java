package OOP_Concepts.LAB_04;

/**
 * Created by Bogdan Trif on 01-05-2017 , 7:59 PM.
 */
public class Main_03 {

    public static void main(String[] args){
        System.out.println("Setting up the character");
        Character_03 heroJohn = new Character_03("John",
                "A clever boy of 16 years", 10, 5);
        heroJohn.printInfo();

        //Changing Character Name
        System.out.println("Modifiying the character");
        heroJohn.setName("Roger Federer");
	    /*to do: change description and secretWeapon by a call to their
	      set methods */
        heroJohn.setDescription("The best tennis player of all times.");
        heroJohn.setSecretWeapon(1000);
        heroJohn.setHealth(2345);
        //Try this 3 sentences you can observe that does not work because
        //the attributes are private in Character Class
        //heroJohn.description = "A clever boy of 18 years";
        //heroJohn.secretWeapon =5;
        heroJohn.printInfo();
    }

}
