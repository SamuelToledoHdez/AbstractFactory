package GUI;

import javax.swing.*;
import java.awt.*;

public abstract class Window {
    JFrame frame;
    JPanel logoPanel;

    public Window(String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        frame.add(logoPanel, BorderLayout.NORTH);
    }

    public abstract void setColor();

    public void addComponent(Component component) {
        frame.add(component, BorderLayout.SOUTH);
    }


    public void display() {
        frame.setSize(750, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void setLogo(String logoPath) {
        ImageIcon logoIcon = new ImageIcon(getClass().getResource(logoPath));
        JLabel logoLabel = new JLabel(logoIcon);
        logoPanel.add(logoLabel);
        logoPanel.setBackground(frame.getContentPane().getBackground());
    }
}
