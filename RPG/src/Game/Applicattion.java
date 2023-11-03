package Game;

import GUI.Button;
import GUI.GUIFactory;
import GUI.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

class Application {
    private Window window;
    private Button button1;
    private Button button2;
    private GUIFactory factory;
    private AbstractFactory criatura1Factory;
    private AbstractFactory criatura2Factory;
    private Creatures criatura1;
    private Creatures criatura2;
    private Weapon weapon1;
    private Weapon weapon2;
    private Token token1;
    private Token token2;
    private JLabel creature1Label;
    private JLabel creature2Label;

    public Application(GUIFactory factory, AbstractFactory criatura1Factory, AbstractFactory criatura2Factory) {
        this.factory = factory;
        this.criatura1Factory = criatura1Factory;
        this.criatura2Factory = criatura2Factory;
        creature1Label = new JLabel();
        creature2Label = new JLabel();
    }

    public void createGUI() {
        window = factory.createWindow("RPG");
        button1 = factory.createButton("LUCHAR 1");
        button2 = factory.createButton("LUCHAR 2");
        criatura1 = criatura1Factory.creatureBuild();
        criatura2 = criatura2Factory.creatureBuild();
        weapon1 = criatura1Factory.weaponBuild();
        weapon2 = criatura2Factory.weaponBuild();
        token1 = criatura1Factory.tokenBuild();
        token2 = criatura2Factory.tokenBuild();

        Dimension buttonSize = new Dimension(135, 40);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(window.getFrame().getContentPane().getBackground());

        window.addComponent(buttonPanel);
        window.showCreatureStats("Vida: " + criatura1.getVida(), "Daño: " + weapon1.getDano(), "Robo: " + weapon1.getRobo(), "Tokens: " + token1.getCantidad(),
                "Vida: " + criatura2.getVida(), "Daño: " + weapon2.getDano(), "Robo: " + weapon2.getRobo(), "Tokens: " + token2.getCantidad());

        button1.addActionListener(e -> updateCreatureStats(criatura2, weapon2, token2, criatura1, weapon1, token1));
        button2.addActionListener(e -> updateCreatureStats(criatura1, weapon1, token1, criatura2, weapon2, token2));

        creature1Label.setIcon(new ImageIcon(getClass().getResource(criatura1.getImagePath())));
        creature2Label.setIcon(new ImageIcon(getClass().getResource(criatura2.getImagePath())));
        creature1Label.setHorizontalAlignment(JLabel.CENTER);
        creature2Label.setHorizontalAlignment(JLabel.CENTER);
        window.getCreature1Panel().add(creature1Label);
        window.getCreature2Panel().add(creature2Label);

        window.display();
    }

    private void updateCreatureStats(Creatures criatura, Weapon arma, Token dinero, Creatures criaturas2, Weapon armas2, Token dineros2) {
        double nuevaVida = criatura.getVida() - armas2.getDano();
        double nuevoDinero = dinero.getCantidad() - armas2.getRobo();

        if (nuevaVida < 0) {
            nuevaVida = 0;
        }

        if (nuevoDinero < 0) {
            nuevoDinero = 0;
        }

        criatura.setVida(nuevaVida);
        dinero.setCantidad(nuevoDinero);

        window.showCreatureStats("Vida: " + criatura1.getVida(), "Daño: " + weapon1.getDano(), "Robo: " + weapon1.getRobo(), "Tokens: " + token1.getCantidad(),
                "Vida: " + criatura2.getVida(), "Daño: " + weapon2.getDano(), "Robo: " + weapon2.getRobo(), "Tokens: " + token2.getCantidad());

        // Asegúrate de que los GIFs aún estén en su lugar
        if (creature1Label.getParent() == null) {
            window.getCreature1Panel().add(creature1Label);
        }
        if (creature2Label.getParent() == null) {
            window.getCreature2Panel().add(creature2Label);
        }

        // Actualiza la UI
        window.getFrame().revalidate();
        window.getFrame().repaint();
    }
}


