package GUI;

import javax.swing.*;
import java.awt.*;
public abstract class Window {
    protected JFrame frame;

    public Window(String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
    }

    public abstract void setColor();

    public void addComponent(Component component) {
        frame.add(component, BorderLayout.SOUTH);
    }

    public void display() {
        frame.setVisible(true);
    }
}
