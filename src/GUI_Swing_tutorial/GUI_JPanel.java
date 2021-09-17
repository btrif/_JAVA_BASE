package GUI_Swing_tutorial;

//  Created by BTrif Trif on 29-05-2020 , 5:49 PM.
//https://www.guru99.com/java-swing-gui.html


import javax.swing.*;


public class GUI_JPanel {
    public static void main(String args[]){
        JPanel panel = new JPanel();


        // JPanel bounds
        panel.setBounds(800, 800, 200, 100);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(60, 400, 220, 30);
        button1.setLocation(10,10);

        JButton button2 = new JButton("Button 2");
        button2.setLocation(200,100);

        panel.add(button1); // Adds Button to content pane of frame
        panel.add(button2); // Adds Button to content pane of frame


        // JPanel Properties
//        panel.s setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(600,300);
        panel.setVisible(true);



    }
}

