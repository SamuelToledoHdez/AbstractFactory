package GUI;

import javax.swing.*;
import java.awt.*;
public class NintendoWindow extends Window {
    public NintendoWindow(String title) {
        super(title);
        setColor();
    }

    @Override
    public void setColor() {
        frame.getContentPane().setBackground(Color.decode("#a6acaf"));
    }
}
