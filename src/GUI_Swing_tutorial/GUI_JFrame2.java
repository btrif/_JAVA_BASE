package GUI_Swing_tutorial;

//  Created by BTrif Trif on 02-06-2020 , 5:46 PM.


import javax.swing.*;
import java.awt.*;

public class GUI_JFrame2 {
    static JTextField textfield1, textfield2, textfield3;

    public static void main(String[] args) {

        JFrame f = new JFrame("Text Field Examples");
        f.getContentPane().setLayout(new FlowLayout());
        textfield1 = new JTextField("Text field 1",10);
        textfield2 = new JTextField("Text field 2",10);
        textfield3 = new JTextField("Text field 3",10);
        f.getContentPane().add(textfield1);
        f.getContentPane().add(textfield2);
        f.getContentPane().add(textfield3);

        f.pack();
        f.setVisible(true);
    }


}
