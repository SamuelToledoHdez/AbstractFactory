package Game;



import GUI.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {

        GUIFactory factory;
        factory = new SegaGUIFactory();
        AbstractFactory factoria;
        factoria = new HumanFactory();
        Applicattion app = new Applicattion(factory,factoria);
        app.createGUI();



    };

}