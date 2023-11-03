package Game;



import GUI.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConfiguracionGUI configuracionGUI = new ConfiguracionGUI();
            configuracionGUI.setVisible(true);
        });
    }

    public static class ConfiguracionGUI extends JFrame {
        private JComboBox<String> guiComboBox;
        private JComboBox<String> criatura1ComboBox;
        private JComboBox<String> criatura2ComboBox;
        private JButton aplicarButton;

        public ConfiguracionGUI() {
            setTitle("Configuración");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            JPanel comboBoxPanel = new JPanel(new GridLayout(3, 2));

            comboBoxPanel.add(new JLabel("Tipo de GUI:"));
            guiComboBox = new JComboBox<>(new String[]{"Sega", "Xbox", "Nintendo"});
            comboBoxPanel.add(guiComboBox);

            comboBoxPanel.add(new JLabel("Criatura 1:"));
            criatura1ComboBox = new JComboBox<>(new String[]{"HumanFactory", "MagicFactory"});
            comboBoxPanel.add(criatura1ComboBox);

            comboBoxPanel.add(new JLabel("Criatura 2:"));
            criatura2ComboBox = new JComboBox<>(new String[]{"HumanFactory", "MagicFactory"});
            comboBoxPanel.add(criatura2ComboBox);

            add(comboBoxPanel, BorderLayout.CENTER);

            aplicarButton = new JButton("Aplicar");
            aplicarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    aplicarConfiguracion();
                }
            });
            add(aplicarButton, BorderLayout.SOUTH);
        }

        private void aplicarConfiguracion() {
            String tipoGUI = (String) guiComboBox.getSelectedItem();
            String tipoCriatura1 = (String) criatura1ComboBox.getSelectedItem();
            String tipoCriatura2 = (String) criatura2ComboBox.getSelectedItem();

            GUIFactory guiFactory = crearGUIFactory(tipoGUI);
            AbstractFactory criatura1Factory = crearCreatureFactory(tipoCriatura1);
            AbstractFactory criatura2Factory = crearCreatureFactory(tipoCriatura2);

            setVisible(false);
            dispose();

            Application app = new Application(guiFactory, criatura1Factory, criatura2Factory);
            app.createGUI();
        }

        private GUIFactory crearGUIFactory(String tipoGUI) {
            switch (tipoGUI) {
                case "Sega": return new SegaGUIFactory();
                case "Xbox": return new XboxGUIFactory();
                case "Nintendo": return new NintendoGUIFactory();
                default: return null;
            }
        }

        private AbstractFactory crearCreatureFactory(String tipoCriatura) {
            switch (tipoCriatura) {
                case "HumanFactory": return new HumanFactory();
                case "MagicFactory": return new MagicFactory();
                default: return null;
            }
        }
    }
}
