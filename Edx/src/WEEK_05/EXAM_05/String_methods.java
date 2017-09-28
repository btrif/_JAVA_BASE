package WEEK_05.EXAM_05;

/**
 * Created by Bogdan Trif on 08-05-2017 , 12:24 PM.
 */
public class String_methods {

    public static void main(String[] args) {

        String a=new String ("abcdefg");
        String b=new String ("ABCDEFG");
        String c=new String ("AbcdefG");
        String d=new String ("cde");

        System.out.println (a.equalsIgnoreCase(b)); //TRUE
        System.out.println (a.equals(b));   // FALSE
        System.out.println (c.substring(2,4));  //cd

    }

}
