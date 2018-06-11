package EDX_UC3Mx_Part_II.WEEK_05.EXAM_05;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TimeZone;

/**
 * Created by Bogdan Trif on 05-05-2017 , 1:11 PM.
 */



public class Play_with_Packages {

    public static void main(String[] args) {


        // DETERMINE & PRINT SYSTEM PROPERTIES ;
        Properties P = System.getProperties() ;
        Enumeration keys = P.keys() ;
        while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)P.get(key);
            System.out.println(key + ": " + value);
        }



        ////////////////
        System.out.println();
        String a[] = { "asd" , "asd3", "sdsa"} ;
        for (int i=0; i<a.length ; i++ ) {
            System.out.println(a[i]);
        }


        ////////    Get the default time zone for the host where the program is running
        TimeZone T = TimeZone.getDefault() ;
        System.out.println( T  + "\n" + T.getID() + "\n" + T.getDisplayName() );
        System.out.println();

        /// Get Available Zone ID's :

        for (String id : TimeZone.getAvailableIDs())     {
            if (id.matches("(?i).*?est.*")) {
                System.out.println(id);
                System.out.println(TimeZone.getTimeZone(id).getDisplayName());
            }
        }
        System.out.println();

        //    Check whether a file (path) is a directory

        File file =new File("Exam_3.java") ;
        System.out.println("Check whether a path is a File or Folder :  \n" +"The path "
                + file +"  " + file.isDirectory() );

        }

//        System.out.print(System.getProperties() ) ;


}
