package GUI;


import java.awt.*;
public class XboxWindow extends Window {
    public XboxWindow(String title) {
        super(title);
        setColor();
        setLogo("IMG/XBOX.png");
    }

    @Override
    public void setColor() {
        frame.getContentPane().setBackground(Color.decode("#1b2631"));
    }
}
