package GUI;

import javax.swing.*;
import java.awt.*;
public class NintendoButton extends Button {
    public NintendoButton(String label) {
        super(label);
        setColor();
        setForeground(Color.BLACK);
    }

    @Override
    public void setColor() {
        setBackground(Color.decode("#d32f2f"));
    }
}