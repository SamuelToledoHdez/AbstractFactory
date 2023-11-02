package GUI;


import java.awt.*;
public class NintendoWindow extends Window {
    public NintendoWindow(String title) {
        super(title);
        setColor();
        setLogo("IMG/NINT.png");
    }

    @Override
    public void setColor() {
        frame.getContentPane().setBackground(Color.decode("#a6acaf"));
    }
}
