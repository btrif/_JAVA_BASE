package EDX_UC3Mx_Part_II.WEEK_06.EXAM_06;

import java.io.File;

/**
 * Created by Bogdan Trif on 17-05-2017 , 10:19 AM.
 */

class UtilitiesSystem{
    public static void main (String[] args){
        foo();
    }
    public static void foo(){
        File pwd = new File("user.dir") ;
        if (pwd.isDirectory()){
            File [] bar=pwd.listFiles();
            for (int i=0;i<bar.length;i++){
                System.out.println(bar[i].getName());
            }
        }else{
            System.out.println ("Error. The argument is not a directory");
        }
    }
}
