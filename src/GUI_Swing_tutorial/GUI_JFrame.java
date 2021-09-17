package GUI_Swing_tutorial;

//  Created by BTrif Trif on 29-05-2020 , 5:49 PM.
//https://www.guru99.com/java-swing-gui.html


import javax.swing.*;


public class GUI_JFrame {
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI - Bogdan Trif");
        // JFrame Properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setLocationRelativeTo(null);  // position on the screen;

        // JPanel bounds
        frame.setBounds(800, 800, 200, 100);

        JButton button1 = new JButton("Button 1");
        button1.setLocation(10,10);

        JButton button2 = new JButton("Button 2");
        button2.setLocation(200,100);

        frame.add(button1); // Adds Button to content pane of frame
        frame.add(button2); // Adds Button to content pane of frame

        frame.setVisible(true);
    }
}

