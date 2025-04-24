package entity.creatures.npc;

import entity.base.Entity;
import game.ui.GamePanel;

import java.awt.*;

public class Npc extends Entity {
    public Npc(GamePanel gp) {
        super(gp);
        System.out.println("        └── NPC: Constructor");
        speak();
    }

    public void speak() {
        System.out.println("        └── NPC dice: ¡Hola, soy un NPC!");
    }
    @Override
    public void paintComponent(Graphics g) {
        // Dibujar el NPC como un cuadrado de color azul
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50); // Dibujar un cuadrado de 50x50 en la posición (x, y)
    }

    @Override
    public void handleInput(int keyCode) {
        // Definir las acciones específicas del NPC si es necesario
    }
}


