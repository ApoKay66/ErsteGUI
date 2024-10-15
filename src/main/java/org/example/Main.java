package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        // Ein neues Fenster erstellen
        JFrame frame = new JFrame("Spielcharakter bewegen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Ein Panel erstellen, das den Spielcharakter enthält
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.setVisible(true);

        // Fokussieren, damit Tastatur-Events funktionieren
        gamePanel.requestFocusInWindow();
    }
}

class GamePanel extends JPanel {
    private int charX = 150; // Anfangsposition des Charakters (x-Koordinate)
    private int charY = 150; // Anfangsposition des Charakters (y-Koordinate)
    private final int MOVE_STEP = 10; // Schrittweite pro Tastendruck
    private Image characterImage; // Bild des Charakters

    public GamePanel() {
        // Setze die bevorzugte Größe des Panels
        this.setPreferredSize(new Dimension(400, 400));

        // Lade das Bild des Charakters
        characterImage = new ImageIcon("character.png").getImage();

        // Tastatur-Listener hinzufügen, um den Charakter zu bewegen
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (charY - MOVE_STEP >= 0) {
                            charY -= MOVE_STEP;
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (charY + MOVE_STEP + characterImage.getHeight(null) <= getHeight()) {
                            charY += MOVE_STEP;
                        }
                        break;
                    case KeyEvent.VK_LEFT:
                        if (charX - MOVE_STEP >= 0) {
                            charX -= MOVE_STEP;
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (charX + MOVE_STEP + characterImage.getWidth(null) <= getWidth()) {
                            charX += MOVE_STEP;
                        }
                        break;
                }
                // Panel neu zeichnen, nachdem der Charakter bewegt wurde
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Hintergrundfarbe setzen
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Spielcharakter (Mensch) zeichnen
        g.drawImage(characterImage, charX, charY, this);
    }
}



