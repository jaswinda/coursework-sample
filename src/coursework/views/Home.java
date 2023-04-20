package coursework.views;

import coursework.components.MyCustomButton;

import javax.swing.*;

public class Home extends JFrame {

    public  Home(){
        super("Home");
        setVisible(true);
        JPanel panel = new JPanel();
        MyCustomButton button1 = new MyCustomButton("Add Credit Card");


        MyCustomButton button2 = new MyCustomButton("Add Debit Card");


        panel.add(button1);
        panel.add(button2);
        add(panel);
    }
}
