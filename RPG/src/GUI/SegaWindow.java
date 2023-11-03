package GUI;


import java.awt.*;
import java.awt.Color;

public class SegaWindow extends Window {
    public SegaWindow(String title) {
        super(title);
        setColor();
        setLogo("IMG/SEGA.png");
    }

    @Override
    public void setColor() {
        getFrame().getContentPane().setBackground(Color.decode("#003366"));
    }

    @Override
    public Color getLabelColor() {
        return getFrame().getContentPane().getBackground();
    }

    @Override
    public Color getTextColor() {
        return Color.RED; // Color de SegaButton
    }
}

