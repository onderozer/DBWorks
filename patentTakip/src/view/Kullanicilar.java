package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.1.2016.
 */
public class Kullanicilar extends JFrame {

    public Kullanicilar(){

        initGUI();
    }

    private void initGUI() {

        this.setTitle("Kullanıcı Ekleme Formu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(250,200));

        JPanel mainpanel = new JPanel();
        this.getContentPane().add(mainpanel);
        mainpanel.add(panel1());

        this.pack();
        this.setVisible(true);
    }

    private JPanel panel1()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(2,2,2,2);

        JLabel kullaniciAdilbl = new JLabel("Kullanıcı Adı :");
        JLabel sifrelbl = new JLabel("Şifre :");
        JLabel adilbl = new JLabel("Adı :");
        JLabel soyadilbl = new JLabel("Soyadı :");
        JLabel yetkilbl = new JLabel("Yetki :");
        JTextField kullaniciAditxt = new JTextField();
        JPasswordField sifrepsw = new JPasswordField();
        JTextField aditxt = new JTextField();
        JTextField soyaditxt = new JTextField();
        JComboBox yetkicmb = new JComboBox();
        JButton okbtn = new JButton("Tamam");
        JButton cancelbtn = new JButton("Çıkış");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(kullaniciAdilbl,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(kullaniciAditxt,gbc);

        gbc.gridx = 0;
        gbc.gridy =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(sifrelbl,gbc);

        gbc.gridx = 1;
        gbc.gridy =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(sifrepsw,gbc);

        gbc.gridx = 0;
        gbc.gridy =2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(adilbl,gbc);

        gbc.gridx = 1;
        gbc.gridy =2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(aditxt,gbc);

        gbc.gridx = 0;
        gbc.gridy =3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(soyadilbl,gbc);

        gbc.gridx = 1;
        gbc.gridy =3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(soyaditxt,gbc);

        gbc.gridx = 0;
        gbc.gridy =4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(yetkilbl,gbc);

        gbc.gridx = 1;
        gbc.gridy =4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(yetkicmb,gbc);

        gbc.gridx = 0;
        gbc.gridy =5;
        panel.add(okbtn,gbc);

        gbc.gridx = 1;
        gbc.gridy =5;
        panel.add(cancelbtn,gbc);
        return panel;
    }


    public static void main(String[] args) {
        Kullanicilar u = new Kullanicilar();
        u.setLocationRelativeTo(null);
        //u.pack();
        //u.setVisible(true);
    }
}
