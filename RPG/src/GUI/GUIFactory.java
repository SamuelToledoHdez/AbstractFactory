package GUI;

import javax.swing.*;
import java.awt.*;
public abstract class GUIFactory {
    public abstract Window createWindow(String title);
    public abstract Button createButton(String label);
}
