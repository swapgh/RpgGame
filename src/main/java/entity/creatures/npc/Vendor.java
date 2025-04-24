package entity.creatures.npc;
import entity.base.Entity;
import game.ui.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
/**
 * Vendor es un NPC que representa a un vendedor.
 * Puede realizar acciones diferentes según la tecla presionada.
 */
public class Vendor extends Entity {
    public Vendor(GamePanel gp) {
        super(gp);
        System.out.println("        └── Vendor: Constructor");
    }

    public void openShop() {
        System.out.println("          → Vendor abre la tienda 🛒");
    }
    @Override
    public void handleInput(int keyCode) {
        if (keyCode == KeyEvent.VK_W) {
            System.out.println("Vendor sube en la lista de ítems");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);  // Color del vendor
        g.fillRect(getX(), getY(), 40, 40); // Dibujar un cuadrado
    }
}