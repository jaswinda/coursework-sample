package coursework2.views;

import coursework2.components.MyCustomButton;
import coursework2.components.MyCustomLabel;
import coursework2.components.MyCustomTextField;

import javax.swing.*;
import java.awt.*;

public class AddCreditCard extends JFrame {
    MyCustomTextField t1, t2, t3, t4, t5, t6, t7, t8;
    MyCustomLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    MyCustomButton b1, b2;
    public AddCreditCard(){
        super("Add Credit Card");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gbl);

        l1 = new MyCustomLabel("Add Credit Card");
        l2 = new MyCustomLabel("Card Id");
        l3 = new MyCustomLabel("Client Name");
        l4 = new MyCustomLabel("Issue Bank");
        l5 = new MyCustomLabel("Bank Account");
        l6 = new MyCustomLabel("Balance Amount");
        l7 = new MyCustomLabel("CVC Number");
        l8 = new MyCustomLabel("Interest Rate");
        l9 = new MyCustomLabel("Expiration Date");

        t1 = new MyCustomTextField("");
        t2 = new MyCustomTextField("");
        t3 = new MyCustomTextField("");
        t4 = new MyCustomTextField("");
        t5 = new MyCustomTextField("");
        t6 = new MyCustomTextField("");
        t7 = new MyCustomTextField("");
        t8 = new MyCustomTextField("");


        b1 = new MyCustomButton("Add");
        b2 = new MyCustomButton("Clear");

        b1.addActionListener(e -> {

        });

        b2.addActionListener(e -> {
            clear();
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(l1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(t1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(t2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        panel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        panel.add(t3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(t4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        panel.add(l6, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        panel.add(t5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        panel.add(l7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        panel.add(t6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        panel.add(l8, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        panel.add(t7, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        panel.add(l9, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        panel.add(t8, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        panel.add(b2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        panel.add(b1, gbc);

        add(panel);
    }

    public void clear(){
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
    }
}
