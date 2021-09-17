package GUI_Swing_tutorial;

//  Created by BTrif Trif on 03-06-2020 , 11:25 AM.

/*
Adding action listeners
Adding action listeners on a JButton is very easy a simple.
JButton class provides a method JButton.addActionListener() which implements
an override method actionPerformed().
Here in the following example I wrote a simple program which says user to enter name,
when user clicks on submit button,
a message “Name has been submitted.” Shows.
Here is the code.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adding_action_listeners {

    adding_action_listeners(){
        JFrame f = new JFrame("Button Example");
        //submit button
        JButton b = new JButton("Submit");
        b.setBounds(100,100,140, 40);

        //enter name label
        JLabel label = new JLabel();
        label.setText("Enter Name :");
        label.setBounds(10, 10, 100, 100);

        //empty label which will show event after button clicked
        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);

        //textfield to enter name
        JTextField textfield= new JTextField();
        textfield.setBounds(110, 50, 130, 30);

        //add to frame
        f.add(label1);
        f.add(textfield);
        f.add(label);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //action listener
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                label1.setText("Name has been submitted: " + textfield.getText() );
                System.out.println(textfield.getText() );
            }
        });
    }


    public static void main(String[] args) {
        new adding_action_listeners();
    }


}
