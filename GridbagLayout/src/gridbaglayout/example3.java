package gridbaglayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 13.1.2016.
 */
public class example3 {




    public static void main(String[] args) throws Exception{

        JFrame frame = new JFrame();
        Container container = frame.getContentPane();

        GridBagLayout gb1 = new GridBagLayout();
        container.setLayout(gb1);

        GridBagConstraints c = new GridBagConstraints();
        JButton btn1 = new JButton("a");
        JButton btn2 = new JButton("b");

        c.gridx = 1;
        c.gridy = 1;
        gb1.setConstraints(btn1,c);
        container.add(btn1);

        c.gridx = 0;
        c.gridy = 0;
        gb1.setConstraints(btn2,c);
        container.add(btn2);

        //container.add(btn1);
        //container.add(btn2);
        frame.pack();
        frame.setVisible(true);
    }

}
