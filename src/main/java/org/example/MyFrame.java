package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    int count = 0;
    MyFrame(JLabel label, JPanel bluePanel, JPanel greenPanel, JPanel redPanel){
        ImageIcon daumen = new ImageIcon("img_3.png");

        button = new JButton();                                    // Knopf wird erstellt
        button.setBounds(200, 100, 300, 200);     // Breit und Höhe vom Knopf
//        button.addActionListener(e -> System.out.println("poo"));  // Lambda Ausdruck, printet poo aus, wenn Knopf
        button.addActionListener(this);
        button.setText("Don't push me");                           // Text der im Knopf steht
        button.setFocusable(false);                                // Rand um den Text bestimmen
        button.setIcon(daumen);                                    // Bild in Knopf einfügen
        button.setHorizontalTextPosition(JButton.LEFT);            // Text vom Knopf bewegen
        button.setForeground(Color.YELLOW);                        // Farbe Text
        button.setBackground(Color.red);                           // Farbe Hintergrund
        button.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLUE));     // Rand Farbe, Schatten
//        button.setEnabled(false);                                  // An- /Ausschalten vom Knopf
        this.setTitle("Erste gute GUI");                           // Titel
        this.setSize(750, 750);                        // Breite und Höhe einstellen
        this.setVisible(true);                                     // Frame sichtbar machen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // Frame schließbar machen
        this.add(label);                                           // Label in die Frame einfügen
        this.add(bluePanel);                                       // Panel in die Frame einfügen
        this.add(greenPanel);                                      // Panel in die Frame einfügen
        this.add(redPanel);                                        // Panel in die Frame einfügen
        this.setLayout(null);                                      // Ungenutztes Feld ist weiß
        this.add(button);                                          // Fügt den Knopf dem Frame hinzu
    }

    @Override      // man kann es mit einem Lamda Expression e-> sout"poo" ersetzen (implements muss abr dann weg)
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            System.out.println("poo");
            count++;
            System.out.println(count);
        }
    }
}
