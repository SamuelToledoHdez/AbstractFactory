package GUI;


import java.awt.*;
public class XboxWindow extends Window {
    public XboxWindow(String title) {
        super(title);
        setColor();
    }

    @Override
    public void setColor() {
        frame.getContentPane().setBackground(Color.decode("#1b2631"));
    }
}
