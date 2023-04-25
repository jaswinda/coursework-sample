package coursework2.views;

import coursework2.components.MyCustomButton;
import coursework2.components.MyCustomLabel;
import coursework2.components.MyCustomTextField;

import javax.swing.*;
import java.awt.*;

public class AddDebitCard extends JFrame {
    MyCustomTextField t1, t2, t3, t4, t5, t6;
    MyCustomButton b1, b2;
    MyCustomLabel l1, l2, l3, l4, l5, l6, l7;
    public AddDebitCard(){
        super("Add Debit Card");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();

        l1 = new MyCustomLabel("Add Debit Card");
        l2 = new MyCustomLabel("Balance Amount");
        l3 = new MyCustomLabel("Card Id");
        l4 = new MyCustomLabel("Bank Account");
        l5 = new MyCustomLabel("Issue Bank");
        l6 = new MyCustomLabel("Client Name");
        l7 = new MyCustomLabel("Pin Number");

        t1 = new MyCustomTextField("");
        t2 = new MyCustomTextField("");
        t3 = new MyCustomTextField("");
        t4 = new MyCustomTextField("");
        t5 = new MyCustomTextField("");
        t6 = new MyCustomTextField("");

        b1 = new MyCustomButton("Add");
        b2 = new MyCustomButton("Clear");

        b1.addActionListener(e -> {

        });

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gbl);

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
        panel.add(t1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(t2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(t3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(t4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(l6, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(t5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(l7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(t6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(b2, gbc);


        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(b1, gbc);

        add(panel);
    }
}
