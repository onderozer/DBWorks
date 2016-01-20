package gridbaglayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.1.2016.
 */
public class Loginwindow extends JFrame {

    public Loginwindow(){

        initGUI();

    }

    private void initGUI() {

        this.setTitle("Welcom Login Window");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(250,200));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        this.getContentPane().add(mainPanel);

        JPanel logoPanel = new JPanel();
        logoPanel.setBorder(BorderFactory.createLineBorder(Color.blue));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3,3,3,3);

        JLabel adLbl = new JLabel("Kullanıcı Adı :");
        JLabel sifrelbl = new JLabel("Şifre :");
        JLabel dummyLbl = new JLabel("     ");
        JTextField adTxt = new JTextField();
        JPasswordField soyadTxt = new JPasswordField();

        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        gbc.gridx = 0;
        gbc.gridy = 0;
        //gbc.anchor = GridBagConstraints.NORTH;
        mainPanel.add(adLbl,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(sifrelbl,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        //gbc.gridheight = 2;
        //gbc.fill = GridBagConstraints.VERTICAL;
        mainPanel.add(logoPanel,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(adTxt,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //soyadTxt.setPreferredSize(new Dimension(50,10));
        mainPanel.add(soyadTxt,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(okBtn,gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(cancelBtn,gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        //dummyLbl.setVisible(false);
        mainPanel.add(dummyLbl,gbc);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Loginwindow lg = new Loginwindow();
        lg.pack();
        lg.setVisible(true);
    }
}
