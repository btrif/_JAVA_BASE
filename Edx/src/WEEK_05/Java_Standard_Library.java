package WEEK_05;

import sun.nio.cs.ext.EUC_JP_LINUX;
import sun.util.calendar.BaseCalendar;

import java.net.InetAddress;
import java.net.Inet4Address;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Bogdan Trif on 02-05-2017 , 7:02 PM.
 */
public class Java_Standard_Library {

    // Method to get My local IP Address - IT NEEDS A METHOD TO GET The IP ADDRESS !!!!!!
    public static String getMyLocalIP(){
    InetAddress localHost ;
        try {
            // Get my Machine Local IP address :
            return Inet4Address.getLocalHost().getHostAddress() ;
        }
        catch (Exception e){
            // do nothing
        }
        return "unable to get local IP address" ;

    }
    // Second Method Attempt :
    public static String getMyIP(){
        try {
        return Inet4Address.getLocalHost().getHostAddress() ; }
        catch (Exception e){}
        return "It is not even wrong !" ;
    }

    public static void main(String[] args){
        // Local Time
        double t1 = System.nanoTime() ;
        double t0 = System.currentTimeMillis() ;
        System.out.println(LocalDateTime.MAX );
        System.out.println(LocalDateTime.now() );
        System.out.println(System.currentTimeMillis() );

        System.out.println("Completed in  " + (System.nanoTime() - t1) + "  ns" );
        System.out.println("Completed in  " + (System.currentTimeMillis()- t0) + "  ms" );


        // Networking

        System.out.println( "\nmy Local IP Address  :  " + getMyLocalIP() );
        Inet4Address localhost2 ;
//        System.out.println( "\nmy Local IP Address  :  " + localhost2.getHostAddress().length() );


    }

}
