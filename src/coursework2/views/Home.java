package coursework2.views;

import javax.swing.*;
import coursework2.components.MyCustomButton;

public class Home extends JFrame {
    MyCustomButton b1, b2, b3, b4, b5, b6;
    public Home(){
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();
        b1 = new MyCustomButton("Add Debit Card");
        b2 = new MyCustomButton("Add Credit Card");
        b3 = new MyCustomButton("Withdraw from Debit Card");
        b4 = new MyCustomButton("Set the credit limit");
        b5 = new MyCustomButton("Cancel credit card");
        b6 = new MyCustomButton("Display");

        b1.addActionListener(e -> {
            new AddDebitCard();
        });

        b2.addActionListener(e -> {
            new AddCreditCard();
        });


        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);


        add(panel);
    }
}
