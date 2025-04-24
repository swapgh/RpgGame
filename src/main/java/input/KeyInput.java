package input;

import entity.base.Entity;

import game.ui.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

    private GamePanel gp;

    public KeyInput(GamePanel gp) {
        this.gp = gp;
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Llamar a handleInput de cada entidad
        for (Entity entity : gp.getEntityManager().getEntities()) {
            entity.handleInput(key);
        }

        // Repintar el panel después de que las entidades se hayan actualizado
        gp.repaint();
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}
