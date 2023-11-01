package GUI;

import javax.swing.*;
import java.awt.*;
public class XboxButton extends Button {
    public XboxButton(String label) {
        super(label);
        setColor();
        setForeground(Color.BLACK);
    }

    @Override
    public void setColor() {
        setBackground(Color.decode("#00FF33"));
    }
}