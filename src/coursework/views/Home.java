package coursework.views;

import coursework.components.MyCustomButton;

import javax.swing.*;

public class Home extends JFrame {

    public MyCustomButton b1, b2;

    public  Home(){
        super("Home");
        setVisible(true);
        JPanel panel = new JPanel();
        b1 = new MyCustomButton("Add Credit Card");
        b2 = new MyCustomButton("Add Debit Card");
        panel.add(b1);
        panel.add(b2);
        add(panel);
    }
}
