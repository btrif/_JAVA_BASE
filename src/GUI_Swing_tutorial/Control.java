package GUI_Swing_tutorial;

//  Created by BTrif Trif on 02-06-2020 , 11:19 AM.


import javax.swing.*;
import java.awt.*;

public class Control extends JFrame {
    // JPanel
    JPanel panel = new JPanel();
    // Buttons
    JButton button1 = new JButton("Add Flight");
    JButton Bogdan_button = new JButton("Remove Flight");

    public Control() {
        // FlightInfo setbounds
        button1.setBounds(60, 400, 220, 30);

        Bogdan_button.setBounds(60, 400, 220, 30);
        Bogdan_button.setLocation(200, 200);

        // JPanel bounds
        panel.setBounds(800, 800, 200, 100);

        // Adding to JFrame
        panel.add(button1);
        panel.add(Bogdan_button);

        add(panel);


        // JFrame properties
        setSize(600, 400);
        setBackground(Color.BLACK);
        setTitle("Air Traffic Control");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Control();
    }
}
