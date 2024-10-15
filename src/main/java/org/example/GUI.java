package org.example;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        // Bild
        ImageIcon image = new ImageIcon("img_1.png");       //Bild wird erstellt
        
        // Panels
        JPanel redPanel = new JPanel();                             // Panel wird erstellt
        redPanel.setBounds(0, 0, 100, 100);        // Panel Maße werden bestimmt
        redPanel.setBackground(Color.red);                          // Panel Farbe

        JPanel bluePanel = new JPanel();                            // Panel wird erstellt
        bluePanel.setBounds(100, 0, 100, 100);     // Panel Maße werden bestimmt
        bluePanel.setBackground(Color.blue);                        // Panel Farbe

        JPanel greenPanel = new JPanel();                           // Panel wird erstellt
        greenPanel.setBounds(0, 100, 200, 100);    // Panel Maße werden bestimmt
        greenPanel.setBackground(Color.green);                      // Panel Farbe

        //Label
        JLabel label = new JLabel();                                // Label wird erstellt
        label.setText("Wassermelone");                              // Text wird erstellt
        label.setIcon(image);                                       // Bild wird hinzugefügt
        label.setHorizontalTextPosition(JLabel.CENTER);             // Horizontale Textpositionierung
        label.setVerticalTextPosition(JLabel.TOP);                  // Vertikale Textpositionierung
        label.setIconTextGap(-18);                                  // Bild und Text Entfernung
        label.setBounds(0, 200, 180, 180);         // Position, Breite und Höhe bestimmen
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.CENTER);

        // Frame mit neuer Klasse
        new MyFrame( label,  bluePanel,  greenPanel,  redPanel);

        //Frame
//        JFrame frame = new JFrame();                                // Frame wird erstellt
//        frame.setTitle("Erste gute GUI");                           // Titel
//        frame.setSize(750, 750);                                    // Breite und Höhe einstellen
//        frame.setVisible(true);                                     // Frame sichtbar machen
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // Frame schließbar machen
//        frame.add(label);                                           // Label in die Frame einfügen
//        frame.add(bluePanel);                                       // Panel in die Frame einfügen
//        frame.add(greenPanel);                                      // Panel in die Frame einfügen
//        frame.add(redPanel);                                        // Panel in die Frame einfügen
//        frame.setLayout(null);                                      // Ungenutztes Feld ist weiß

    }

}
