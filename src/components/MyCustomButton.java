package components;

import javax.swing.*;
import  java.awt.*;

public class MyCustomButton extends JButton {

    public MyCustomButton(String text) {
        super(text);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setMargin(new Insets(10, 10, 10, 10));
        setFont(new Font("Arial", Font.BOLD, 20));

    }
}
