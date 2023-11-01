package GUI;


import java.awt.*;
public class SegaWindow extends Window {
    public SegaWindow(String title) {
        super(title);
        setColor();
    }

    @Override
    public void setColor() {
        frame.getContentPane().setBackground(Color.decode("#003366"));
    }
}
