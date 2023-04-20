package views;

import components.MyCustomButton;

import javax.swing.*;

public class Home extends JFrame {
    public  MyCustomButton b1, b2, b3, b4, b5;
    public Home() {
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel pane = new JPanel();
        b1 = new MyCustomButton("Add Debit Card");
        b2 = new MyCustomButton("Add Credit Card");
        b3 = new MyCustomButton("Withdraw");
        b4 = new MyCustomButton("Set Credit Limit");
        b5 = new MyCustomButton("Cancel Credit Card");
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        pane.add(b5);

        add(pane);
    }

}
