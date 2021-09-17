package GUI_Swing_tutorial;

//  Created by BTrif Trif on 02-06-2020 , 5:48 PM.


import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

/*
Adding buttons and applying action listener
Similarly you can add buttons to your JFrame.
JButton provides us an easy way to add buttons and action listeners. It has many constructors like

JButton(); creates a button with no text and no icon.

JButton(String text): creates a button with specified text.

JButton(Icon icon); creates a button with specified icon.

JButton(String text, Icon icon); creates a button with specified text and icon.

Here is a simple example of JButton with image icon.
 */


public class SimpleJButton {

    SimpleJButton(){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Play", new ImageIcon( "C:\\GD\\COMPUTING & PROGRAMMING\\Java_dev_repo\\src\\GUI_Swing_tutorial\\play2.png"));
        b.setBounds(100,100,120, 120);
        f.add(b);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SimpleJButton();
    }


}
