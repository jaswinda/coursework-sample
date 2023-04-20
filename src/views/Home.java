package views;

import components.MyCustomButton;

import javax.swing.*;

public class Home extends JFrame {

    public Home() {
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel pane = new JPanel();
        MyCustomButton button = new MyCustomButton("Add Debit Card");
        pane.add(button);
        MyCustomButton button1 = new MyCustomButton("Add Debit Card");
        pane.add(button1);
        add(pane);
    }

}
