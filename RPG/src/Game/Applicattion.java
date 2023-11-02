package Game;

import GUI.Button;
import GUI.GUIFactory;
import GUI.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Applicattion {
    private Window window;
    private Button button1;
    private Button button2;
    private GUIFactory factory;
    private AbstractFactory factoria;
    private Creatures criatura1;
    private Creatures criatura2;
    private Weapon weapon1;
    private Weapon weapon2;
    private Token token1;
    private Token token2;


    public Applicattion(GUIFactory factory, AbstractFactory factorias) {
        this.factory = factory;
        this.factoria = factorias;
    }

    public void createGUI() {
        window = factory.createWindow("RPG");
        button1 = factory.createButton("LUCHAR 1");
        button2 = factory.createButton("LUCHAR 2");
        criatura1 = factoria.creatureBuild();
        criatura2 = factoria.creatureBuild();
        weapon1 = factoria.weaponBuild();
        weapon2 = factoria.weaponBuild();
        token1 = factoria.tokenBuild();
        token2 = factoria.tokenBuild();

        //Tamaño Botones
        Dimension buttonSize = new Dimension(135, 40);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        //Ventana con botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(window.getFrame().getContentPane().getBackground());  // Configurar el color de fondo del panel

        // Añadir el panel de botones a la ventana
        window.addComponent(buttonPanel);
        window.showCreatureStats("Vida: " + criatura1.getVida(), "Daño: " + weapon1.getDano(), "Robo: " + weapon1.getRobo(), "Tokens: " + token1.getCantidad(),
                "Vida: " + criatura2.getVida(), "Daño: " + weapon2.getDano(), "Robo: " + weapon2.getRobo(), "Tokens: " + token2.getCantidad());

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualiza las estadísticas de criatura 1 en la ventana
                updateCreatureStats(criatura2,weapon2,token2,criatura1,weapon1,token1);

            }
        });

        // Agregar ActionListener al botón 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualiza las estadísticas de criatura 2 en la ventana
                updateCreatureStats(criatura1,weapon1,token1,criatura2,weapon2,token2);
            }
        });

        window.display();
    }
    private void updateCreatureStats(Creatures criatura, Weapon arma, Token dinero, Creatures criaturas2, Weapon armas2, Token dineros2) {
        // Supongamos que puedes obtener las estadísticas de la criatura a través de sus métodos

        double nuevaVida = criatura.getVida() - armas2.getDano();
        double nuevoDinero = dinero.getCantidad() - armas2.getRobo();

        // Verifica si la nueva vida sería negativa y si es así, establece la vida en 0
        if (nuevaVida < 0) {
            nuevaVida = 0;
        }

        // Verifica si el nuevo dinero sería negativo y si es así, establece el dinero en 0
        if (nuevoDinero < 0) {
            nuevoDinero = 0;
        }

        criatura.setVida(nuevaVida);
        dinero.setCantidad(nuevoDinero);

        // Actualiza las etiquetas en la ventana con las estadísticas
        window.showCreatureStats("Vida: " + criatura1.getVida(), "Daño: " + weapon1.getDano(), "Robo: " + weapon1.getRobo(), "Tokens: " + token1.getCantidad(),
                "Vida: " + criatura2.getVida(), "Daño: " + weapon2.getDano(), "Robo: " + weapon2.getRobo(), "Tokens: " + token2.getCantidad());
    }


}