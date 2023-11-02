package GUI;

import javax.swing.*;
import java.awt.*;
public class MainPrueba {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIFactory factory = new SegaGUIFactory(); // Prueba con Sega
            Application app = new Application(factory);
            app.createGUI();
        });
    }
}

class Application {
    private Window window;
    private Button button1;
    private Button button2;
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createGUI() {
        window = factory.createWindow("RPG");
        button1 = factory.createButton("Button 1");
        button2 = factory.createButton("Button 2");

        //Tamaño Botones
        Dimension buttonSize = new Dimension(135, 40);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        //Ventana con botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(window.frame.getContentPane().getBackground());  // Configurar el color de fondo del panel

        // Añadir el panel de botones a la ventana
        window.addComponent(buttonPanel);

        window.display();
    }
}