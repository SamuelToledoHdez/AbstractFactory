package GUI;

import javax.swing.*;
import java.awt.*;
public abstract class Button extends JButton {
    public Button(String label) {
        super(label);
    }

    public abstract void setColor();
}
