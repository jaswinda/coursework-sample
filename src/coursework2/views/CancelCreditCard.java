package coursework2.views;

import coursework2.components.MyCustomButton;
import coursework2.components.MyCustomLabel;
import coursework2.components.MyCustomTextField;

import javax.swing.*;
import java.awt.*;

public class CancelCreditCard extends JFrame {
    MyCustomLabel l1, l2;
    MyCustomButton b1, b2;
    MyCustomTextField t1;
    public CancelCreditCard(){
        super("Cancel Credit Card");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JPanel panel = new JPanel();

        l1 = new MyCustomLabel("Cancel Credit Card");
        l2 = new MyCustomLabel("Card Id");

        t1 = new MyCustomTextField("");

        b1 = new MyCustomButton("Submit");
        b2 = new MyCustomButton("Clear");

        b1.addActionListener(e -> {
            //clear();
        });

        b2.addActionListener(e -> {
            clear();
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
        gbc.gridwidth = 1;
        panel.add(t1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(b2, gbc);

        add(panel);
    }
    public void clear(){
        t1.setText("");
    }
}
