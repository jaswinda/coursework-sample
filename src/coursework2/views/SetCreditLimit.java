package coursework2.views;

import coursework2.components.MyCustomButton;
import coursework2.components.MyCustomLabel;
import coursework2.components.MyCustomTextField;

import javax.swing.*;
import java.awt.*;

public class SetCreditLimit extends JFrame {

    MyCustomButton b1, b2;
    MyCustomLabel  l1, l2, l3, l4;

    MyCustomTextField t1, t2, t3;

    public SetCreditLimit(){
        super("Set Credit Limit");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();

        l1 = new MyCustomLabel("Set Credit Limit");
        l2 = new MyCustomLabel("Card Id");
        l3 = new MyCustomLabel("New Credit Limit");
        l4 = new MyCustomLabel("New Grace Period");

        t1 = new MyCustomTextField("");
        t2 = new MyCustomTextField("");
        t3 = new MyCustomTextField("");

        b1 = new MyCustomButton("Set");
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
        panel.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(b2, gbc);

        add(panel);
    }

    public void clear(){
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
}
