package DATA_STRUCTURES;

//  Created by Bogdan Trif on 10-10-2017 , 10:40 AM.

import java.util.*;

// Demonstrate a Hashtable

public class Dictionary {
    public static void main(String args[]) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("John Doe", new Double(3434.34));
        balance.put("Tom Smith", new Double(123.22));
        balance.put("Jane Baker", new Double(1378.00));
        balance.put("Todd Hall", new Double(99.22));
        balance.put("Ralph Smith", new Double(-19.08));
// Show all balances in hash table.
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " +  balance.get(str));
        }
        System.out.println();
// Deposit 1,000 into John Doe's account
        bal = ((Double) balance.get("John Doe")).doubleValue();
        balance.put("John Doe", new Double(bal + 1000));
        System.out.println("John Doe's new balance: " +
                balance.get("John Doe"));
        balance.put("John Doe", "Raducioiu");


        System.out.println("Check the existence of a key : " + (balance.containsKey("John Doe")));
        Enumeration joko;
        String kac;
        joko = balance.keys();
        while (joko.hasMoreElements()) {
            kac = (String) joko.nextElement();
            System.out.println(kac + ": " + balance.get(kac)  );
        }

    }
}
