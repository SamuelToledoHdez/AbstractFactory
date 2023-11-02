package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public abstract class Window {
    private JPanel contentPanel;
    private JPanel creature1Panel;
    private JPanel creature2Panel;
    private JFrame frame;
    private JPanel logoPanel;

    public Window(String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        frame.add(logoPanel, BorderLayout.NORTH);

        contentPanel = new JPanel(new FlowLayout()); // Utiliza FlowLayout en lugar de GridLayout
        creature1Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); // Margen izquierdo de 10 píxeles
        creature2Panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0)); // Margen derecho de 10 píxeles
        int marginLeftRight = 100;
        creature1Panel.setBorder(new EmptyBorder(10, 100, 10, 100));
        creature2Panel.setBorder(new EmptyBorder(10, 100, 10, 100));


        // Configura el color de fondo de los paneles
        frame.add(creature1Panel, BorderLayout.WEST); // Coloca creature1Panel a la izquierda
        frame.add(creature2Panel, BorderLayout.EAST);

    }

    public abstract void setColor();

    public void addComponent(Component component) {
        frame.add(component, BorderLayout.SOUTH);
    }

    public void display() {
        frame.setSize(1000, 750);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();

    }

    public void setLogo(String logoPath) {
        ImageIcon logoIcon = new ImageIcon(getClass().getResource(logoPath));
        JLabel logoLabel = new JLabel(logoIcon);
        logoPanel.add(logoLabel);
        logoPanel.setBackground(frame.getContentPane().getBackground());
    }

    public void showCreatureStats(String vida1, String dano1, String robo1, String tokens1,
                                  String vida2, String dano2, String robo2, String tokens2) {

        creature1Panel.removeAll(); // Elimina todas las etiquetas anteriores
        creature2Panel.removeAll();
        creature1Panel.setLayout(new GridLayout(0, 1)); // Cambia a GridLayout con una sola columna
        creature2Panel.setLayout(new GridLayout(0, 1)); // Cambia a GridLayout con una sola columna

        Font labelFont = new Font("Arial", Font.PLAIN, 30); // Establece un tamaño de fuente más grande

        JLabel vidaLabel1 = new JLabel(vida1);
        JLabel danoLabel1 = new JLabel(dano1);
        JLabel roboLabel1 = new JLabel(robo1);
        JLabel tokensLabel1 = new JLabel(tokens1);

        JLabel vidaLabel2 = new JLabel(vida2);
        JLabel danoLabel2 = new JLabel(dano2);
        JLabel roboLabel2 = new JLabel(robo2);
        JLabel tokensLabel2 = new JLabel(tokens2);

        vidaLabel1.setForeground(Color.RED);
        danoLabel1.setForeground(Color.RED);
        roboLabel1.setForeground(Color.RED);
        tokensLabel1.setForeground(Color.RED);

        vidaLabel2.setForeground(Color.RED);
        danoLabel2.setForeground(Color.RED);
        roboLabel2.setForeground(Color.RED);
        tokensLabel2.setForeground(Color.RED);

        // Aplica el tamaño de fuente a los JLabel
        vidaLabel1.setFont(labelFont);
        danoLabel1.setFont(labelFont);
        roboLabel1.setFont(labelFont);
        tokensLabel1.setFont(labelFont);

        vidaLabel2.setFont(labelFont);
        danoLabel2.setFont(labelFont);
        roboLabel2.setFont(labelFont);
        tokensLabel2.setFont(labelFont);

        // Establece un color de texto para los JLabel


        creature1Panel.add(vidaLabel1);
        creature1Panel.add(danoLabel1);
        creature1Panel.add(roboLabel1);
        creature1Panel.add(tokensLabel1);

        creature2Panel.add(vidaLabel2);
        creature2Panel.add(danoLabel2);
        creature2Panel.add(roboLabel2);
        creature2Panel.add(tokensLabel2);

        frame.revalidate();
        frame.repaint();
    }


    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getLogoPanel() {
        return logoPanel;
    }

    public void setLogoPanel(JPanel logoPanel) {
        this.logoPanel = logoPanel;
    }

}