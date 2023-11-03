package GUI;


import java.awt.Color;

public class XboxWindow extends Window {
    public XboxWindow(String title) {
        super(title);
        setColor();
        setLogo("IMG/XBOX.png");
    }

    @Override
    public void setColor() {
        getFrame().getContentPane().setBackground(Color.decode("#1b2631"));
    }

    @Override
    public Color getLabelColor() {
        return getFrame().getContentPane().getBackground();
    }

    @Override
    public Color getTextColor() {
        return Color.decode("#00FF33"); // Color de XboxButton
    }
}

