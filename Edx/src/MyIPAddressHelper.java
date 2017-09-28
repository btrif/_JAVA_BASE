/**
 * Created by Bogdan Trif on 02-05-2017 , 9:41 PM.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;

/**
 * A helper class provided for Dartmouth's CS 10 -- allows you to easily get your
 * IP address as it is inside/outside your current network.
 *
 * @author Travis Peters, Dartmouth CS 10, Winter 2015
 *
 */
public class MyIPAddressHelper {

    /**
     * Get your machine's IP address as it is INSIDE of your current network (e.g., Dartmouth's network).
     * Not super robust...
     */
    public static String getMyLocalIP() {
        InetAddress localHost;
        try {
            // Get your machine's local IP address.
            return Inet4Address.getLocalHost().getHostAddress();
        } catch (Exception e) {
            // do nothing...
        }
        return "unable to get local IP address.";
    }

    /**
     * Get your machine's IP address as it is OUTSIDE of my current network (e.g., Dartmouth's network).
     */
    public static String getMyGlobalIP() {
        try {
            URL whatismyip;
            whatismyip = new URL("http://checkip.amazonaws.com/");
            BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
            String ip = in.readLine(); // Get the IP address as a String
            in.close();
            return ip;
        } catch (Exception e) {
            // do nothing...
        }
        return "unable to get global IP address.";
    }

    public static void main(String[] args) {
        System.out.println("What is my IP Address INSIDE of my current network : " + getMyLocalIP());
        System.out.println("What is my IP Address OUTSIDE of my current network: " + getMyGlobalIP());
    }

}
