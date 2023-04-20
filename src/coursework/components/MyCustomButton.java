package coursework.components;

import javax.swing.*;
import java.awt.*;

public class MyCustomButton extends JButton {
    public MyCustomButton(String text){
        super(text);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.BLACK);
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setFocusPainted(false);

    }
}
