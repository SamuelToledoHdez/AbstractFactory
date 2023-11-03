package GUI;


import java.awt.*;
import java.awt.Color;

public class NintendoWindow extends Window {
    public NintendoWindow(String title) {
        super(title);
        setColor();
        setLogo("IMG/NINT.png");
    }

    @Override
    public void setColor() {
        getFrame().getContentPane().setBackground(Color.decode("#a6acaf"));
    }

    @Override
    public Color getLabelColor() {
        return getFrame().getContentPane().getBackground();
    }

    @Override
    public Color getTextColor() {
        return Color.decode("#d32f2f"); // Color de NintendoButton
    }
}
