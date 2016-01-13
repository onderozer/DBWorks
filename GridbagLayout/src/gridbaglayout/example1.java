package gridbaglayout;

import javax.swing.*;
import javax.swing.border.Border;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 13.1.2016.
 */
public class example1 {

    static  JFrame aWindow = new JFrame("GirdbagLyout");

    public static void main(String[] args) {
        aWindow.setBounds(30,30,300,300);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        aWindow.getContentPane().setLayout(gridbag);
        constraints.weightx = constraints.weighty = 0.1;
        constraints.fill = constraints.BOTH;
        addButton("Press",constraints,gridbag);
        constraints.gridwidth = constraints.REMAINDER;
        addButton("Go",constraints,gridbag);
        aWindow.setVisible(true);

    }

    private static void addButton(String btn, GridBagConstraints constraints, GridBagLayout gridbag) {

        Border edge = BorderFactory.createRaisedBevelBorder();
        JButton button = new JButton(btn);
        button.setBorder(edge);
        gridbag.setConstraints(button,constraints);
        aWindow.getContentPane().add(button);

    }
}
