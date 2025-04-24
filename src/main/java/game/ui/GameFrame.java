package game.ui;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame(GamePanel panel) {
        System.out.println("    └── GameFrame: Constructor con panel recibido");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.add(panel);
        this.setVisible(true);
    }
}
