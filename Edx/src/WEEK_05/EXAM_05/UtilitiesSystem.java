package WEEK_05.EXAM_05;

import java.io.* ;

/**
 * Created by Bogdan Trif on 08-05-2017 , 12:47 PM.
 */
public class UtilitiesSystem {

    public static void main (String args[]){
        foo();
    }
    public static void foo (){
        File pwd=new File(System.getProperty("user.dir"));
        System.out.println(pwd) ;
        if (pwd.isDirectory()){
            File [] bar=pwd.listFiles();
            for (int i=0;i<bar.length;i++){
                System.out.println (bar[i].getName());
            }
        }else{
            System.out.println ("Error. The argument is not a directory");
        }
    }

}
