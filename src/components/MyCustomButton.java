package components;

import javax.swing.*;
import java.awt.*;

public class MyCustomButton extends JButton {

    public MyCustomButton(String text) {
        super(text);
        setFont(new Font("Arial", Font.BOLD, 20));
        setForeground(Color.BLACK);
        setBackground(Color.BLACK);

    }
}
