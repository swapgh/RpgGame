package input;

import entity.base.Entity;
import entity.creatures.npc.Vendor;
import entity.player.Player;
import enums.GameState;
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

        // Cambiar de estado con números
        switch (key) {
            case KeyEvent.VK_1 -> gp.setCurrentState(GameState.GAMEPLAY);
            case KeyEvent.VK_2 -> gp.setCurrentState(GameState.SHOP);
            case KeyEvent.VK_3 -> gp.setCurrentState(GameState.BATTLE);
        }

        GameState state = gp.getCurrentState();

        switch (state) {
            case GAMEPLAY -> {
                for (Entity entity : gp.getEntityManager().getAll()) {
                    entity.handleInput(key);
                }
            }
            case SHOP -> {
                for (Vendor v : gp.getEntityManager().getEntitiesOfType(Vendor.class)) {
                    v.handleInput(key);
                }
            }
            case BATTLE -> {
                for (Player p : gp.getEntityManager().getEntitiesOfType(Player.class)) {
                    p.handleBattleInput(key);
                }
            }
        }
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}
