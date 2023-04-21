package components;

import javax.swing.*;

public class MyCustomButton extends JButton {

    public MyCustomButton(String text){
        super(text);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setMargin(new java.awt.Insets(10, 10, 10, 10));
    }
}
