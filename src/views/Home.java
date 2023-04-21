package views;

import components.MyCustomButton;

import javax.swing.*;

public class Home extends JFrame {
 public  MyCustomButton b1, b2;
    public  Home(){
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();

        b1= new MyCustomButton("Add Debit Card");
        b2 = new MyCustomButton("Add Credit Card");
        panel.add(b1);
        panel.add(b2);

        add(panel);
    }
}
