package GUI;

import javax.swing.*;
import java.awt.*;
public class SegaButton extends Button {
    public SegaButton(String label) {
        super(label);
        setColor();
        setForeground(Color.WHITE);
    }

    @Override
    public void setColor() {
        setBackground(Color.DARK_GRAY);
    }
}