package gridbaglayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.1.2016.
 */
public class GridBagDemo extends JFrame{

    public GridBagDemo() {
        initGUI();
    }

    public void initGUI() {

        setTitle("");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        this.getContentPane().add(panel);

        JTable table = new JTable(null);
        JLabel label = new JLabel("My things");

        JPanel tableButtonPanel = new JPanel();
        tableButtonPanel.add(new JButton("Add things"));
        tableButtonPanel.add(new JButton("Delete things"));
        tableButtonPanel.add(new JButton("Modify Things"));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Print"));
        buttonPanel.add(new JButton("history"));
        buttonPanel.add(new JButton("Preferences"));
        buttonPanel.add(new JButton("Another button"));
        buttonPanel.add(new JButton("add another"));
        buttonPanel.add(new JButton("yet another"));

        //JPanel detailsPanel = new JPanel();
        //detailsPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx =0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(label,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JScrollPane(table),gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(tableButtonPanel,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(buttonPanel,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        panel.add(createDetailsPanel(),gbc);

        this.pack();
        this.setVisible(true);
    }

    private JPanel createDetailsPanel()
    {
        JPanel panel = new JPanel();

        JLabel thingNameLabel = new JLabel("Thing Name");
        JLabel anAttributeLabel = new JLabel("An Attribute");
        JLabel dateFieldLabel = new JLabel("Date Field");
        JLabel anAttLabel = new JLabel("an Att");
        JLabel anotherAttLabel = new JLabel("Another1 Att");
        JLabel anotherAtt2Label = new JLabel("Another2 Att");

        JTextField thingNameField = new JTextField("Thing Name");
        JTextField anAttributeField = new JTextField("An Attribute");
        JTextField dateFieldField = new JTextField("Date Field");
        JTextField anAttField = new JTextField("An Att");
        JTextArea anotherAttField = new JTextArea(2,10);
        JTextField anotherAtt2Field = new JTextField("Another Att");

        JCheckBox checkbox1 = new JCheckBox("A Checkbox");
        JCheckBox checkbox2 = new JCheckBox("A Checkbox");

        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(2,2,2,2);


        int i = 0;
        gbc.gridx = 0;
        gbc.gridy = i;
        gbc.anchor = GridBagConstraints.NORTH;
        panel.add(thingNameLabel,  gbc);

        gbc.gridx = 1;
        gbc.gridy = i;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(thingNameField,  gbc);

        i++;

        gbc.gridx = 1;
        gbc.gridy = i;
        panel.add(checkbox1,  gbc);

        i++;

        gbc.gridx = 0;
        gbc.gridy = i;
        panel.add(anAttributeLabel,  gbc);

        gbc.gridx = 1;
        gbc.gridy = i;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(anAttributeField,  gbc);

        i++;

        gbc.gridx = 0;
        gbc.gridy = i;
        panel.add(dateFieldLabel,  gbc);

        gbc.gridx = 1;
        gbc.gridy = i;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(dateFieldField,  gbc);

        i++;

        gbc.gridx = 0;
        gbc.gridy = i;
        panel.add(anAttLabel,  gbc);

        gbc.gridx = 1;
        gbc.gridy = i;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(anAttField,  gbc);

        i++;

        gbc.gridx = 0;
        gbc.gridy = i;
        panel.add(anotherAttLabel,  gbc);

        gbc.gridx = 1;
        gbc.gridy = i;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(anotherAttField,  gbc);

        i++;
        gbc.gridx = 0;
        gbc.gridy = i;
        panel.add(anotherAtt2Label,  gbc);

        gbc.gridx = 1;
        gbc.gridy = i;
        gbc.gridwidth = 1;
        //gbc.fill = GridBagConstraints.NONE;
        panel.add(anotherAtt2Field,  gbc);

        gbc.gridx = 2;
        gbc.gridy = i;
        panel.add(checkbox2,  gbc);


        return panel;
    }

    public static void main(String[] args) {
        GridBagDemo demo = new GridBagDemo();
        demo.pack();
        demo.setVisible(true);
    }
}
