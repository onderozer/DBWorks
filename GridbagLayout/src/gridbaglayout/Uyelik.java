package gridbaglayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.1.2016.
 */
public class Uyelik extends JFrame {

    public Uyelik(){

        initGUI();
    }

    private void initGUI() {

        this.setTitle("Uyelik Formu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new GridBagLayout());
        this.getContentPane().add(mainpanel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 3, 3, 3);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainpanel.add(panel1(),gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainpanel.add(panel2(),gbc);

        this.pack();
        this.setVisible(true);


    }

    private JPanel panel1()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createLineBorder(null));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Ad                    "),gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JLabel("soyad                 "),gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(new JLabel("yaş   "),gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        panel.add(new JLabel("boy"),gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(),gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(),gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(),gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(),gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Adres"),gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(),gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(new JButton("Listeye Ekle"),gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(new JButton("+"),gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(new JButton("-"),gbc);

        return panel;

    }

    private JPanel panel2()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createLineBorder(null));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextArea(10,20),gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextField(10),gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(new JButton("Ara"),gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(new JButton("dosyayı kaydet"),gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(new JButton("Kopyala"),gbc);

        return panel;

    }


    public static void main(String[] args) {
        Uyelik u = new Uyelik();
        u.setLocationRelativeTo(null);
        u.pack();
        u.setVisible(true);
    }
}
