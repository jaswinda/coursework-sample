package views;

import javax.swing.*;
import components.MyCustomButton;

public class Home extends JFrame {

    public Home(){
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();
        MyCustomButton button = new MyCustomButton("Add Debit Card");
        panel.add(button);

        MyCustomButton button1 = new MyCustomButton("Add Credit Card");
        panel.add(button1);

        add(panel);

    }
}
